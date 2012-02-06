package com.system.reliability.modeler.editor.command;

import com.reliability.system.view.SystemView;
import com.reliability.system.view.TransitionView;
import com.reliability.system.view.ViewObject;

public class DeleteTransitionCommand extends DeleteViewObjectCommand{
	 private TransitionView transition;
	  private SystemView system;
	 
	  @Override
	  public void execute() {
		  system.getTransitions().remove(transition);
		  detachLinks();
	  }
	 
	  @Override
	  public void undo() {
		  system.getTransitions().add(transition);
		  reattachLinks();
	  }
	 
	  public void setTransition(TransitionView transition) {
	    this.transition = transition;
	    this.system = transition.getOwner();
	  }

	@Override
	protected ViewObject getSelectedObject() {
		return transition;
	}
	  
}
