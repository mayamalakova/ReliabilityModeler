package com.system.reliability.modeler.editor.command;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import com.reliability.system.GeneralizedNet;
import com.reliability.system.Transition;
import com.reliability.system.view.TransitionView;

public class CreateTransitionCommand extends Command {

	private static final Dimension DEFAULT_DIMENSION = new Dimension(100, 100);
	
	protected TransitionView newTransition; 
	private Rectangle constraints;
	private GeneralizedNet parent;

	@Override
	public void execute() {
		newTransition.setName(getDefaultName());
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
	
	public void setParent(GeneralizedNet system) {
		parent = system;
	}
	
	private String getDefaultName() {
		Set<String> transitionNames = new HashSet<String>();
		for (Transition transition: parent.getTransitions()) {
			transitionNames.add(transition.getName());
		}
		
		StringBuilder nameBuilder = new StringBuilder(newTransition.getType().toString() + 1);
		int i = 2;
		while (transitionNames.contains(nameBuilder.toString())) {
			nameBuilder.replace(nameBuilder.length() - 1, nameBuilder.length(), "" + (i++));
		}

		return nameBuilder.toString();
	}
	
}
