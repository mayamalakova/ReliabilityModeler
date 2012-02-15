package com.system.reliability.modeler.editor.part;

import org.eclipse.draw2d.IFigure;

import com.reliability.system.view.ViewObject;
import com.system.reliability.modeler.editor.figure.ConnectorFigure;

public class ConnectorEditPart extends TransitionEditPart {
	
	@Override
	protected IFigure createFigure() {
		ViewObject model = (ViewObject) getModel();
		return new ConnectorFigure(model.getOutgoingLinks().size(), model.getIncomingLinks().size());
	}

}
