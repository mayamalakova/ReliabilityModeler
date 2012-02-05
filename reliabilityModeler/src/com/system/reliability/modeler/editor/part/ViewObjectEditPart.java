package com.system.reliability.modeler.editor.part;

import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.jface.viewers.TextCellEditor;

import com.reliability.system.view.ViewObject;
import com.system.reliability.modeler.editor.ViewObjectDirectEditManager;
import com.system.reliability.modeler.editor.ViewObjectCellEditorLocator;
import com.system.reliability.modeler.editor.figure.IModelFigure;
import com.system.reliability.modeler.editor.policy.ViewObjectDirectEditPolicy;
import com.system.reliability.modeler.editor.policy.ViewObjectEditPolicy;

public abstract class ViewObjectEditPart extends AbstractGraphicalEditPart {
	private ModelAdapter adapter;

	public ViewObjectEditPart() {
		super();
		adapter = new ModelAdapter();
	}

	@Override
	protected void refreshVisuals() {
		IModelFigure figure = (IModelFigure) getFigure();
		GeneralizedNetEditPart parent = (GeneralizedNetEditPart) getParent();
		String name = null;
		Rectangle constraints = null;
		if (getModel() instanceof ViewObject) {
			ViewObject model = (ViewObject) getModel();
			name = model.getLabel();
			constraints = model.getConstraints();
		} 
				
		figure.getNameLabel().setText(name);
		parent.setLayoutConstraint(this, figure, constraints);
	}
	
	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE, new ViewObjectDirectEditPolicy());
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new ViewObjectEditPolicy());
	}

	@Override 
	public void performRequest(Request req) {
	    if(req.getType() == RequestConstants.REQ_DIRECT_EDIT) {
	      performDirectEditing();
	    }
	  }
	 
	  private void performDirectEditing() {
	    Label label = ((IModelFigure)getFigure()).getNameLabel();

	    ViewObjectDirectEditManager manager = new ViewObjectDirectEditManager(this, TextCellEditor.class, new ViewObjectCellEditorLocator(label), label);
	    manager.show();
	  }   
	  
	@Override
	public void activate() {
		if (!isActive()) {
			((EObject)getModel()).eAdapters().add(adapter);
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

	public class ModelAdapter implements Adapter {

		@Override
		public void notifyChanged(Notification notification) {
			refreshVisuals();
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