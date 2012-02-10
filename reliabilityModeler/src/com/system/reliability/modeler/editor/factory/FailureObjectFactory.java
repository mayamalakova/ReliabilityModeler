package com.system.reliability.modeler.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import com.reliability.system.view.FailureView;
import com.reliability.system.view.ViewFactory;

public class FailureObjectFactory implements CreationFactory {

	@Override
	public Object getNewObject() {
		FailureView port = ViewFactory.eINSTANCE.createFailureView();
		return port;
	}

	@Override
	public Object getObjectType() {
		return FailureView.class;
	}

}
