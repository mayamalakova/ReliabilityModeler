package com.system.reliability.modeler.editor.policy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.DirectEditPolicy;
import org.eclipse.gef.requests.DirectEditRequest;

import com.reliability.system.view.ViewObject;
import com.system.reliability.modeler.editor.command.RenameViewObjectCommand;
import com.system.reliability.modeler.editor.figure.IModelFigure;

public class ViewObjectDirectEditPolicy extends DirectEditPolicy {

	@Override
	protected Command getDirectEditCommand(DirectEditRequest request) {
		RenameViewObjectCommand command = new RenameViewObjectCommand();
	    command.setModel((ViewObject) getHost().getModel());
	    command.setNewName((String) request.getCellEditor().getValue());
	    return command;
	}

	@Override
	protected void showCurrentEditValue(DirectEditRequest request) {
		String value = (String) request.getCellEditor().getValue();
	    ((IModelFigure) getHostFigure()).getNameLabel().setText(value);
	}

}
