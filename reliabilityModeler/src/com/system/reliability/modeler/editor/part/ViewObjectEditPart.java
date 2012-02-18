package com.system.reliability.modeler.editor.part;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.CompoundSnapToHelper;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.SnapToGeometry;
import org.eclipse.gef.SnapToGrid;
import org.eclipse.gef.SnapToHelper;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.SnapFeedbackPolicy;
import org.eclipse.jface.viewers.TextCellEditor;

import com.reliability.system.view.PortView;
import com.reliability.system.view.TransitionView;
import com.reliability.system.view.ViewLink;
import com.reliability.system.view.ViewObject;
import com.reliability.system.view.ViewPackage;
import com.system.reliability.modeler.editor.ViewObjectCellEditorLocator;
import com.system.reliability.modeler.editor.ViewObjectDirectEditManager;
import com.system.reliability.modeler.editor.figure.IModelFigure;
import com.system.reliability.modeler.editor.policy.GraphicalViewObjectEditPolicy;
import com.system.reliability.modeler.editor.policy.ViewObjectDirectEditPolicy;
import com.system.reliability.modeler.editor.policy.ViewObjectEditPolicy;
import com.system.reliability.modeler.utils.Constants;

public abstract class ViewObjectEditPart extends AbstractGraphicalEditPart implements NodeEditPart {
	private static final Logger log = Logger.getLogger(ViewObjectEditPart.class);
	
	private ViewObjectModelAdapter adapter;

	public ViewObjectEditPart() {
		super();
		adapter = new ViewObjectModelAdapter();
	}

	@Override
	protected void refreshVisuals() {
		String name = null;
		Rectangle constraints = null;
		if (getModel() instanceof ViewObject) {
			ViewObject model = (ViewObject) getModel();
			name = model.getLabel();
			constraints = model.getConstraints();
		}

		IModelFigure figure = (IModelFigure) getFigure();
		figure.getNameLabel().setText(name);
		GeneralizedNetEditPart parent = (GeneralizedNetEditPart) getParent();
		if (parent != null) {
			parent.setLayoutConstraint(this, figure, constraints);
		}
		
	}

	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE, new ViewObjectDirectEditPolicy());
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new GraphicalViewObjectEditPolicy());
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new ViewObjectEditPolicy());
		installEditPolicy(Constants.POLICY_SNAP_TO_GRID, new SnapFeedbackPolicy());
	}

	
	@Override
	protected List<ViewLink> getModelSourceConnections() {
		ViewObject model = (ViewObject) getModel();
	    return model.getOutgoingLinks();
	}

	@Override
	protected List<ViewLink> getModelTargetConnections() {
		ViewObject model = (ViewObject) getModel();
	    return model.getIncomingLinks();
	}

	@Override
	public void performRequest(Request req) {
		if (req.getType() == RequestConstants.REQ_DIRECT_EDIT) {
			performDirectEditing();
		}
	}

	private void performDirectEditing() {
		Label label = ((IModelFigure) getFigure()).getNameLabel();

		ViewObjectDirectEditManager manager = new ViewObjectDirectEditManager(this,
				TextCellEditor.class, new ViewObjectCellEditorLocator(label), label);
		manager.show();
	}
	
	@Override
	public void activate() {
		if (!isActive()) {
			((EObject) getModel()).eAdapters().add(adapter);
		}
		super.activate();
	}

	@Override
	public void deactivate() {
		if (isActive()) {
			((EObject) getModel()).eAdapters().remove(adapter);
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
	
	public class ViewObjectModelAdapter implements Adapter {

		@Override
		public void notifyChanged(Notification notification) {
			//removing the adapter also causes notification and in this case the feature is null 
			if (notification.getFeature() == null) {
				return;
			}
			
			/*********************************************************************/
			if (log.isDebugEnabled()) { log.debug("Notification for " + ((EStructuralFeature)notification.getFeature()).getName() + " for " + ((ViewObject) getModel()).getLabel());}
			/*********************************************************************/
			refreshVisuals();
			if (ViewPackage.TRANSITION_VIEW__OUTGOING_LINKS == notification.getFeatureID(TransitionView.class) ||
					ViewPackage.PORT_VIEW__OUTGOING_LINKS == notification.getFeatureID(PortView.class)) {
				refreshSourceConnections();
			}
			if (ViewPackage.TRANSITION_VIEW__INCOMING_LINKS == notification.getFeatureID(TransitionView.class) ||
					ViewPackage.FAILURE_VIEW__INCOMING_LINKS == notification.getFeatureID(TransitionView.class) ||
					ViewPackage.PORT_VIEW__INCOMING_LINKS == notification.getFeatureID(PortView.class)) {
				refreshTargetConnections();
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
			return ViewObject.class.isAssignableFrom((Class<?>) type);
		}
	}

}
