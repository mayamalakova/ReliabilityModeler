package com.system.reliability.modeler.editor;

import java.util.Random;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import com.reliability.system.Transition;
import com.system.reliability.modeler.editor.figure.ConnectorFigure;

public class ConnectorEditPart extends AbstractGraphicalEditPart {

	Random rand = new Random();
	
	@Override
	protected IFigure createFigure() {
		return new ConnectorFigure();
	}

	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub
	}

	@Override protected void refreshVisuals() {
		ConnectorFigure figure = (ConnectorFigure)getFigure();
	    Transition model = (Transition)getModel();
	    GeneralizedNetEditPart parent = (GeneralizedNetEditPart) getParent();
	 
	    figure.getLabel().setText(model.getName());
	    Rectangle layout = new Rectangle(rand.nextInt(300), rand.nextInt(300), 50, 50);
	    parent.setLayoutConstraint(this, figure, layout);
	  }
}
