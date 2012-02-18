package com.system.reliability.modeler.editor.command;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;

import com.reliability.system.view.ViewLink;

public class MoveBendpointCommand extends Command {
	private Point oldLocation;
	private Point newLocation;
	private int index;
	private ViewLink link;

	public void execute() {
		if (oldLocation == null) {
			oldLocation = link.getBendpoints().get(index);
		}
		link.getBendpoints().set(index, newLocation);
	}

	@Override
	public void undo() {
		link.getBendpoints().set(index, oldLocation);
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public void setLink(ViewLink link) {
		this.link = link;
	}

	public void setLocation(Point newLocation) {
		this.newLocation = newLocation;
	}
}
