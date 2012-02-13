package com.system.reliability.modeler.editor.command;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import com.reliability.system.view.FailureView;
import com.reliability.system.view.TransitionView;
import com.reliability.system.view.ViewFactory;
import com.reliability.system.view.ViewLink;

public class CreateFailureCommand extends Command {

	private static final Dimension DEFAULT_DIMENSION = new Dimension(44, 44);
	private static final String DEFAULT_NAME = "M";
	
	protected FailureView newFailure; 
	private Rectangle constraints;
	private TransitionView parent;
	private ViewLink link;

	@Override
	public void execute() {
		newFailure.setId(DEFAULT_NAME);
		if (constraints != null) {
			newFailure.setConstraints(constraints);
		}
		link = ViewFactory.eINSTANCE.createViewLink();
		link.setSource(parent);
		link.setTarget(newFailure);
		parent.setFailureState(newFailure);
	}
	
	@Override
	public void undo() {
		parent.setFailureState(null);
		link.setSource(null);
		link.setTarget(null);
	}


	public void setLocation(Point location) {
	    constraints = new Rectangle(location, DEFAULT_DIMENSION);
	  }
	
	public void setFailure(FailureView failure){
		newFailure = failure;
	}
	
	public void setParent(TransitionView transition) {
		parent = transition;
	}

	@Override
	public boolean canExecute() {
		if (!(parent instanceof TransitionView)) {
			return false;
		}
		
		if (((TransitionView) parent).getFailureState() != null) {
			return false;
		}
		
		return true;
	}
	
	
}
