package com.system.reliability.modeler.editor;

import org.eclipse.draw2d.Label;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gef.tools.DirectEditManager;

public class ReliabilityDirectEditManager extends DirectEditManager {
	private Label label;
	
	@SuppressWarnings("rawtypes")
	public ReliabilityDirectEditManager(GraphicalEditPart source, Class editorType, CellEditorLocator locator, Label label) {
		super(source, editorType, locator);
		this.label = label;
	}

	@Override
	protected void initCellEditor() {
		String initialLabelText = label.getText();
	    getCellEditor().setValue(initialLabelText);
	}

}
