package com.system.reliability.modeler.editor.part;

import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import com.reliability.view.view.TransitionView;
import com.system.reliability.modeler.editor.figure.IModelFigure;

public abstract class ModelEditPart extends AbstractGraphicalEditPart {

	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void registerVisuals() {
		IModelFigure figure = (IModelFigure)getFigure();
	    TransitionView model = (TransitionView) getModel();
	    GeneralizedNetEditPart parent = (GeneralizedNetEditPart) getParent();
	 
	    figure.getNameLabel().setText(model.getName());
	    parent.setLayoutConstraint(this, figure, model.getConstraints());
	}

	
}
