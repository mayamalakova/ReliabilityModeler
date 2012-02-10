package com.system.reliability.modeler.editor.part;

import org.eclipse.draw2d.IFigure;

import com.system.reliability.modeler.editor.figure.FailureFigure;

public class FailureEditPart extends ViewObjectEditPart {

	@Override
	protected IFigure createFigure() {
		return new FailureFigure();
	}

}
