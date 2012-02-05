package com.system.reliability.modeler.editor.command;

import org.eclipse.gef.commands.Command;

import com.reliability.system.view.PortView;
import com.reliability.system.view.SystemView;

public class DeletePortCommand extends Command {
	 private PortView port;
	  private SystemView system;
	 
	  @Override
	  public void execute() {
		  system.getPorts().remove(port);
	  }
	 
	  @Override
	  public void undo() {
		  system.getPorts().add(port);
	  }
	 
	  public void setPort(PortView port) {
	    this.port = port;
	    this.system = port.getOwner();
	  }
	  
}
