package com.system.reliability.modeler.editor.command;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.gef.commands.Command;

import com.reliability.system.Failure;
import com.reliability.system.Position;
import com.reliability.system.TransitionMatrixElement;
import com.reliability.system.view.PortView;
import com.reliability.system.view.TransitionView;
import com.reliability.system.view.ViewLink;
import com.reliability.system.view.ViewObject;

public class DeleteLinkCommand extends Command {
	private static final Logger log = Logger.getLogger(DeleteLinkCommand.class);
	
	private ViewLink link;
	private ViewObject source;
	private ViewObject target;
	private Map<PortView, TransitionMatrixElement> matrixElements;
	
	public DeleteLinkCommand(ViewLink link) {
		super();
		this.link = link;
		this.matrixElements = new Hashtable<PortView, TransitionMatrixElement>();
	}

	@Override
	public boolean canExecute() {
		return validate();
	}

	@Override
	public void execute() {
		/*********************************************************************/
		if (log.isInfoEnabled()) { log.info("Deleting  " + link);}
		/*********************************************************************/
		source = link.getSource();
		target = link.getTarget();
		deleteElements();
		shiftSiblingLinks();
		link.setTarget(null);
		/*********************************************************************/
		if (log.isDebugEnabled()) { log.debug("DeleteLinkCommand: Detached the link from its target  " + target);}
		/*********************************************************************/
		link.setSource(null);
		/*********************************************************************/
		if (log.isDebugEnabled()) { log.debug("DeleteLinkCommand: Detached the link from its source " + source);}
		/*********************************************************************/
	}

	@Override
	public void undo() {
		/*********************************************************************/
		if (log.isInfoEnabled()) { log.info("Undo deleting  " + link);}
		/*********************************************************************/
		//unshift the sibling links before actually undeleting the link in order to refresh the link positions
		unshiftSiblingLinks();
		link.setTarget(target);
		link.setSource(source);
		
		for (PortView port: matrixElements.keySet()) {
			TransitionMatrixElement element = matrixElements.get(port);
			port.getTransitionRow().add(element);
		}
		
	}

	public void setLink(ViewLink link) {
		this.link = link;
	}
	
	private boolean validate() {
		if (link == null) {
			return false;
		}
		
		if (source instanceof Failure || target instanceof Failure) {
			return false;
		}
		
		return true;
	}
	
	protected void deleteElements() {
		if (source instanceof PortView) {
			deletePortTransitionElements((PortView) source, (TransitionView) target);
		
		} else if (source instanceof TransitionView) {
			deleteTransitionElements((TransitionView)source, (Position) target);
		}
	}
	
	/**
	 * Remove all matrix elements of the given port that point to output positions of the
	 * given transition
	 * @param port
	 */
	private void deletePortTransitionElements(PortView port, TransitionView transition) {
		for (ViewLink targetLink: transition.getOutgoingLinks()) {
			deleteElementFromPort(port, (Position) targetLink.getTarget());
		}
	}
	
	/**
	 * Remove all matrix elements of input ports for the given transition that point
	 * to the given opposite position 
	 * @param transition
	 * @param oppositePosition
	 */
	private void deleteTransitionElements(TransitionView transition, Position oppositePosition) {
		for (ViewLink link: transition.getIncomingLinks()) {
			deleteElementFromPort((PortView)link.getSource(), oppositePosition);
		}
	}
	
	/**
	 * Remove the matrix element pointing to the given opposite position from 
	 * the transition matrix of the given port
	 * @param port
	 * @param oppositePosition
	 */
	private void deleteElementFromPort(PortView port, Position oppositePosition) {
		for (TransitionMatrixElement element: port.getTransitionRow()) {
			if (element.getOppositePosition().equals(oppositePosition)) {
				matrixElements.put(port, element);
				port.getTransitionRow().remove(element);
				break;
			}
		}
	}
	
	private void shiftSiblingLinks() {
		if (target instanceof TransitionView) {
			shiftIncomingLinks(-1);
		}
		if (source instanceof TransitionView) {
			shiftOutgoingLinks(-1);
		}
	}
	
	private void unshiftSiblingLinks() {
		if (target instanceof TransitionView) {
			shiftIncomingLinks(1);
		}
		if (source instanceof TransitionView) {
			shiftOutgoingLinks(1);
		}
	}
	
	private void shiftOutgoingLinks(int shiftBy) {
		List<ViewLink> sourceOutgoingLinks = source.getOutgoingLinks();
		for (ViewLink siblingLink: sourceOutgoingLinks) {
			//if shiftBy is less than 0 we are shifting the sibling links up, otherwise we are shifting them back down
			if (!siblingLink.equals(link) && 
					(shiftBy > 0 && siblingLink.getSourceAnchor() >= link.getSourceAnchor() || 
					shiftBy < 0 && siblingLink.getSourceAnchor() > link.getSourceAnchor())) {
				siblingLink.setSourceAnchor(siblingLink.getSourceAnchor() + shiftBy);
				/*********************************************************************/
				if (log.isDebugEnabled()) { log.debug("DeleteLinkCommand: Just shifted source link " + siblingLink + " by " + shiftBy + " sourceAnchor=" + siblingLink.getSourceAnchor());}
				/*********************************************************************/
			}
		}
	}

	private void shiftIncomingLinks(int shiftBy) {
		List<ViewLink> targetIncomingLinks = target.getIncomingLinks();
		for (ViewLink siblingLink: targetIncomingLinks) {
			//if shiftBy is less than 0 we are shifting the sibling links up, otherwise we are shifting them back down
			if (!siblingLink.equals(link) && 
					(shiftBy > 0 && siblingLink.getTargetAnchor() >= link.getTargetAnchor() || 
					shiftBy < 0 && siblingLink.getTargetAnchor() > link.getTargetAnchor())) {
				siblingLink.setTargetAnchor(siblingLink.getTargetAnchor() + shiftBy);
				/*********************************************************************/
				if (log.isDebugEnabled()) { log.debug("DeleteLinkCommand: Just shifted target link " + siblingLink + " by " + shiftBy + " targetAnchor=" + siblingLink.getTargetAnchor());}
				/*********************************************************************/
			}
		}
	}

}
