package com.system.reliability.analyzer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.resource.Resource;

import com.reliability.system.Failure;
import com.reliability.system.GeneralizedNet;
import com.reliability.system.Port;
import com.reliability.system.Position;
import com.reliability.system.TransitionMatrixElement;
import com.system.reliability.modeler.utils.ReliabilityModelUtils;

public class ReliabilityAnalyzer {
	private static final Logger log = Logger.getLogger(ReliabilityAnalyzer.class);
	
	private  GeneralizedNet systemModel = null;
	private Resource resource = null;
	private Map<Port, ReliabilityProfile> reliabilityProfiles;

	public  Map<Port, ReliabilityProfile> estimateReliability() {
		List<Port> systemInputs = ReliabilityModelUtils.getSystemInputs(systemModel);
		displayPortList(systemInputs);
		reliabilityProfiles = new HashMap<Port, ReliabilityProfile>();
		for (Port systemInput: systemInputs) {
			ReliabilityProfile profile = new ReliabilityProfile();
			reliabilityProfiles.put(systemInput, profile);
			findAllFailurePaths(new TransitionPath(systemInput), systemInput);
		}
		/*********************************************************************/
		if (log.isInfoEnabled()) 	log.info("System Reliability Profile:\n" + ReliabilityModelUtils.getReliabilityProfilesText(reliabilityProfiles)); 
		/*********************************************************************/
		
		return reliabilityProfiles;
	}

	public void readModel(String fileLocation) {
		systemModel = (GeneralizedNet) ReliabilityModelUtils.createModelFromFile(fileLocation, resource);
	}

	public GeneralizedNet getSystemModel() {
		return systemModel;
	}
	
	public void setSysteModel(GeneralizedNet model) {
		systemModel = model;
	}
	
	public void findAllFailurePaths(TransitionPath currentPath, Position currentPosition) {
		if (currentPosition instanceof Failure) {
			/*********************************************************************/
			if (log.isDebugEnabled()) { log.debug(currentPath); }
			if (log.isDebugEnabled()) { log.debug(" Necessity for failure = " + currentPath.getReliability());  } //$NON-NLS-1$
			/*********************************************************************/
			ReliabilityProfile profile = reliabilityProfiles.get(currentPath.getStartPosition());
			profile.updateFailureNecessity(currentPath);
			return;
		}
		
		for (TransitionMatrixElement element: ((Port) currentPosition).getTransitionRow()) {
			if (!currentPath.containsNode(element) && element.getNecessity() > 0) {
				currentPath.addPosition(element);
				findAllFailurePaths(currentPath, element.getOppositePosition());
				currentPath.removeLastPosition();
			}
		}
	}
	
	public Map<Port, ReliabilityProfile> getReliabilityProfiles() {
		return reliabilityProfiles;
	}

	public static void main(String[] args) {
		ReliabilityAnalyzer analyzer = new ReliabilityAnalyzer();
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		while (!quit) {
			displayMenu();
			int selection = scanner.nextInt();
			
			switch (selection) {
			case 1:
				System.out.println("Enter model file location: "); 
				String fileLocation = scanner.next();
				analyzer.readModel(fileLocation);
				if (analyzer.getSystemModel()  != null) {
					System.out.println(analyzer.getSystemModel().getName());
				}
				break;

			case 2:
				Map<Port, ReliabilityProfile> reliabilityProfiles = analyzer.estimateReliability();
				String result = ReliabilityModelUtils.getReliabilityProfilesText(reliabilityProfiles);
				System.out.println(result);
				break;
				
			default:
				quit = true;
				break;
			}
		}
		
	}

	private static void displayMenu() {
			System.out.println("Select action:"); //$NON-NLS-1$
			System.out.println("1  -Read model"); //$NON-NLS-1$
			System.out.println("2 - Estimate reliability"); //$NON-NLS-1$
			System.out.println("3 - Quit"); //$NON-NLS-1$
	}
	
	private static void displayPortList(List<Port> ports){
		StringBuilder sb = new StringBuilder();
		for (Port port: ports) {
			sb.append("Port " + port.getId() + ", "); //$NON-NLS-1$ //$NON-NLS-2$
		}
		
		sb.delete(sb.length() - 1, sb.length());
		System.out.println("System inputs: " + sb.toString()); //$NON-NLS-1$
	}
	
}
