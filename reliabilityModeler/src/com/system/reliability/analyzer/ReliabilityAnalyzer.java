package com.system.reliability.analyzer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.eclipse.emf.ecore.resource.Resource;

import com.reliability.system.Failure;
import com.reliability.system.GeneralizedNet;
import com.reliability.system.Port;
import com.reliability.system.Position;
import com.reliability.system.TransitionMatrixElement;
import com.system.reliability.modeler.utils.ReliabilityModelUtils;

public class ReliabilityAnalyzer {
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
			System.out.print(currentPath);
			System.out.println(" Necessity for failure = " + currentPath.getReliability());
			ReliabilityProfile profile = reliabilityProfiles.get(currentPath.getStartPosition());
			profile.updateFailureNecessity(currentPath);
			return;
		}
		
		for (TransitionMatrixElement element: ((Port) currentPosition).getTransitionRow()) {
			if (!currentPath.containsNode(element)) {
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
				displayReliabilityProfiles(reliabilityProfiles);
				break;
				
			default:
				quit = true;
				break;
			}
		}
		
	}

	private static void displayMenu() {
			System.out.println("Select action:");
			System.out.println("1  -Read model");
			System.out.println("2 - Estimate reliability");
			System.out.println("3 - Quit");
	}
	
	private static void displayPortList(List<Port> ports){
		StringBuilder sb = new StringBuilder();
		for (Port port: ports) {
			sb.append("Port " + port.getId() + ", ");
		}
		
		sb.delete(sb.length() - 1, sb.length());
		System.out.println("System inputs: " + sb.toString());
	}
	
	private static void displayReliabilityProfiles(Map<Port, ReliabilityProfile> reliabilityProfiles) {
		for (Port port: reliabilityProfiles.keySet()) {
			ReliabilityProfile profile = reliabilityProfiles.get(port);
			System.out.println("Input: " + port.getId() + " - " + profile);
		}
	}
	
}
