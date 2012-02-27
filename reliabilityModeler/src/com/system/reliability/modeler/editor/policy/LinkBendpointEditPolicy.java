package com.system.reliability.modeler.editor.policy;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.Bendpoint;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.BendpointEditPolicy;
import org.eclipse.gef.handles.BendpointCreationHandle;
import org.eclipse.gef.handles.BendpointHandle;
import org.eclipse.gef.handles.BendpointMoveHandle;
import org.eclipse.gef.requests.BendpointRequest;
import org.eclipse.gef.tools.ConnectionBendpointTracker;

import com.reliability.system.view.ViewLink;
import com.system.reliability.modeler.editor.LinkBendpointTrackerGrid;
import com.system.reliability.modeler.editor.command.CreateBendpointCommand;
import com.system.reliability.modeler.editor.command.DeleteBendpointCommand;
import com.system.reliability.modeler.editor.command.MoveBendpointCommand;

public class LinkBendpointEditPolicy extends BendpointEditPolicy {

	@Override
	protected Command getCreateBendpointCommand(BendpointRequest request) {
		CreateBendpointCommand command = new CreateBendpointCommand();
		 
	    Point p = request.getLocation();
	 
	    command.setLink((ViewLink) request.getSource().getModel());
	    command.setLocation(p);
	    command.setIndex(request.getIndex());
	 
	    return command;
	}

	@Override
	protected Command getDeleteBendpointCommand(BendpointRequest request) {
		DeleteBendpointCommand command = new DeleteBendpointCommand();
		 
	    command.setLink((ViewLink)request.getSource().getModel());
	    command.setIndex(request.getIndex());
	    return command;
	}

	@Override
	protected Command getMoveBendpointCommand(BendpointRequest request) {
		MoveBendpointCommand command = new MoveBendpointCommand();
		 
	    Point point = request.getLocation();
	 
	    command.setLink((ViewLink) request.getSource().getModel());
	    command.setLocation(point);
	    command.setIndex(request.getIndex());
	 
	    return command;
	}

	/**
	 * Override this in order to use cusotom bendpoint handlers that use a custom drag tracker which provides 
	 * snap to grid for connection bendpoints 
	 */
	@SuppressWarnings("unchecked")
	@Override
	protected List createSelectionHandles() {
		List<BendpointHandle> list = new ArrayList<BendpointHandle>();
		ConnectionEditPart connEP = (ConnectionEditPart) getHost();
		PointList points = getConnection().getPoints();
		List<BendpointHandle> bendPoints = (List<BendpointHandle>) getConnection().getRoutingConstraint();
		int bendPointIndex = 0;
		Point currBendPoint = null;

		if (bendPoints == null) {
			bendPoints = new ArrayList<BendpointHandle>();
		
		}	else if (!bendPoints.isEmpty()) {
			currBendPoint = ((Bendpoint) bendPoints.get(0)).getLocation();
		}
		
		for (int i = 0; i < points.size() - 1; i++) {
			// Put a create handle on the middle of every segment
			list.add(new LinkBendpointCrateHandle(connEP, bendPointIndex, i));

			// If the current user bendpoint matches a bend location, show a move handle
			if (i < points.size() - 1 && bendPointIndex < bendPoints.size()
					&& currBendPoint.equals(points.getPoint(i + 1))) {
				list.add(new LinkBendpointMoveHandle(connEP, bendPointIndex, i + 1));

				// Go to the next user bendpoint
				bendPointIndex++;
				if (bendPointIndex < bendPoints.size()) {
					currBendPoint = ((Bendpoint) bendPoints.get(bendPointIndex)).getLocation();
				}
			}
		}

		return list;
	}

	class LinkBendpointCrateHandle extends BendpointCreationHandle {
		public LinkBendpointCrateHandle(ConnectionEditPart owner, int index, int locatorIndex) {
			super(owner, index, locatorIndex);
		}
		@Override
		protected DragTracker createDragTracker() {
			ConnectionBendpointTracker tracker;
			tracker = new LinkBendpointTrackerGrid((ConnectionEditPart) getOwner(), getIndex());
			tracker.setType(RequestConstants.REQ_CREATE_BENDPOINT);
			tracker.setDefaultCursor(getCursor());
			return tracker;
		}
	}
	
	class LinkBendpointMoveHandle extends BendpointMoveHandle {
		public LinkBendpointMoveHandle(ConnectionEditPart owner, int index,
				int locatorIndex) {
			super(owner, index, locatorIndex);
		}
		@Override
		protected DragTracker createDragTracker() {
			ConnectionBendpointTracker tracker;
			tracker = new LinkBendpointTrackerGrid((ConnectionEditPart) getOwner(), getIndex());
			tracker.setType(RequestConstants.REQ_MOVE_BENDPOINT);
			tracker.setDefaultCursor(getCursor());
			return tracker;
		}
	}
	
}
