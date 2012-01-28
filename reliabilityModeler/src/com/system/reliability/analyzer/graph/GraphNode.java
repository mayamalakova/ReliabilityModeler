package com.system.reliability.analyzer.graph;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.reliability.system.Position;
import com.reliability.system.TransitionMatrixElement;

public class GraphNode {
	private Position position;
	
	private Map<Position, TransitionMatrixElement> linkedNodes;
	
	public GraphNode(Position position) {
		this.position = position;
		linkedNodes = new HashMap<Position, TransitionMatrixElement>();
	}
	
	public void addLink(Position position) {
		
	}
}
