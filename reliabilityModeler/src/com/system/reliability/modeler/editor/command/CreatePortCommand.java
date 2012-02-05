package com.system.reliability.modeler.editor.command;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import com.reliability.system.view.PortView;
import com.reliability.system.view.SystemView;

public class CreatePortCommand extends Command {

	private static final Dimension DEFAULT_DIMENSION = new Dimension(100, 100);
	private static final String DEFAULT_NAME = "<...>";
	
	protected PortView newPort; 
	private Rectangle constraints;
	private SystemView parent;

	@Override
	public void execute() {
		newPort.setId(DEFAULT_NAME);
		if (constraints != null) {
			newPort.setConstraints(constraints);
		}
		if (parent != null) {
			parent.getPorts().add(newPort);
		}
	}
	
	@Override
	public void undo() {
		super.undo();
		parent.getPorts().remove(newPort);
	}


	public void setLocation(Point location) {
	    constraints = new Rectangle(location, DEFAULT_DIMENSION);
	  }
	
	public void setPort(PortView port){
		newPort = port;
	}
	
	public void setParent(SystemView system) {
		parent = system;
	}
	
}