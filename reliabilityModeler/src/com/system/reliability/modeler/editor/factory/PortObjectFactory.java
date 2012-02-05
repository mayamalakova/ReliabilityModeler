package com.system.reliability.modeler.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import com.reliability.system.Port;
import com.reliability.system.view.TransitionView;
import com.reliability.system.view.ViewFactory;

public class PortObjectFactory implements CreationFactory {

	@Override
	public Object getNewObject() {
		Port port = ViewFactory.eINSTANCE.createPortView();
		return port;
	}

	@Override
	public Object getObjectType() {
		return TransitionView.class;
	}

}
