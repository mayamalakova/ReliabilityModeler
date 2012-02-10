package com.system.reliability.modeler.editor.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import com.reliability.system.view.SystemView;
import com.reliability.system.view.TransitionView;
import com.system.reliability.modeler.editor.policy.ViewObjectLayoutPolicy;

public class GeneralizedNetEditPart extends AbstractGraphicalEditPart {
	private ReliabilityModelAdapter modelAdapter;
	
	public GeneralizedNetEditPart(){
		super();
		modelAdapter = new ReliabilityModelAdapter();
	}
	
	@Override
	protected IFigure createFigure() {
		FreeformLayer layer = new FreeformLayer();
	    layer.setLayoutManager(new FreeformLayout());
	    layer.setBorder(new LineBorder(1));
	    return layer;
	}

	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new ViewObjectLayoutPolicy());
	}
	
	@Override 
	protected List<EObject> getModelChildren() {
		List<EObject> children = new ArrayList<EObject>();
	    SystemView generalizedNet = (SystemView) getModel();
	    children.addAll(generalizedNet.getTransitions());
	    children.addAll(generalizedNet.getPorts());
	    for(TransitionView transition: generalizedNet.getTransitions()) {
	    	if (transition.getFailureState() != null) {
	    		children.add(transition.getFailureState());
	    	}
	    }
	    return children;
	  }
	
	@Override public void activate() {
	    if(!isActive()) {
	      ((SystemView)getModel()).eAdapters().add(modelAdapter);
	    }
	    super.activate();
	  }
	 
	  @Override public void deactivate() {
	    if(isActive()) {
	      ((SystemView)getModel()).eAdapters().remove(modelAdapter);
	    }
	    super.deactivate();
	  }

	public class ReliabilityModelAdapter implements Adapter {
		 
	    @Override 
	    public void notifyChanged(Notification notification) {
	      refreshChildren();
	    }
	 
	    @Override 
	    public Notifier getTarget() {
	      return (SystemView) getModel();
	    }
	 
	    @Override 
	    public void setTarget(Notifier newTarget) {
	      // Do nothing.
	    }
	 
	    @Override 
	    public boolean isAdapterForType(Object type) {
	      return type.equals(SystemView.class);
	    }
	  } 
}
