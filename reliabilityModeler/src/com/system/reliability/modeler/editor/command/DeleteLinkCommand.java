package com.system.reliability.modeler.editor.command;

import java.util.Hashtable;
import java.util.Map;

import org.eclipse.gef.commands.Command;

import com.reliability.system.Failure;
import com.reliability.system.Position;
import com.reliability.system.TransitionMatrixElement;
import com.reliability.system.view.PortView;
import com.reliability.system.view.TransitionView;
import com.reliability.system.view.ViewLink;
import com.reliability.system.view.ViewObject;

public class DeleteLinkCommand extends Command {
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
		source = link.getSource();
		target = link.getTarget();
		deleteElements();
		link.setSource(null);
		link.setTarget(null);
	}

	@Override
	public void undo() {
		link.setSource(source);
		link.setTarget(target);
		
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
	
}
