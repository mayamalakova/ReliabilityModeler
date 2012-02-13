package com.system.reliability.modeler.properties.source;

import java.util.List;

import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;

import com.reliability.system.Position;
import com.reliability.system.SystemFactory;
import com.reliability.system.TransitionMatrixElement;

public class MatrixElementPropertySource implements IPropertySource {
	public static final String PROPERTY_NECESSITY = "necessity";
	public static final String PROPERTY_POSSIBILITY = "possibility";
	
	private PropertyDescriptor[] descriptors;
	private Position oppositePosition;
	private List<TransitionMatrixElement> transitionRow;
	private TransitionMatrixElement element;

	public MatrixElementPropertySource(Position oppositePosition, List<TransitionMatrixElement> transitionRow) {
		this.transitionRow = transitionRow;
		this.oppositePosition = oppositePosition;
		descriptors = new PropertyDescriptor[]{
				new TextPropertyDescriptor(PROPERTY_NECESSITY, "Necessity"),
				new TextPropertyDescriptor(PROPERTY_POSSIBILITY, "Possibility")};
		element = getElement(oppositePosition);
		
	}
	
	// IPropertySource method implementations -----------------------------------------------------
	@Override
	public Object getEditableValue() {
		return element;
	}

	@Override
	public IPropertyDescriptor[] getPropertyDescriptors() {
		return descriptors;
	}

	@Override
	public Object getPropertyValue(Object id) {
		if (element == null) {
			return "N/A";
		}
		if (PROPERTY_NECESSITY.equals(id)) {
			return Float.toString(element.getNecessity());
		}
		if (PROPERTY_POSSIBILITY.equals(id)) {
			return Float.toString(element.getPossibility());
		}
		
		return null;
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
	public void setPropertyValue(Object id, Object value) {
		if (element == null) {
			element = SystemFactory.eINSTANCE.createTransitionMatrixElement();
			element.setOppositePosition(oppositePosition);
			transitionRow.add(element);
		}
		
		if (PROPERTY_NECESSITY.equals(id)) {
			element.setNecessity(Float.valueOf((String) value));
		}
		if (PROPERTY_POSSIBILITY.equals(id)) {
			element.setPossibility(Float.valueOf((String) value));
		}
	}

	private TransitionMatrixElement getElement(Position position) {
		for (TransitionMatrixElement element: transitionRow) {
			if (element.getOppositePosition().equals(position)) {
				return element;
			}
		}
		
		return null;
	}
	// END IPropertySource method implementations -----------------------------------------------------
	
}
