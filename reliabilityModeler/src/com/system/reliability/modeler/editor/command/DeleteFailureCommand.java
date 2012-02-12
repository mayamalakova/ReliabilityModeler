package com.system.reliability.modeler.editor.command;

import org.eclipse.gef.commands.Command;

import com.reliability.system.view.FailureView;
import com.reliability.system.view.TransitionView;
import com.reliability.system.view.ViewLink;

public class DeleteFailureCommand extends Command {
	private FailureView failure;
	private ViewLink link;
	private TransitionView parent;
	
	public void execute() {
		link.setSource(null);
		link.setTarget(null);
		parent.setFailureState(null);
	}
	
	@Override
	public void undo() {
		link.setTarget(failure);
		link.setSource(parent);
		parent.setFailureState(failure);
	}
	
	public void setFailure(FailureView failure) { 
		this.failure = failure;
		this.link = failure.getIncomingLinks().get(0);
		this.parent = (TransitionView) failure.getOwner();
	}

	@Override
	public boolean canExecute() {
		return failure != null;
	}
	
}
