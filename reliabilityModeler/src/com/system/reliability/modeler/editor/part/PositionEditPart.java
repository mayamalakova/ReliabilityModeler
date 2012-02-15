package com.system.reliability.modeler.editor.part;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.Request;

import com.system.reliability.modeler.editor.figure.IPositionFigure;

public abstract class PositionEditPart extends ViewObjectEditPart {

	public ConnectionAnchor getSourceConnectionAnchor(ConnectionEditPart connection) {
	    return ((IPositionFigure)getFigure()).getConnectionAnchor();
	  }
	 
	  public ConnectionAnchor getTargetConnectionAnchor(ConnectionEditPart connection) {
	    return ((IPositionFigure)getFigure()).getConnectionAnchor();
	  }
	 
	  @Override 
	  public ConnectionAnchor getSourceConnectionAnchor(Request request) {
	    return ((IPositionFigure)getFigure()).getConnectionAnchor();
	  }
	 
	  @Override 
	  public ConnectionAnchor getTargetConnectionAnchor(Request request) {
	    return ((IPositionFigure)getFigure()).getConnectionAnchor();
	  } 
}
