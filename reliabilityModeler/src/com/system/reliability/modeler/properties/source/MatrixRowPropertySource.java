package com.system.reliability.modeler.properties.source;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.PropertyDescriptor;

import com.reliability.system.Position;
import com.reliability.system.TransitionMatrixElement;
import com.reliability.system.view.PortView;
import com.reliability.system.view.TransitionView;
import com.reliability.system.view.ViewLink;
import com.reliability.system.view.ViewObject;

public class MatrixRowPropertySource implements IPropertySource {
	private PortView port;
	private PropertyDescriptor[] descriptors;
	private Map<String, Position> idToPosition;
	
	public MatrixRowPropertySource(PortView port) {
		this.port = port;
		
		idToPosition = getIdToOppositePort(port);
		descriptors = new PropertyDescriptor[idToPosition.size()];
		int index = 0;
		for (String positionId: idToPosition.keySet()) {
			descriptors[index++] = new PropertyDescriptor(positionId, positionId);
		}
	}

	// IPropertySource method implementations -----------------------------------------------------
	@Override
	public Object getEditableValue() {
		return port.getTransitionRow();
	}

	@Override
	public IPropertyDescriptor[] getPropertyDescriptors() {
		return descriptors;
	}

	@Override
	public Object getPropertyValue(Object id) {
		Position position = idToPosition.get(id);
		return new MatrixElementPropertySource(position, port.getTransitionRow());
	}

	@Override
	public boolean isPropertySet(Object id) {
		return true;
	}

	@Override
	public void resetPropertyValue(Object id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setPropertyValue(Object oppositePositionId, Object updatedElement) {
		//do nothing;
	}
	// END IPropertySource method implementations -----------------------------------------------------
	
	/**
	 * This adds property descriptor for the transition row of the port.
	 * @not generated
	 */
	private Map<String, Position> getIdToOppositePort(PortView port) {
		Map<String, Position> map = new HashMap<String, Position>();
		for (ViewLink incomingLink: port.getOutgoingLinks()) {
			//TODO handle loops
			TransitionView transition = (TransitionView) incomingLink.getTarget();
			for (ViewLink outgoingLink: transition.getOutgoingLinks()) {
				ViewObject target = outgoingLink.getTarget();
				Position position = (Position) target;
				map.put(position.getId(), position);
			}
		}
		return map;
	}

}
