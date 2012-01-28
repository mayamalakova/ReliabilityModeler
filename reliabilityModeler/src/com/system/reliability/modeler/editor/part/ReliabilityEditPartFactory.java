package com.system.reliability.modeler.editor.part;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

import com.reliability.system.GeneralizedNet;
import com.reliability.system.Transition;

public class ReliabilityEditPartFactory implements EditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		EditPart part = null;
		 
	    if(model instanceof GeneralizedNet) {
	      part = new GeneralizedNetEditPart();
	    } else if (model instanceof Transition) {
	      part = new ConnectorEditPart();
	    }
	 
	    if (part != null) {
	      part.setModel(model);
	    }
	 
	    return part;
	}

}
