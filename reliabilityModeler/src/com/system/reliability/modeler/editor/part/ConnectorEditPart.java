package com.system.reliability.modeler.editor.part;

import org.eclipse.draw2d.IFigure;

import com.system.reliability.modeler.editor.figure.ConnectorFigure;

public class ConnectorEditPart extends ViewObjectEditPart {
	
	@Override
	protected IFigure createFigure() {
		return new ConnectorFigure();
	}

}
