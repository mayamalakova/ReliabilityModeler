package com.system.reliability.modeler.editor.policy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.DirectEditPolicy;
import org.eclipse.gef.requests.DirectEditRequest;

import com.reliability.system.view.TransitionView;
import com.system.reliability.modeler.editor.command.RenameTransitionCommand;
import com.system.reliability.modeler.editor.figure.IModelFigure;

public class TransitionDirectEditPolicy extends DirectEditPolicy {

	@Override
	protected Command getDirectEditCommand(DirectEditRequest request) {
		RenameTransitionCommand command = new RenameTransitionCommand();
	    command.setModel((TransitionView) getHost().getModel());
	    command.setNewName((String) request.getCellEditor().getValue());
	    return command;
	}

	@Override
	protected void showCurrentEditValue(DirectEditRequest request) {
		String value = (String) request.getCellEditor().getValue();
	    ((IModelFigure) getHostFigure()).getNameLabel().setText(value);
	}

}
