package com.system.reliability.modeler.properties.source;

import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;

import com.reliability.system.view.PortView;

public class PortPropertySource implements IPropertySource{
	private static final String PROPERTY_ID = "id";
	private static final String PROPERTY_TRANSITION_ROW = "transitionRow";
	private IPropertyDescriptor[] propertyDescriptors;
	private PortView port;
	
	public PortPropertySource(PortView port) {
		this.port = port;
		propertyDescriptors = new IPropertyDescriptor[] {
					new TextPropertyDescriptor(PROPERTY_ID,"ID"),
					new PropertyDescriptor(PROPERTY_TRANSITION_ROW, "Matrix Row") };
	}

	// IPropertySource method implementations -----------------------------------------------------
	@Override
	public IPropertyDescriptor[] getPropertyDescriptors() {
		return propertyDescriptors;
	}
	
	@Override
	public Object getPropertyValue(Object object) {
		if (PROPERTY_TRANSITION_ROW.equals(object)) {
			return new MatrixRowPropertySource(port);
		}
		
		if (PROPERTY_ID.equals(object)) {
			return port.getId();
		}
		
		return null;
	}

	@Override
	public Object getEditableValue() {
		return port;
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
		if (PROPERTY_ID.equals(id)) {
			port.setId((String) value);
		}
	}
	// End IPropertySource method implementations -----------------------------------------------------
	
}
