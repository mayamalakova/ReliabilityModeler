package com.system.reliability.modeler.editor.part;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import com.reliability.system.view.TransitionView;
import com.system.reliability.modeler.editor.figure.IModelFigure;

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
