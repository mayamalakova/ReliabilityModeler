package com.system.reliability.modeler.editor.part;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import com.reliability.view.view.TransitionView;
import com.system.reliability.modeler.editor.figure.IModleFigure;

public abstract class ModelEditPart extends AbstractGraphicalEditPart {

	@Override
	protected IFigure createFigure() {
		IModleFigure figure = (IModleFigure)getFigure();
	    TransitionView model = (TransitionView) getModel();
	    GeneralizedNetEditPart parent = (GeneralizedNetEditPart) getParent();
	 
	    figure.getNameLabel().setText(model.getName());
	    parent.setLayoutConstraint(this, figure, model.getConstraints());
	  
		return null;
	}

	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub

	}

}
