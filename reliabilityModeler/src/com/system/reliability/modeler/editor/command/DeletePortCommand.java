package com.system.reliability.modeler.editor.command;

import com.reliability.system.GeneralizedNet;
import com.reliability.system.view.PortView;
import com.reliability.system.view.ViewObject;

public class DeletePortCommand extends DeleteViewObjectCommand {
	private PortView port;
	private GeneralizedNet system;

	@Override
	public void execute() {
		system.getPositions().remove(port);
		detachLinks();
	}

	@Override
	public void undo() {
		system.getPositions().add(port);
		reattachLinks();
	}

	public void setPort(PortView port) {
		this.port = port;
//		this.system = port.getOwner();
	}

	@Override
	protected ViewObject getSelectedObject() {
		return port;
	}

}
