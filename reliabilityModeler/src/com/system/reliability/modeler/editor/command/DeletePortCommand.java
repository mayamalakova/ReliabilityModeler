package com.system.reliability.modeler.editor.command;

import org.eclipse.gef.commands.Command;

import com.reliability.system.GeneralizedNet;
import com.reliability.system.view.PortView;
import com.reliability.system.view.ViewObject;

public class DeletePortCommand extends DeleteViewObjectCommand {
	private PortView port;
	private GeneralizedNet parent;

	public void setPort(PortView port) {
		this.port = port;
		parent = port.getOwner();
		updateCommandList();
	}
	
	@Override
	protected void updateCommandList() {
		super.updateCommandList();
		Command deleteCommand = new Command() {
			@Override
			public void execute() {
				parent.getPositions().remove(port);
			}
			
			@Override
			public void undo() {
				parent.getPositions().add(port);
			}
		};
		
		add(deleteCommand);
	}

	@Override
	protected ViewObject getSelectedObject() {
		return port;
	}
}
