package com.system.reliability.modeler.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import com.reliability.system.view.ViewFactory;
import com.reliability.system.view.ViewLink;

public class LinkObjectFactory implements CreationFactory {

	@Override
	public Object getNewObject() {
		return ViewFactory.eINSTANCE.createViewLink();
	}

	@Override
	public Object getObjectType() {
		return ViewLink.class;
	}

}
