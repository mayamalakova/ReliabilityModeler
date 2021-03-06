package com.system.reliability.modeler.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import com.reliability.system.view.PortView;
import com.reliability.system.view.ViewFactory;

public class PortObjectFactory implements CreationFactory {

	@Override
	public Object getNewObject() {
		PortView port = ViewFactory.eINSTANCE.createPortView();
		return port;
	}

	@Override
	public Object getObjectType() {
		return PortView.class;
	}

}
