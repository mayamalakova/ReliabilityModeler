package com.system.reliability.modeler.editor.part;

import java.util.Random;

import org.eclipse.draw2d.IFigure;

import com.system.reliability.modeler.editor.figure.ConnectorFigure;

public class ConnectorEditPart extends ModelEditPart {

	Random rand = new Random();
	
	@Override
	protected IFigure createFigure() {
		return new ConnectorFigure();
	}

	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub
	}

}
