package com.system.reliability.modeler.editor.command;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import com.reliability.system.view.ViewObject;

public class ChangeConstraintCommand extends Command {
	private Rectangle oldConstraint;
	private Rectangle newConstraint;
	private ViewObject model;

	@Override
	public void execute() {
		if (oldConstraint == null) {
			oldConstraint = model.getConstraints();
		}
		model.setConstraints(newConstraint);
	}

	@Override
	public void undo() {
		model.setConstraints(oldConstraint);
	}

	public void setModel(ViewObject model) {
		this.model = model;
	}

	public void setNewConstraint(Rectangle newConstraint) {
		this.newConstraint = newConstraint;
	}

}
