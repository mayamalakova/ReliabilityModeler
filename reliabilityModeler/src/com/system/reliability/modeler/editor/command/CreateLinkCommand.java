package com.system.reliability.modeler.editor.command;

import org.eclipse.gef.commands.Command;

import com.reliability.system.view.SystemView;
import com.reliability.system.view.ViewLink;
import com.reliability.system.view.ViewObject;

public class CreateLinkCommand extends Command {
	private SystemView model;
	private ViewLink link;
	private ViewObject source;
	private ViewObject target;

	@Override
	public boolean canExecute() {
		return source != null && target != null && link != null;
	}

	@Override
	public void execute() {
		link.setSource(source);
		link.setTarget(target);
	}

	@Override
	public void undo() {
		link.getSource().getOutgoingLinks().remove(link);
		link.setSource(null);
		link.getTarget().getIncomingLinks().remove(link);
		link.setTarget(null);
	}

	public void setTarget(ViewObject target) {
		this.target = target;
	}

	public void setSource(ViewObject source) {
		this.source = source;
	}

	public void setLink(ViewLink link) {
		this.link = link;
	}
}
