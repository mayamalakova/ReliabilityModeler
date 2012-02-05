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
		CreateLinkCommand result = (CreateLinkCommand) request.getStartCommand();
	    result.setTarget((ViewObject)getHost().getModel());
	    return result;
	}

	@Override
	protected Command getConnectionCreateCommand(CreateConnectionRequest request) {
		CreateLinkCommand result = new CreateLinkCommand();
		result.setSource((ViewObject) getHost().getModel());
		result.setLink((ViewLink) request.getNewObject());
		request.setStartCommand(result);
		return result;
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
