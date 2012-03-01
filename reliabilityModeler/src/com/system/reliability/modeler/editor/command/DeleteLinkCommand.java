package com.system.reliability.modeler.editor.command;

import java.util.Hashtable;
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
		target.getAnchors().remove(link.getTargetAnchor());
		source.getAnchors().remove(link.getSourceAnchor());
		deletePredicates();
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
		source.getAnchors().add(link.getSourceAnchor());
		target.getAnchors().add(link.getTargetAnchor());
		link.setTarget(target);
		link.setSource(source);
		/*********************************************************************/
		if (log.isInfoEnabled()) { log.info("Undo deleting  " + link);}
		/*********************************************************************/
		
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
	
	protected void deletePredicates() {
		if (source instanceof PortView) {
			deletePortTransitionPredicates((PortView) source, (TransitionView) target);
		
		} else if (source instanceof TransitionView) {
			deleteTransitionPredicates((TransitionView)source, (Position) target);
		}
	}
	
	/**
	 * Remove all matrix elements of the given port that point to output positions of the
	 * given transition
	 * @param port
	 */
	private void deletePortTransitionPredicates(PortView port, TransitionView transition) {
		for (ViewLink targetLink: transition.getOutgoingLinks()) {
			deletePredicateFromPort(port, (Position) targetLink.getTarget());
		}
	}
	
	/**
	 * Remove all matrix elements of input ports for the given transition that point
	 * to the given opposite position 
	 * @param transition
	 * @param oppositePosition
	 */
	private void deleteTransitionPredicates(TransitionView transition, Position oppositePosition) {
		for (ViewLink link: transition.getIncomingLinks()) {
			deletePredicateFromPort((PortView)link.getSource(), oppositePosition);
		}
	}
	
	/**
	 * Remove the matrix element pointing to the given opposite position from 
	 * the transition matrix of the given port
	 * @param port
	 * @param oppositePosition
	 */
	private void deletePredicateFromPort(PortView port, Position oppositePosition) {
		for (TransitionMatrixElement element: port.getTransitionRow()) {
			if (element.getOppositePosition().equals(oppositePosition)) {
				matrixElements.put(port, element);
				port.getTransitionRow().remove(element);
				break;
			}
		}
	}
	
}
