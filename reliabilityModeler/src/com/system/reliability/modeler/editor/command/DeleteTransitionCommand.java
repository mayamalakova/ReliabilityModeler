package com.system.reliability.modeler.editor.command;

import org.eclipse.gef.commands.Command;

import com.reliability.system.view.SystemView;
import com.reliability.system.view.TransitionView;

public class DeleteTransitionCommand extends Command{
	 private TransitionView transition;
	  private SystemView system;
	 
	  @Override
	  public void execute() {
		  system.getTransitions().remove(transition);
	  }
	 
	  @Override
	  public void undo() {
		  system.getTransitions().add(transition);
	  }
	 
	  public void setTransition(TransitionView transition) {
	    this.transition = transition;
	    this.system = transition.getOwner();
	  }
	  
}
