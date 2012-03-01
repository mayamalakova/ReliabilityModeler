package com.system.reliability.modeler.editor.command;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;

import com.reliability.system.view.ViewLink;
import com.system.reliability.modeler.editor.part.TransitionEditPart;
import com.system.reliability.modeler.editor.part.ViewObjectEditPart;

public class ReconnectTargetCommand extends Command {

	private ViewLink link;
	private ViewObjectEditPart target;
	private Point location;
	
	@Override
	public boolean canExecute() {
		return target != null && target instanceof TransitionEditPart;
	}

	@Override
	public void execute() {
		link.getTargetAnchor().setLocation(location);
		target.updateAnchor(link.getTargetAnchor());
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		super.undo();
	}

	public void setTarget(ViewObjectEditPart target) {
		this.target = target;
	}
	
	public void setLink(ViewLink link) {
		this.link = link;
	}
	
	public void setLocation(Point location) {
		this.location = location;
	}
	
}
