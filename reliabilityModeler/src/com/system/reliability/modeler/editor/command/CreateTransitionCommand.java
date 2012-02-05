package com.system.reliability.modeler.editor.command;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import com.reliability.view.view.SystemView;
import com.reliability.view.view.TransitionView;

public abstract class CreateTransitionCommand extends Command {

	private static final Dimension DEFAULT_DIMENSION = new Dimension(100, 100);
	private static final String DEFAULT_NAME = "<...>";
	
	protected TransitionView newTransition; 
	private Rectangle constraints;
	private SystemView parent;

	@Override
	public void execute() {
		newTransition.setName(DEFAULT_NAME);
		if (constraints != null) {
			newTransition.setConstraints(constraints);
		}
		if (parent != null) {
			parent.getTransitions().add(newTransition);
		}
	}
	
	@Override
	public void undo() {
		super.undo();
		parent.getTransitions().remove(newTransition);
	}


	public void setLocation(Point location) {
	    constraints = new Rectangle(location, DEFAULT_DIMENSION);
	  }
	
	public void setTransition(TransitionView transition){
		newTransition = transition;
	}
	
	public void setParent(SystemView system) {
		parent = system;
	}
}
