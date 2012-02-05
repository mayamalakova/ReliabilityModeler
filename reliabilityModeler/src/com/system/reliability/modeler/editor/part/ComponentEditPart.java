package com.system.reliability.modeler.editor.part;

import java.util.Random;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import com.system.reliability.modeler.editor.figure.ComponentFigure;

public class ComponentEditPart extends AbstractGraphicalEditPart {

	Random rand = new Random();
	
	@Override
	protected IFigure createFigure() {
		return new ComponentFigure();
	}

	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub
	}

}
