package com.system.reliability.modeler.editor.part;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.draw2d.AbsoluteBendpoint;
import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.CompoundSnapToHelper;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.SnapToGeometry;
import org.eclipse.gef.SnapToGrid;
import org.eclipse.gef.SnapToHelper;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.gef.editpolicies.ConnectionEndpointEditPolicy;

import com.reliability.system.view.ViewLink;
import com.reliability.system.view.ViewPackage;
import com.system.reliability.modeler.editor.policy.LinkBendpointEditPolicy;
import com.system.reliability.modeler.editor.policy.LinkConnectionEditPolicy;

public class ViewLinkEditPart extends AbstractConnectionEditPart {
	private static final Logger log = Logger.getLogger(ViewLinkEditPart.class);
	
	private ViewLinkAdapter adapter;
	
	public ViewLinkEditPart() {
		super();
		adapter = new ViewLinkAdapter();
	}

	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.CONNECTION_ENDPOINTS_ROLE, new ConnectionEndpointEditPolicy());
		installEditPolicy(EditPolicy.CONNECTION_ROLE, new LinkConnectionEditPolicy());
		installEditPolicy(EditPolicy.CONNECTION_BENDPOINTS_ROLE, new LinkBendpointEditPolicy());
	}

	@Override
	protected IFigure createFigure() {
		PolylineConnection conn = (PolylineConnection) super.createFigure();
		conn.setConnectionRouter(new BendpointConnectionRouter());
		conn.setTargetDecoration(new PolylineDecoration());
		
		return conn;
	}

	@Override
	protected void refreshVisuals() {
		/*********************************************************************/
		if (log.isDebugEnabled()) { log.debug("Refreshing visuals for " + getModel());}
		/*********************************************************************/
		Connection connection = getConnectionFigure();
		List<Point> modelConstraint = ((ViewLink) getModel()).getBendpoints();
		List<AbsoluteBendpoint> figureConstraint = new ArrayList<AbsoluteBendpoint>();
		for (Point p : modelConstraint) {
			figureConstraint.add(new AbsoluteBendpoint(p));
		}
		connection.setRoutingConstraint(figureConstraint);
		/*********************************************************************/
		if (log.isDebugEnabled()) { log.debug("Refreshing visuals for " + getModel() + " finished");}
		/*********************************************************************/
	}

	@Override
	public void activate() {
		if (!isActive()) {
			((ViewLink) getModel()).eAdapters().add(adapter);
		}
		super.activate();
	}

	@Override
	public void deactivate() {
		if (isActive()) {
			((ViewLink) getModel()).eAdapters().remove(adapter);
		}
		super.deactivate();
	}

	@SuppressWarnings("rawtypes")
	@Override 
	public Object getAdapter(Class key) {
	    if (key == SnapToHelper.class) {
	        List<SnapToHelper> helpers = new ArrayList<SnapToHelper>();
	        if (Boolean.TRUE.equals(getViewer().getProperty(SnapToGeometry.PROPERTY_SNAP_ENABLED))) {
	            helpers.add(new SnapToGeometry(this));
	        }
	        
	        if (Boolean.TRUE.equals(getViewer().getProperty(SnapToGrid.PROPERTY_GRID_ENABLED))) {
	            helpers.add(new SnapToGrid(this));
	        }
	        
	        if(helpers.size()==0) {
	            return null;
	            
	        } else {
	            return new CompoundSnapToHelper(helpers.toArray(new SnapToHelper[0]));
	        }
	    }
	    
	    return super.getAdapter(key);
	}
	
	public class ViewLinkAdapter implements Adapter {

		/**
		 * Listen for changes in order to update the link bendpoints
		 */
		@Override
		public void notifyChanged(Notification notification) {
			if (notification.getFeature() == null) {
				return;
			}
			/*********************************************************************/
			if (log.isDebugEnabled()) { log.debug("Notification for " + ((EStructuralFeature)notification.getFeature()).getName() + " for " + getModel());}
			/*********************************************************************/
			if (notification.getFeatureID(ViewLink.class) == ViewPackage.VIEW_LINK__TARGET_ANCHOR) {
				//target anchor has changed - update the connection  in order to start it listening to the new target anchor
				((PolylineConnection)getConnectionFigure()).setTargetAnchor(getTargetConnectionAnchor());
			}
			
			if (notification.getFeatureID(ViewLink.class) == ViewPackage.VIEW_LINK__SOURCE_ANCHOR) {
				//source anchor has changed - update the connection  in order to start it listening to the new source anchor
				((PolylineConnection)getConnectionFigure()).setSourceAnchor(getSourceConnectionAnchor());
			}
			
			if (ViewPackage.VIEW_LINK__BENDPOINTS == notification.getFeatureID(ViewLink.class )) {
				refreshVisuals();
			}

		}

		@Override
		public Notifier getTarget() {
			return (Notifier) getModel();
		}

		@Override
		public void setTarget(Notifier newTarget) {
			// Do nothing.
		}

		@Override
		public boolean isAdapterForType(Object type) {
			return type.equals(ViewLink.class);
		}
	}
}
