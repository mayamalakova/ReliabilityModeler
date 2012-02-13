package com.system.reliability.modeler.properties;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.gef.EditPart;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;

import com.reliability.system.provider.SystemItemProviderAdapterFactory;
import com.reliability.system.view.PortView;
import com.system.reliability.modeler.editor.part.PortEditPart;
import com.system.reliability.modeler.properties.source.PortPropertySource;

public class RgetPropertySourceProvider implements IPropertySourceProvider {
	private IPropertySourceProvider modelPropertySourceProvider = 
			new AdapterFactoryContentProvider(new SystemItemProviderAdapterFactory());
	
	@Override
	public IPropertySource getPropertySource(Object object) {
		IPropertySource source = null;
		
		if (object instanceof EditPart) {
			EditPart editPart = (EditPart) object;
			//customize the properties view for ports in order to show the matrix elements
			if (object instanceof PortEditPart) {
				return new PortPropertySource((PortView) editPart.getModel());
			}
			source = modelPropertySourceProvider.getPropertySource(((EditPart) object).getModel());
		} else {
			source = modelPropertySourceProvider.getPropertySource(object);
		}

		if (source != null) {
			return new UnwrappingPropertySource(source);
	
		} else {
			return null;
		}
	}
	
}
