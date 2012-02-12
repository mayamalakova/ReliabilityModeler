package com.system.reliability.modeler.editor.command;

import com.reliability.system.GeneralizedNet;
import com.reliability.system.view.TransitionView;
import com.reliability.system.view.ViewObject;

public class DeleteTransitionCommand extends DeleteViewObjectCommand{
	 private TransitionView transition;
	  private GeneralizedNet parent;
	 
	  @Override
	  public void execute() {
		  parent.getTransitions().remove(transition);
		  detachLinks();
	  }
	 
	  @Override
	  public void undo() {
		  parent.getTransitions().add(transition);
		  reattachLinks();
	  }
	 
	  public void setTransition(TransitionView transition) {
	    this.transition = transition;
	    this.parent = transition.getOwner();
	  }

	@Override
	protected ViewObject getSelectedObject() {
		return transition;
	}
	  
}
