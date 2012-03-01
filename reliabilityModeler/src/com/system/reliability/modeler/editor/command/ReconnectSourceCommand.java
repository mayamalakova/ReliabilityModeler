package com.system.reliability.modeler.editor.command;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;

import com.reliability.system.view.ViewLink;
import com.system.reliability.modeler.editor.part.TransitionEditPart;
import com.system.reliability.modeler.editor.part.ViewObjectEditPart;

public class ReconnectSourceCommand extends Command {

	private ViewLink link;
	private ViewObjectEditPart source;
	private Point location;
	
	@Override
	public boolean canExecute() {
		return source != null && source instanceof TransitionEditPart; 
	}

	@Override
	public void execute() {
		link.getSourceAnchor().setLocation(location);
		source.updateAnchor(link.getSourceAnchor());
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		super.undo();
	}

	public void setSource(ViewObjectEditPart source) {
		this.source = source;
	}
	
	public void setLink(ViewLink link) {
		this.link = link;
	}
	
	public void setLocation(Point location) {
		this.location = location;
	}
	
}
