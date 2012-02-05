package com.system.reliability.modeler.editor.command;

import org.eclipse.gef.commands.Command;

import com.reliability.system.view.TransitionView;

public class RenameTransitionCommand extends Command {
	private String oldName, newName;
	private TransitionView model;

	@Override
	public void execute() {
		oldName = model.getName();
		model.setName(newName);
	}

	@Override
	public void undo() {
		model.setName(oldName);
	}

	public void setNewName(String newName) {
		this.newName = newName;
	}

	public void setModel(TransitionView model) {
		this.model = model;
	}
}
