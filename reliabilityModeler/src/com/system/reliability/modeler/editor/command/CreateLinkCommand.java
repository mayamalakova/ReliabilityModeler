package com.system.reliability.modeler.editor.command;

import org.apache.log4j.Logger;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.util.EList;
import org.eclipse.gef.commands.Command;

import com.reliability.system.Failure;
import com.reliability.system.Position;
import com.reliability.system.Transition;
import com.reliability.system.view.Anchor;
import com.reliability.system.view.ViewFactory;
import com.reliability.system.view.ViewLink;
import com.reliability.system.view.ViewObject;

public class CreateLinkCommand extends Command {
	private static final Logger log = Logger.getLogger(CreateLinkCommand.class);
	
	private ViewLink link;
	private ViewObject source;
	private ViewObject target;
	private Point sourceLocation;
	private Point targetLocation;

	@Override
	public boolean canExecute() {
		return validate();
	}

	@Override
	public void execute() {
		/*********************************************************************/
		if (log.isInfoEnabled()) {log.info("CreateLinkCommand  <" + source.getLabel() + ", " + target.getLabel() + ">");}
		/*********************************************************************/
		Anchor sourceAnchor = ViewFactory.eINSTANCE.createAnchor();
		sourceAnchor.setLocation(sourceLocation);
		link.setSourceAnchor(sourceAnchor);
		source.getAnchors().add(sourceAnchor);
		
		link.setSource(source);
		
		Anchor targetAnchor = ViewFactory.eINSTANCE.createAnchor();
		targetAnchor.setLocation(targetLocation);
		link.setTargetAnchor(targetAnchor);
		this.target .getAnchors().add(targetAnchor);
		
		link.setTarget(target);
		//TODO: Handle the position loop case - still don't not what to do with it
	}

	@Override
	public void undo() {
		target.getAnchors().remove(link.getTargetAnchor());
		source.getAnchors().remove(link.getSourceAnchor());
		link.setTarget(null);
		link.setSource(null);
	}

	/**
	 * Setting the link target - this means the command will be executed
	 * @param target
	 */
	public void setTarget(ViewObject target, Point targetLocation) {
		this.targetLocation = targetLocation;
		this.target = target;
	}

	/**
	 * This method sets the initial command elements. The idea to set both items in 
	 * one method is to avoid making asumptions about the of setting them 
	 * @param source
	 * @param link
	 */
	public void setSourceAndLink(ViewObject source, ViewLink link) {
		this.source = source;
		this.link = link;
	}

	public void setSourceLocation(Point sourceLocation) {
		this.sourceLocation = sourceLocation;
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
	
	private boolean contains(EList<ViewLink> links, ViewObject object) {
		for (ViewLink link: links) {
			if (link.getTarget().equals(object)){
				return true;
			}
		}
		return false;
	}
}
