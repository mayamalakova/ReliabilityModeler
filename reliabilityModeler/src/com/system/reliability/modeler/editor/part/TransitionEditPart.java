package com.system.reliability.modeler.editor.part;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.ReconnectRequest;

import com.reliability.system.view.Anchor;
import com.reliability.system.view.TransitionView;
import com.reliability.system.view.ViewLink;
import com.system.reliability.modeler.editor.anchor.TransitionAnchor;
import com.system.reliability.modeler.editor.figure.TransitionFigure;

public abstract class TransitionEditPart extends ViewObjectEditPart {
	private static final Logger log = Logger.getLogger(TransitionEditPart.class);
	private Map<Anchor, ConnectionAnchor> anchors;
	
	@Override 
	protected void createEditPolicies() {
		super.createEditPolicies();
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new TransitionLayoutPolicy(this));
		anchors = new HashMap<Anchor, ConnectionAnchor>();
	}
	
	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		refreshSourceConnections();
		refreshTargetConnections();
	}

	@Override
	public ConnectionAnchor getSourceConnectionAnchor(ConnectionEditPart connection) {
		ViewLink link = (ViewLink) connection.getModel();
		ConnectionAnchor anchor = anchors.get(link.getSourceAnchor());
		if (anchor == null) {
			// create a new anchor and put it in the map
			anchor = getTransitionFigure().getConnectionAnchor(link.getSourceAnchor().getLocation());
			anchors.put(link.getSourceAnchor(), anchor);

		}
		/*********************************************************************/
		log.debug("Get source connection anchor: "	+ anchor);
		/*********************************************************************/

		return anchor;
	}
	 
	@Override
	public ConnectionAnchor getTargetConnectionAnchor(ConnectionEditPart connection) {
		ViewLink link = (ViewLink) connection.getModel();
		ConnectionAnchor anchor = anchors.get(link.getTargetAnchor());;
		if (anchor == null ) {
			//create a new anchor and put it in the map
			anchor = getTransitionFigure().getConnectionAnchor(link.getTargetAnchor().getLocation());
			anchors.put(link.getTargetAnchor(), anchor);
		
		}
		/*********************************************************************/
		log.debug("Got target connection anchor: " + anchor);
		/*********************************************************************/
		
		return anchor;
	}
	
	@Override 
	public ConnectionAnchor getSourceConnectionAnchor(Request request) {
		TransitionFigure figure = (TransitionFigure) getFigure();
		ConnectionAnchor anchor = null;
		if (request instanceof ReconnectRequest) {
			anchor = figure.getConnectionAnchor(((ReconnectRequest) request).getLocation());
		}

		if (request instanceof CreateConnectionRequest) {
			anchor = figure.getConnectionAnchor(((CreateConnectionRequest) request).getLocation());
		}

		return anchor;
	}
	 
	@Override
	public ConnectionAnchor getTargetConnectionAnchor(Request request) {
		TransitionFigure figure = (TransitionFigure) getFigure();
		ConnectionAnchor anchor = null;
		if (request instanceof ReconnectRequest) {
			anchor = figure.getConnectionAnchor(((ReconnectRequest) request).getLocation());
		}

		if (request instanceof CreateConnectionRequest) {
			anchor = figure.getConnectionAnchor(((CreateConnectionRequest) request).getLocation());
		}

		return anchor;
	}
	
	@Override
	public void updateAnchor(Anchor anchor){
		TransitionAnchor transitionAnchor = (TransitionAnchor) anchors.get(anchor);
		transitionAnchor.setVerticalOffset(anchor.getLocation().y);
	}
	
	private TransitionView getTransition() {
		return (TransitionView) getModel();
	}
	
	private TransitionFigure getTransitionFigure() {
		return (TransitionFigure) getFigure();
	}
	
	@Override
	protected ViewObjectModelAdapter getModelAdapter() {
		return new TransitionModelAdapter(this);
	}

	class TransitionModelAdapter extends ViewObjectModelAdapter {

		public TransitionModelAdapter(ViewObjectEditPart editPart) {
			super(editPart);
		}

		@Override
		public void notifyChanged(Notification notification) {
			super.notifyChanged(notification);
//			if (notification.getFeature() == null) {
//				return;
//			}

//			if (ViewPackage.TRANSITION_VIEW__OUTGOING_LINKS == notification.getFeatureID(TransitionView.class)) {
//				if (log.isDebugEnabled()) { log.debug("Refreshing source connections for transition");}
//				refreshSourceConnections();
//			}
//			if (ViewPackage.TRANSITION_VIEW__INCOMING_LINKS == notification	.getFeatureID(TransitionView.class)) {
//				if (log.isDebugEnabled()) { log.debug("Refreshing target connections for transition");}
//				refreshTargetConnections();
//			}
			
		}
	}
		
}
