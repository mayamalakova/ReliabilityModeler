package com.system.reliability.modeler.editor.command;

import org.eclipse.gef.commands.Command;

import com.reliability.system.view.ViewObject;

public class RenameTransitionCommand extends Command {
	private String oldName, newName;
	private ViewObject model;

	@Override
	public void execute() {
		oldName = model.getLabel();
		model.setLabel(newName);
	}

	@Override
	public void undo() {
		model.setLabel(oldName);
	}

	public void setNewName(String newName) {
		this.newName = newName;
	}

	public void setModel(ViewObject model) {
		this.model = model;
	}
}
