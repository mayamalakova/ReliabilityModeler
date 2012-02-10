package com.system.reliability.modeler.editor.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;

import com.reliability.system.Failure;
import com.reliability.system.view.FailureView;
import com.reliability.system.view.TransitionView;
import com.system.reliability.modeler.editor.command.CreateFailureCommand;

public abstract class TransitionEditPart extends ViewObjectEditPart {

	@Override 
	protected void createEditPolicies() {
		super.createEditPolicies();
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new TransitionLayoutPolicy());
	}
	
	class TransitionLayoutPolicy extends XYLayoutEditPolicy {

		@Override
		protected Command getCreateCommand(CreateRequest request) {
			Command command = null;
			 if (request.getNewObject() instanceof Failure) {
				FailureView failure = (FailureView) request.getNewObject();
				command = new CreateFailureCommand();
				((CreateFailureCommand) command).setLocation(request.getLocation());
				((CreateFailureCommand) command).setFailure(failure);
				((CreateFailureCommand) command).setParent((TransitionView) getHost().getModel());
			}
			 
			 return command;
		}
		
	}
}
