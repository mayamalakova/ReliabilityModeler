package com.system.reliability.modeler.editor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import com.reliability.system.GeneralizedNet;
import com.reliability.system.Transition;

public class GeneralizedNetEditPart extends AbstractGraphicalEditPart {

	@Override
	protected IFigure createFigure() {
		FreeformLayer layer = new FreeformLayer();
	    layer.setLayoutManager(new FreeformLayout());
	    layer.setBorder(new LineBorder(1));
	    return layer;
	}

	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub

	}
	
	@Override 
	protected List<Transition> getModelChildren() {
	    List<Transition> transitions = new ArrayList<Transition>();
	    GeneralizedNet generalizedNet = (GeneralizedNet) getModel();
	    transitions.addAll(generalizedNet.getTransitions());
	    return transitions;
	  }

}
