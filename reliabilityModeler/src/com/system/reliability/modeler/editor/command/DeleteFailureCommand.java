package com.system.reliability.modeler.editor.command;

import org.eclipse.gef.commands.Command;

import com.reliability.system.view.FailureView;
import com.reliability.system.view.TransitionView;
import com.reliability.system.view.ViewObject;

public class DeleteFailureCommand extends DeleteViewObjectCommand {
	private FailureView failure;
	private TransitionView parent;
	
	public void setFailure(FailureView selectedFailure) { 
		this.failure = selectedFailure;
		this.parent = (TransitionView) selectedFailure.getOwner();
		
		updateCommandList();
	}
	
	@Override
	protected void updateCommandList() {
		super.updateCommandList();
		Command deleteCommand = new Command() {
			@Override
			public boolean canExecute() {
				return failure != null;
			}
			
			public void execute() {
				parent.setFailureState(null);
			}
			
			@Override
			public void undo() {
				parent.setFailureState(failure);
			}
		};
		
		add(deleteCommand);
	}

	@Override
	protected ViewObject getSelectedObject() {
		return failure;
	}
	
}
