package com.system.reliability.analyzer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.reliability.system.Failure;
import com.reliability.system.Port;
import com.reliability.system.TransitionMatrixElement;

public class TransitionPath {
	private Port startPosition;
	private List<TransitionMatrixElement> route;
	private Set<String> positionsSet;
	private Failure failure;
	
	public TransitionPath(Port startPosition) {
		this.startPosition = startPosition;
		route = new ArrayList<TransitionMatrixElement>();
		positionsSet = new HashSet<String>();
	}
	
	public void addPosition(TransitionMatrixElement element) {
		route.add(element);
		positionsSet.add(element.getOppositePosition().getId());
		if (element.getOppositePosition() instanceof Failure){
			failure = (Failure) element.getOppositePosition();
		}
	}
	
	public boolean containsNode(TransitionMatrixElement element) {
		return positionsSet.contains(element.getOppositePosition().getId());
	}
	
	public Port getStartPosition() {
		return startPosition;
	}

	public  String toString() {
		StringBuilder builder = new StringBuilder("Path: ").append(startPosition.getId());
		for (TransitionMatrixElement node: route) {
			builder.append(" -<");
			builder.append(node.getNecessity());
			builder.append(", ");
			builder.append(node.getPossibility());
			builder.append(">- ");
			builder.append(node.getOppositePosition().getId());
		}
		
		return builder.toString();
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

	public Failure getFailure() {
		return failure;
	}
	
}
