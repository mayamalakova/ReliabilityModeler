package com.system.reliability.modeler.editor.policy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.ReconnectRequest;

import com.reliability.system.view.ViewLink;
import com.reliability.system.view.ViewObject;
import com.system.reliability.modeler.editor.command.CreateLinkCommand;

public class GraphicalViewObjectEditPolicy extends GraphicalNodeEditPolicy {

	@Override
	protected Command getConnectionCompleteCommand(CreateConnectionRequest request) {
		CreateLinkCommand command = (CreateLinkCommand) request.getStartCommand();
	    command.setTarget((ViewObject)getHost().getModel());
	    return command;
	}

	@Override
	protected Command getConnectionCreateCommand(CreateConnectionRequest request) {
		CreateLinkCommand command = new CreateLinkCommand();
		command.setSourceAndLink((ViewObject) getHost().getModel(), (ViewLink) request.getNewObject());
		request.setStartCommand(command);
		return command;
	}

	@Override
	protected Command getReconnectTargetCommand(ReconnectRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Command getReconnectSourceCommand(ReconnectRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
