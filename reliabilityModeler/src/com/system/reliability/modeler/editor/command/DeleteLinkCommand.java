package com.system.reliability.modeler.editor.command;

import org.eclipse.gef.commands.Command;

import com.reliability.system.Failure;
import com.reliability.system.view.ViewLink;
import com.reliability.system.view.ViewObject;

public class DeleteLinkCommand extends Command {
	private ViewLink link;
	private ViewObject source;
	private ViewObject target;

	@Override
	public boolean canExecute() {
		return validate();
	}

	@Override
	public void execute() {
		source = link.getSource();
		target = link.getTarget();
		link.setSource(null);
		link.setTarget(null);
	}

	@Override
	public void undo() {
		link.setSource(source);
		link.setTarget(target);
	}

	public void setLink(ViewLink link) {
		this.link = link;
	}
	
	private boolean validate() {
		if (link == null) {
			return false;
		}
		
		if (source instanceof Failure || target instanceof Failure) {
			return false;
		}
		
		return true;
	}
}
