package com.system.reliability.modeler.editor.command;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;

import com.reliability.system.view.ViewLink;

public class DeleteBendpointCommand extends Command {
	private ViewLink link;
	private int index;
	private Point location;

	@Override
	public boolean canExecute() {
		return (link != null) && (link.getBendpoints().size() > index);
	}

	@Override
	public void execute() {
		location = link.getBendpoints().get(index);
		link.getBendpoints().remove(index);
	}

	@Override
	public void undo() {
		link.getBendpoints().add(index, location);
	}

	public void setIndex(final int index) {
		this.index = index;
	}

	public void setLink(final ViewLink link) {
		this.link = link;
	}
}
