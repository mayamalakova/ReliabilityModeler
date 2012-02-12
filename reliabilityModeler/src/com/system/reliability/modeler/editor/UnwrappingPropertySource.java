package com.system.reliability.modeler.editor;

import org.eclipse.emf.edit.provider.ItemPropertyDescriptor.PropertyValueWrapper;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;

/**
 * A property source which unwraps values that are wrapped in an EMF
 * {@link PropertyValueWrapper}
 *
 * @author vainolo
 *
 */
public class UnwrappingPropertySource implements IPropertySource {
    private IPropertySource source;

    public UnwrappingPropertySource(final IPropertySource source) {
        this.source = source;
    }

    @Override
    public Object getEditableValue() {
        Object value = source.getEditableValue();
        if(value instanceof PropertyValueWrapper) {
            PropertyValueWrapper wrapper = (PropertyValueWrapper) value;
            return wrapper.getEditableValue(null);
        } else {
            return source.getEditableValue();
        }
    }

    @Override
    public IPropertyDescriptor[] getPropertyDescriptors() {
        return source.getPropertyDescriptors();
    }

    @Override
    public Object getPropertyValue(Object id) {
        Object value = source.getPropertyValue(id);
        if(value instanceof PropertyValueWrapper) {
            PropertyValueWrapper wrapper = (PropertyValueWrapper) value;
            return wrapper.getEditableValue(null);
        } else {
            return source.getPropertyValue(id);
        }
    }

    @Override
    public boolean isPropertySet(Object id) {
        return source.isPropertySet(id);
    }

    @Override
    public void resetPropertyValue(Object id) {
        source.resetPropertyValue(id);
    }

    @Override
    public void setPropertyValue(Object id, Object value) {
        source.setPropertyValue(id, value);
    }
}
