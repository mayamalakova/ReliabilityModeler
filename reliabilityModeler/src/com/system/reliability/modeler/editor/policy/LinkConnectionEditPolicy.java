package com.system.reliability.modeler.editor.policy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ConnectionEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

import com.reliability.system.view.ViewLink;
import com.system.reliability.modeler.editor.command.DeleteLinkCommand;

public class LinkConnectionEditPolicy extends ConnectionEditPolicy {

	@Override
	protected Command getDeleteCommand(GroupRequest request) {
		DeleteLinkCommand command = new DeleteLinkCommand();
		command.setLink((ViewLink) getHost().getModel());
		return command;
	}

}
