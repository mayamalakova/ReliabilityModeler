package com.system.reliability.modeler.editor.command;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import com.reliability.system.GeneralizedNet;
import com.reliability.system.Port;
import com.reliability.system.view.PortView;

public class CreatePortCommand extends Command {

	private static final Dimension DEFAULT_DIMENSION = new Dimension(40, 65);
	private static final String DEFAULT_NAME = "L";
	
	protected PortView newPort; 
	private Rectangle constraints;
	private GeneralizedNet parent;

	@Override
	public void execute() {
		newPort.setId(getDefaultId());
		if (constraints != null) {
			newPort.setConstraints(constraints);
		}
		if (parent != null) {
			parent.getPositions().add(newPort);
		}
	}
	
	@Override
	public void undo() {
		super.undo();
		parent.getPositions().remove(newPort);
	}


	public void setLocation(Point location) {
	    constraints = new Rectangle(location, DEFAULT_DIMENSION);
	  }
	
	public void setPort(PortView port){
		newPort = port;
	}
	
	public void setParent(GeneralizedNet system) {
		parent = system;
	}
	
	private String getDefaultId() {
		Set<String> portNames = new HashSet<String>();
		for (Port port: parent.getPositions()) {
			portNames.add(port.getId());
		}
		
		StringBuilder nameBuilder = new StringBuilder(DEFAULT_NAME + 1);
		int i = 1;
		while (portNames.contains(nameBuilder.toString())) {
			nameBuilder.replace(nameBuilder.length() - 1, nameBuilder.length(), "" + (i++));
		}

		return nameBuilder.toString();
	}
}
