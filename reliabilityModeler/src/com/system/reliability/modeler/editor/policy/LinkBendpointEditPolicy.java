package com.system.reliability.modeler.editor.policy;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.BendpointEditPolicy;
import org.eclipse.gef.requests.BendpointRequest;

import com.reliability.system.view.ViewLink;
import com.system.reliability.modeler.editor.command.CreateBendpointCommant;
import com.system.reliability.modeler.editor.command.DeleteBendpointCommand;
import com.system.reliability.modeler.editor.command.MoveBendpointCommand;

public class LinkBendpointEditPolicy extends BendpointEditPolicy {

	@Override
	protected Command getCreateBendpointCommand(BendpointRequest request) {
		CreateBendpointCommant command = new CreateBendpointCommant();
		 
	    Point p = request.getLocation();
	 
	    command.setLink((ViewLink) request.getSource().getModel());
	    command.setLocation(p);
	    command.setIndex(request.getIndex());
	 
	    return command;
	}

	@Override
	protected Command getDeleteBendpointCommand(BendpointRequest request) {
		DeleteBendpointCommand command = new DeleteBendpointCommand();
		 
	    command.setLink((ViewLink)request.getSource().getModel());
	    command.setIndex(request.getIndex());
	    return command;
	}

	@Override
	protected Command getMoveBendpointCommand(BendpointRequest request) {
		MoveBendpointCommand command = new MoveBendpointCommand();
		 
	    Point p = request.getLocation();
	 
	    command.setOPMLink((ViewLink) request.getSource().getModel());
	    command.setLocation(p);
	    command.setIndex(request.getIndex());
	 
	    return command;
	}

}
