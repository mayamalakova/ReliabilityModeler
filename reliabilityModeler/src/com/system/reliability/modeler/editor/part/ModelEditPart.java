package com.system.reliability.modeler.editor.part;

import org.eclipse.draw2d.Label;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.jface.viewers.TextCellEditor;

import com.reliability.system.view.TransitionView;
import com.system.reliability.modeler.editor.ReliabilityDirectEditManager;
import com.system.reliability.modeler.editor.TransitionCellEditorLocator;
import com.system.reliability.modeler.editor.figure.IModelFigure;
import com.system.reliability.modeler.editor.policy.TransitionDirectEditPolicy;
import com.system.reliability.modeler.editor.policy.TransitionEditPolicy;

public abstract class ModelEditPart extends AbstractGraphicalEditPart {
	private ModelAdapter adapter;

	public ModelEditPart() {
		super();
		adapter = new ModelAdapter();
	}

	@Override
	protected void refreshVisuals() {
		IModelFigure figure = (IModelFigure) getFigure();
		TransitionView model = (TransitionView) getModel();
		GeneralizedNetEditPart parent = (GeneralizedNetEditPart) getParent();

		figure.getNameLabel().setText(model.getName());
		parent.setLayoutConstraint(this, figure, model.getConstraints());
	}
	
	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE, new TransitionDirectEditPolicy());
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new TransitionEditPolicy());
	}

	@Override public void performRequest(Request req) {
	    if(req.getType() == RequestConstants.REQ_DIRECT_EDIT) {
	      performDirectEditing();
	    }
	  }
	 
	  private void performDirectEditing() {
	    Label label = ((IModelFigure)getFigure()).getNameLabel();

	    ReliabilityDirectEditManager manager = new ReliabilityDirectEditManager(this, TextCellEditor.class, new TransitionCellEditorLocator(label), label);
	    manager.show();
	  }   
	  
	@Override
	public void activate() {
		if (!isActive()) {
			((TransitionView) getModel()).eAdapters().add(adapter);
		}
		super.activate();
	}

	@Override
	public void deactivate() {
		if (isActive()) {
			((TransitionView) getModel()).eAdapters().remove(adapter);
		}

		super.deactivate();
	}

	public class ModelAdapter implements Adapter {

		@Override
		public void notifyChanged(Notification notification) {
			refreshVisuals();
		}

		@Override
		public Notifier getTarget() {
			return (TransitionView) getModel();
		}

		@Override
		public void setTarget(Notifier newTarget) {
			// Do nothing.
		}

		@Override
		public boolean isAdapterForType(Object type) {
			return type.equals(TransitionView.class);
		}
	}
	
}
