package com.system.reliability.modeler.editor.part;

import org.apache.log4j.Logger;
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
import com.reliability.system.view.ViewObject;
import com.system.reliability.modeler.editor.command.CreateFailureCommand;
import com.system.reliability.modeler.editor.figure.TransitionFigure;

public abstract class TransitionEditPart extends ViewObjectEditPart {
	private static final Logger log = Logger.getLogger(TransitionEditPart.class);
	
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
		/*********************************************************************/
		if (log.isDebugEnabled()) { log.debug("Refreshing visuals for " + ((ViewObject) getModel()).getLabel());}
		/*********************************************************************/
		super.refreshVisuals();
		TransitionFigure figure = (TransitionFigure) getFigure();
		TransitionView transition = (TransitionView) getModel();
		//give the model constraints to the figure in order to allow it to create its anchors
		figure.setModelConstraint(transition.getConstraints());
		figure.setInputsCout(transition.getIncomingLinks().size());
		figure.setOutputsCount(transition.getOutgoingLinks().size());
		figure.updateConnectionAnchors();
		/*********************************************************************/
		if (log.isDebugEnabled()) { log.debug("Finished refreshing " + ((ViewObject) getModel()).getLabel());}
		/*********************************************************************/
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
			return new Point(bounds.x + bounds.width/2 + 80, bounds.y + 66);
		}
	}
	
}
