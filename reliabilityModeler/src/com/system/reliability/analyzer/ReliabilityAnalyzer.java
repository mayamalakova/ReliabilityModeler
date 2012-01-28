package com.system.reliability.analyzer;

import java.util.Scanner;

import com.reliability.system.GeneralizedNet;
import com.system.reliability.modeler.utils.ReliabilityModelUtils;

public class ReliabilityAnalyzer {
	private static GeneralizedNet systemModel = null;
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean quit = false;
		while (!quit) {
			displayMenu();
			int selection = scanner.nextInt();
			
			switch (selection) {
			case 1:
				readModel();
				break;

			case 2:
				estimateReliability();
				break;
				
			default:
				quit = true;
				break;
			}
		}
		
	}


	private static void estimateReliability() {
		// TODO Auto-generated method stub
		System.out.println("Not yet implemented");
	}


	private static void readModel() {
		System.out.println("Enter model file location: ");
		String fileLocation = scanner.next();
		systemModel = ReliabilityModelUtils.createModelFromFile(fileLocation);
		if (systemModel  != null) {
			System.out.println(systemModel.getName());
		}
		
	}


	private static void displayMenu() {
			System.out.println("Select action:");
			System.out.println("1  -Read model");
			System.out.println("2 - Estimate reliability");
			System.out.println("3 - Quit");
	}
	
	
	
}
