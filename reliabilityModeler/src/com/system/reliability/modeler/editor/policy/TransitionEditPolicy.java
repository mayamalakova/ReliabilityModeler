package com.system.reliability.modeler.editor.policy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

import com.reliability.system.view.TransitionView;
import com.system.reliability.modeler.editor.command.DeleteTransitionCommand;

public class TransitionEditPolicy extends ComponentEditPolicy {

	@Override
	protected Command getDeleteCommand(GroupRequest request) {
		DeleteTransitionCommand command = new DeleteTransitionCommand();
		command.setTransition((TransitionView) getHost().getModel());
		return command;
	}

}
