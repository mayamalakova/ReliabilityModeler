package com.system.reliability.modeler.editor.part;

import org.eclipse.draw2d.IFigure;

import com.system.reliability.modeler.editor.figure.PortFigure;

public class PortEditPart extends ModelEditPart {
	
	@Override
	protected IFigure createFigure() {
		return new PortFigure();
	}

}
