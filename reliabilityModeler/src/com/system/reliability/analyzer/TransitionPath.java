package com.system.reliability.analyzer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.reliability.system.Port;
import com.reliability.system.TransitionMatrixElement;

public class TransitionPath {
	private Port startPosition;
	private List<TransitionMatrixElement> route;
	private Set<String> positionsSet;
	
	public TransitionPath(Port startPosition) {
		this.startPosition = startPosition;
		route = new ArrayList<TransitionMatrixElement>();
		positionsSet = new HashSet<String>();
	}
	
	public void addPosition(TransitionMatrixElement element) {
		route.add(element);
		positionsSet.add(element.getOppositePosition().getId());
	}
	
	public boolean containsNode(TransitionMatrixElement element) {
		return positionsSet.contains(element.getOppositePosition().getId());
	}
	
	public Port getStartPosition() {
		return startPosition;
	}

	public  void displayPath() {
		System.out.print("Path: " + startPosition.getId() );
		for (TransitionMatrixElement node: route) {
			System.out.print(" -<" + node.getNecessity() + ", " + node.getPossibility() + ">- " + node.getOppositePosition().getId());
		}
		System.out.println(" Reliability = " + getReliability());
	}
	
	public void removeLastPosition() {
		TransitionMatrixElement element = route.remove(route.size() - 1);
		positionsSet.remove(element.getOppositePosition().getId());
	}
	
	public float getReliability() {
		float result = Float.MAX_VALUE;
		for (TransitionMatrixElement element: route) {
			if (result > element.getNecessity()) {
				result = element.getNecessity();
			}
		}
		
		return result;
	}
	
}
