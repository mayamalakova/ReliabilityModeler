package com.system.reliability.modeler.editor.part;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.CreateRequest;

import com.reliability.system.Failure;
import com.reliability.system.view.FailureView;
import com.reliability.system.view.TransitionView;
import com.reliability.system.view.ViewLink;
import com.system.reliability.modeler.editor.command.CreateFailureCommand;
import com.system.reliability.modeler.editor.figure.TransitionFigure;

public abstract class TransitionEditPart extends ViewObjectEditPart {

	@Override 
	protected void createEditPolicies() {
		super.createEditPolicies();
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new TransitionLayoutPolicy());
	}
	
	@Override
	public ConnectionAnchor getSourceConnectionAnchor(ConnectionEditPart connection) {
		ViewLink link = (ViewLink) connection.getModel();
	    return ((TransitionFigure)getFigure()).getOutputConnectionAnchor(link.getSourceAnchor());
	  }
	 
	@Override
	  public ConnectionAnchor getTargetConnectionAnchor(ConnectionEditPart connection) {
		  ViewLink link = (ViewLink) connection.getModel();
	    return ((TransitionFigure)getFigure()).getInputConnectionAnchor(link.getTargetAnchor());
	  }
	 
	  @Override 
	  public ConnectionAnchor getSourceConnectionAnchor(Request request) {
		  if (request instanceof CreateConnectionRequest) {
			  TransitionFigure figure = (TransitionFigure) getFigure();
			  return figure.getOpenSourceAnchor();
		  }
		  return null;
	  }
	 
	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		TransitionFigure figure = (TransitionFigure) getFigure();
		TransitionView transition = (TransitionView) getModel();
		figure.setModelConstraint(transition.getConstraints());
		figure.setInputsCout(transition.getIncomingLinks().size());
		figure.setOutputsCount(transition.getOutgoingLinks().size());
		figure.updateAnchors();
	}

	  @Override 
	  public ConnectionAnchor getTargetConnectionAnchor(Request request) {
		  if (request instanceof CreateConnectionRequest) {
			  TransitionFigure figure = (TransitionFigure) getFigure();
			  return figure.getOpenTargetAnchor();
		  }
		  return null;
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
