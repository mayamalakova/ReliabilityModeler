package com.system.reliability.modeler.editor.command;

import org.eclipse.gef.commands.CompoundCommand;

import com.reliability.system.view.ViewLink;
import com.reliability.system.view.ViewObject;

public abstract class DeleteViewObjectCommand extends CompoundCommand {
	
	protected abstract ViewObject getSelectedObject();

	protected void updateCommandList() {
		for (ViewLink link : getSelectedObject().getIncomingLinks()) {
			add(new DeleteLinkCommand(link));
		}
		
		for (ViewLink link : getSelectedObject().getOutgoingLinks()) {
			add(new DeleteLinkCommand(link));
		}
	}
	
}
