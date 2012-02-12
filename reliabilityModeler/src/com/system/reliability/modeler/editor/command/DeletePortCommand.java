package com.system.reliability.modeler.editor.command;

import com.reliability.system.GeneralizedNet;
import com.reliability.system.view.PortView;
import com.reliability.system.view.ViewObject;

public class DeletePortCommand extends DeleteViewObjectCommand {
	private PortView port;
	private GeneralizedNet parent;

	@Override
	public void execute() {
		parent.getPositions().remove(port);
		detachLinks();
	}

	@Override
	public void undo() {
		parent.getPositions().add(port);
		reattachLinks();
	}

	public void setPort(PortView port) {
		this.port = port;
		parent = port.getOwner();
	}

	@Override
	protected ViewObject getSelectedObject() {
		return port;
	}
}
