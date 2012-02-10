package com.system.reliability.modeler.editor.command;

import org.eclipse.gef.commands.Command;

import com.reliability.system.Port;
import com.reliability.system.Transition;
import com.reliability.system.view.ViewLink;
import com.reliability.system.view.ViewObject;

public class CreateLinkCommand extends Command {
	private ViewLink link;
	private ViewObject source;
	private ViewObject target;

	@Override
	public boolean canExecute() {
		return source != null && target != null && link != null;
	}

	@Override
	public void execute() {
		link.setSource(source);
		link.setTarget(target);
		
		if (source instanceof Transition && target instanceof Port) {
			((Transition) source).getOutputPorts().add((Port) target);
		
		} else if (target instanceof Transition && source instanceof Port) {
			((Transition) target).getInputPorts().add((Port) source);
		}
		//TODO: Handle the position loop case - still don't not what to do with it
		//TODO - do not allow the position - position case
		//TODO handle the Transition, Failure case - should not be allowed
	}

	@Override
	public void undo() {
		if (source instanceof Transition && target instanceof Port) {
			((Transition)source).getOutputPorts().remove(target);
		
		} else if (target instanceof Transition && source instanceof Port) {
			((Transition) target).getInputPorts().remove(source);
		}
		
		source.getOutgoingLinks().remove(link);
		link.setSource(null);
		target.getIncomingLinks().remove(link);
		link.setTarget(null);
	}

	public void setTarget(ViewObject target) {
		this.target = target;
	}

	public void setSource(ViewObject source) {
		this.source = source;
	}

	public void setLink(ViewLink link) {
		this.link = link;
	}
}
