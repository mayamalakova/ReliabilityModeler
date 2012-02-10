package com.system.reliability.modeler.editor.part;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

import com.reliability.system.GeneralizedNet;
import com.reliability.system.Transition;
import com.reliability.system.TransitionType;
import com.reliability.system.view.FailureView;
import com.reliability.system.view.PortView;
import com.reliability.system.view.ViewLink;

public class ReliabilityEditPartFactory implements EditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		EditPart part = null;
		 
	    if(model instanceof GeneralizedNet) {
	      part = new GeneralizedNetEditPart();
	    
		} else if (model instanceof Transition) {
			part = (((Transition) model).getType().equals(TransitionType.CONNECTOR)) ? 
					new ConnectorEditPart() : new ComponentEditPart();

		} else if (model instanceof PortView) {
			part = new PortEditPart();
			
		} else if (model instanceof ViewLink) {
			part = new ViewLinkEditPart();
		
		} else if (model instanceof FailureView) {
			part = new FailureEditPart();
		
		} else {
            throw new IllegalArgumentException("Model class " + model.getClass() + " not supported yet.");
        }
 
	 
	    if (part != null) {
	      part.setModel(model);
	    }
	 
	    return part;
	}

}
