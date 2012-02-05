package com.system.reliability.modeler.editor.policy;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

import com.reliability.system.view.PortView;
import com.reliability.system.view.TransitionView;
import com.system.reliability.modeler.editor.command.DeletePortCommand;
import com.system.reliability.modeler.editor.command.DeleteTransitionCommand;

public class TransitionEditPolicy extends ComponentEditPolicy {

	@Override
	protected Command getDeleteCommand(GroupRequest request) {
		EObject model = (EObject) getHost().getModel();
		if (model instanceof TransitionView){
			DeleteTransitionCommand command = new DeleteTransitionCommand();
			command.setTransition((TransitionView) model);
			return command;
		}
		
		if (model instanceof PortView) {
			DeletePortCommand command = new DeletePortCommand();
			command.setPort((PortView) model);
			return command;
		}
		
		return null;
	}

}
