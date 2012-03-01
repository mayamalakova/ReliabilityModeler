package com.system.reliability.modeler.editor.part;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.Request;

import com.system.reliability.modeler.editor.figure.IPositionFigure;

public abstract class PositionEditPart extends ViewObjectEditPart {

	public ConnectionAnchor getSourceConnectionAnchor(ConnectionEditPart connection) {
		return ((IPositionFigure) getFigure()).getConnectionAnchor();
	}

	public ConnectionAnchor getTargetConnectionAnchor(ConnectionEditPart connection) {
		return ((IPositionFigure) getFigure()).getConnectionAnchor();
	}

	@Override
	public ConnectionAnchor getSourceConnectionAnchor(Request request) {
		return ((IPositionFigure) getFigure()).getConnectionAnchor();
	}

	@Override
	public ConnectionAnchor getTargetConnectionAnchor(Request request) {
		return ((IPositionFigure) getFigure()).getConnectionAnchor();
	}

	@Override
	protected ViewObjectModelAdapter getModelAdapter() {
		return new ViewObjectModelAdapter(this);
	}

	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		refreshSourceConnections();
		refreshTargetConnections();
	}

	@Override
	protected IFigure createFigure() {
		// TODO Auto-generated method stub
		return null;
	}



	class PositionModelAdapter extends ViewObjectModelAdapter {

		public PositionModelAdapter(ViewObjectEditPart editPart) {
			super(editPart);
		}

		@Override
		public void notifyChanged(Notification notification) {
			super.notifyChanged(notification);
//			if (notification.getFeature() == null) {
//				return;
//			}
//			
//			if (ViewPackage.PORT_VIEW__OUTGOING_LINKS == notification.getFeatureID(PortView.class)) {
//				if (log.isDebugEnabled()) { log.debug("Refreshing source connections for position");}
//				 refreshSourceConnections();
//			}
//			if (ViewPackage.PORT_VIEW__INCOMING_LINKS == notification	.getFeatureID(PortView.class)) {
//				if (log.isDebugEnabled()) { log.debug("Refreshing source connections for position");}
//				 refreshTargetConnections();
//			}
			
		}
	}

}
