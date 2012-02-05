package com.system.reliability.modeler.editor.policy;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;

import com.reliability.system.Port;
import com.reliability.system.Transition;
import com.reliability.system.TransitionType;
import com.reliability.system.view.PortView;
import com.reliability.system.view.SystemView;
import com.reliability.system.view.TransitionView;
import com.system.reliability.modeler.editor.command.ChangeConstraintCommand;
import com.system.reliability.modeler.editor.command.CreateComponentCommand;
import com.system.reliability.modeler.editor.command.CreateConnectorCommand;
import com.system.reliability.modeler.editor.command.CreatePortCommand;
import com.system.reliability.modeler.editor.command.CreateTransitionCommand;

public class ModelLayoutPolicy extends XYLayoutEditPolicy {

	@Override 
	protected Command createChangeConstraintCommand(EditPart child, Object constraint) {
	    ChangeConstraintCommand command = new ChangeConstraintCommand();
	    command.setModel((TransitionView) child.getModel());
	    command.setNewConstraint((Rectangle) constraint);
	    return command;
	  }
	
	@Override
	protected Command getCreateCommand(CreateRequest request) {
		Command command = null;
		if (request.getNewObject() instanceof Transition) {
			TransitionView transition = (TransitionView) request.getNewObject();
			if (transition.getType() == TransitionType.COMPONENT) {
				command = new CreateComponentCommand();
				
			} else if (transition.getType() == TransitionType.CONNECTOR){
				command = new CreateConnectorCommand();
			}
			
			((CreateTransitionCommand) command).setLocation(request.getLocation());
			((CreateTransitionCommand) command).setTransition(transition);
			((CreateTransitionCommand) command).setParent((SystemView) getHost().getModel());
		
		} else if (request.getNewObject() instanceof Port) {
			PortView port = (PortView) request.getNewObject(); 
			command = new CreatePortCommand();
			((CreatePortCommand)command).setLocation(request.getLocation());
			((CreatePortCommand)command).setPort(port);
			((CreatePortCommand)command).setParent((SystemView) getHost().getModel());
		}
		
	    return command;
	}

}
