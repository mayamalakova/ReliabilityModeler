package com.system.reliability.modeler.editor.part;

import org.eclipse.draw2d.IFigure;

import com.system.reliability.modeler.editor.figure.ComponentFigure;

public class ComponentEditPart extends ViewObjectEditPart {
	
	@Override
	protected IFigure createFigure() {
		return new ComponentFigure();
	}

}
