package com.system.reliability.modeler.editor.command;

import org.eclipse.gef.commands.Command;

import com.reliability.system.Port;
import com.reliability.system.Transition;
import com.reliability.system.view.ViewLink;
import com.reliability.system.view.ViewObject;

public class DeleteLinkCommand extends Command {
	private ViewLink link;
	private ViewObject source;
	private ViewObject target;

	@Override
	public boolean canExecute() {
		return link != null;
	}

	@Override
	public void execute() {
		source = link.getSource();
		target = link.getTarget();

		link.setSource(null);
		link.setTarget(null);
		
		if (source  instanceof Transition && target instanceof Port) {
			((Transition)source).getOutputPorts().remove(target);
		
		} else if (target instanceof Transition && source instanceof Port) {
			((Transition)target).getInputPorts().remove(source);
	
		}
		
		//TODO handle the Transition, Failure case - should not be allowed
	}

	@Override
	public void undo() {
		if (source instanceof Transition && target instanceof Port) {
			((Transition) source).getOutputPorts().add((Port) target);
		} else if (target instanceof Transition && source instanceof Port) {
			((Transition)target).getInputPorts().add((Port) source);
		}
		
		link.setSource(source);
		link.setTarget(target);
	}

	public void setLink(ViewLink link) {
		this.link = link;
	}
}
