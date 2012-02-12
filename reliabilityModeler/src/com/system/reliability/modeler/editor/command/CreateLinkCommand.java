package com.system.reliability.modeler.editor.command;

import org.eclipse.emf.common.util.EList;
import org.eclipse.gef.commands.Command;

import com.reliability.system.Failure;
import com.reliability.system.Position;
import com.reliability.system.Transition;
import com.reliability.system.view.ViewLink;
import com.reliability.system.view.ViewObject;

public class CreateLinkCommand extends Command {
	private ViewLink link;
	private ViewObject source;
	private ViewObject target;

	@Override
	public boolean canExecute() {
		return validate();
	}

	@Override
	public void execute() {
		link.setSource(source);
		link.setTarget(target);
		//TODO: Handle the position loop case - still don't not what to do with it
	}

	@Override
	public void undo() {
		link.setSource(null);
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
	
	private boolean validate() {
		if (link == null) {
			return false;
		}
		
		if (source == null) {
			return false;
		}
		
		if (target == null) {
			return false;
		}
		
		if (source instanceof Failure || target instanceof Failure) {
			return false;
		}
		
		if (source instanceof Transition && target instanceof Transition || source instanceof Position && target instanceof Position) {
			return false;
		}
		
		if (contains(source.getOutgoingLinks(), target) || contains(source.getIncomingLinks(), target)){
			return false;
		}
		
		return true;
	}
	
	public boolean contains(EList<ViewLink> links, ViewObject object) {
		for (ViewLink link: links) {
			if (link.getTarget().equals(object)){
				return true;
			}
		}
		return false;
	}
}
