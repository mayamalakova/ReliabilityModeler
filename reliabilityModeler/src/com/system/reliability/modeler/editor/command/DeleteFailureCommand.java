package com.system.reliability.modeler.editor.command;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;

import com.reliability.system.view.FailureView;
import com.reliability.system.view.TransitionView;
import com.reliability.system.view.ViewLink;

public class DeleteFailureCommand extends CompoundCommand {
	private FailureView failure;
	private ViewLink link;
	private TransitionView parent;
	
	@Override
	public List<Command> getCommands() {
		List<Command> commands = new ArrayList<Command>();
		return commands;
	}
	
	public void setFailure(FailureView selectedFailure) { 
		this.failure = selectedFailure;
		this.link = selectedFailure.getIncomingLinks().get(0);
		this.parent = (TransitionView) selectedFailure.getOwner();
		
		add(new DeleteLinkCommand(link));
		
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
	
}
