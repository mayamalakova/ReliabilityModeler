package com.system.reliability.modeler.editor.policy;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.ReconnectRequest;

import com.reliability.system.view.ViewLink;
import com.reliability.system.view.ViewObject;
import com.system.reliability.modeler.editor.command.CreateLinkCommand;
import com.system.reliability.modeler.editor.command.ReconnectSourceCommand;
import com.system.reliability.modeler.editor.command.ReconnectTargetCommand;
import com.system.reliability.modeler.editor.part.ViewObjectEditPart;

public class GraphicalViewObjectEditPolicy extends GraphicalNodeEditPolicy {

	@Override
	protected Command getConnectionCompleteCommand(CreateConnectionRequest request) {
		CreateLinkCommand command = (CreateLinkCommand) request.getStartCommand();
	    command.setTarget((ViewObject)getHost().getModel(), request.getLocation());
	    return command;
	}

	@Override
	protected Command getConnectionCreateCommand(CreateConnectionRequest request) {
		CreateLinkCommand command = new CreateLinkCommand();
		command.setSourceAndLink((ViewObject) getHost().getModel(), (ViewLink) request.getNewObject());
		command.setSourceLocation(request.getLocation());
		request.setStartCommand(command);
		return command;
	}

	@Override
	protected Command getReconnectTargetCommand(ReconnectRequest request) {
		ReconnectTargetCommand command = new ReconnectTargetCommand();
		command.setLink((ViewLink) request.getConnectionEditPart().getModel());
		ViewObjectEditPart editPart = (ViewObjectEditPart) request.getTarget();
		command.setTarget(editPart);
		Point newLocation = new Point(request.getLocation().x, request.getLocation().y - editPart.getFigure().getBounds().y); 
		command.setLocation(newLocation);
		return command;
	}

	@Override
	protected Command getReconnectSourceCommand(ReconnectRequest request) {
		ReconnectSourceCommand command = new ReconnectSourceCommand();
		command.setLink((ViewLink) request.getConnectionEditPart().getModel());
		ViewObjectEditPart editPart = (ViewObjectEditPart) request.getTarget();
		command.setSource(editPart);
		
		Point newLocation = new Point(request.getLocation().x, request.getLocation().y - editPart.getFigure().getBounds().y); 
		command.setLocation(newLocation);
		return command;
	}

}
