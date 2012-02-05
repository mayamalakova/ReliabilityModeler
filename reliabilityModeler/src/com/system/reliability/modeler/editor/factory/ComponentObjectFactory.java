package com.system.reliability.modeler.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import com.reliability.system.TransitionType;
import com.reliability.system.view.TransitionView;
import com.reliability.system.view.ViewFactory;

public class ComponentObjectFactory implements CreationFactory {

	@Override
	public Object getNewObject() {
		TransitionView transition = ViewFactory.eINSTANCE.createTransitionView();
		transition.setType(TransitionType.COMPONENT);
		return transition;
	}

	@Override
	public Object getObjectType() {
		return TransitionView.class;
	}

}
