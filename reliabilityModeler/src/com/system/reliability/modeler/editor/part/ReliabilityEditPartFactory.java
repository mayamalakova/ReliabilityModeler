package com.system.reliability.modeler.editor.part;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

import com.reliability.system.Transition;
import com.reliability.system.TransitionType;
import com.reliability.system.view.SystemView;

public class ReliabilityEditPartFactory implements EditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		EditPart part = null;
		 
	    if(model instanceof SystemView) {
	      part = new GeneralizedNetEditPart();
	    
		} else if (model instanceof Transition) {
			part = (((Transition) model).getType().equals(TransitionType.CONNECTOR)) ? 
					new ConnectorEditPart() : new ComponentEditPart();
		}
	 
	    if (part != null) {
	      part.setModel(model);
	    }
	 
	    return part;
	}

}
