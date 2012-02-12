package com.system.reliability.modeler.editor.part;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
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
				((CreateFailureCommand) command).setLocation(getConstraint());
				((CreateFailureCommand) command).setFailure(failure);
				((CreateFailureCommand) command).setParent((TransitionView) getHost().getModel());
			}
			 
			 return command;
		}
		
		private Point getConstraint() {
			Rectangle bounds = getFigure().getBounds();
			return new Point(bounds.x + bounds.width/2 + 80, bounds.y + 60);
		}
	}
	
}
