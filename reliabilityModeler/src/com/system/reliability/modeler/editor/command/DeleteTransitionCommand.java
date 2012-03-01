package com.system.reliability.modeler.editor.command;

import org.eclipse.gef.commands.Command;

import com.reliability.system.GeneralizedNet;
import com.reliability.system.view.FailureView;
import com.reliability.system.view.TransitionView;
import com.reliability.system.view.ViewObject;

public class DeleteTransitionCommand extends DeleteViewObjectCommand {
	private TransitionView transition;
	private GeneralizedNet parent;

	public void setTransition(TransitionView transition) {
		this.transition = transition;
		this.parent = transition.getOwner();
		updateCommandList();
	}

	@Override
	protected void updateCommandList() {
		super.updateCommandList();
		
		//delete failure state if present
		if (transition.getFailureState() != null) {
			DeleteFailureCommand deleteFailureCommand = new DeleteFailureCommand();
			deleteFailureCommand.setFailure((FailureView) transition.getFailureState());
			add(deleteFailureCommand);
		}
		
		Command deleteCommand = new Command() {
			@Override
			public void execute() {
				parent.getTransitions().remove(transition);
			}

			@Override
			public void undo() {
				parent.getTransitions().add(transition);
			}
		};
		
		add(deleteCommand);
	}
	
	@Override
	protected ViewObject getSelectedObject() {
		return transition;
	}

}
