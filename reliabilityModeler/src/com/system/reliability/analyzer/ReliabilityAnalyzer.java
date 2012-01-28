package com.system.reliability.analyzer;

import java.util.List;
import java.util.Scanner;

import com.reliability.system.Failure;
import com.reliability.system.GeneralizedNet;
import com.reliability.system.Port;
import com.reliability.system.Position;
import com.reliability.system.TransitionMatrixElement;
import com.system.reliability.modeler.utils.ReliabilityModelUtils;

public class ReliabilityAnalyzer {
	private  GeneralizedNet systemModel = null;

	public  void estimateReliability() {
		// TODO Auto-generated method stub
		System.out.println("Not yet implemented");
		
		List<Port> systemInputs = ReliabilityModelUtils.getSystemInputs(systemModel);
		displayPortList(systemInputs);
		for (Port systemInput: systemInputs) {
			findAllFailurePaths(new TransitionPath(systemInput), systemInput);
		}
	}

	public void readModel(String fileLocation) {
		systemModel = ReliabilityModelUtils.createModelFromFile(fileLocation);
	}

	public GeneralizedNet getSystemModel() {
		return systemModel;
	}
	
	public void findAllFailurePaths(TransitionPath currentPath, Position currentPosition) {
		if (currentPosition instanceof Failure) {
			currentPath.displayPath();
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
				analyzer.estimateReliability();
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
	
}
