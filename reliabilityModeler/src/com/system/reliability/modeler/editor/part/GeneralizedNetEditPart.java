package com.system.reliability.modeler.editor.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.ConnectionLayer;
import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.swt.SWT;

import com.reliability.system.GeneralizedNet;
import com.reliability.system.SystemPackage;
import com.reliability.system.Transition;
import com.reliability.system.view.TransitionView;
import com.system.reliability.modeler.editor.policy.ViewObjectLayoutPolicy;

public class GeneralizedNetEditPart extends AbstractGraphicalEditPart {
	private ReliabilityModelAdapter modelAdapter;

	public GeneralizedNetEditPart() {
		super();
		modelAdapter = new ReliabilityModelAdapter();
	}

	@Override
	protected IFigure createFigure() {
		FreeformLayer layer = new FreeformLayer();
		layer.setLayoutManager(new FreeformLayout());
		layer.setBorder(new LineBorder(1));
		//set connections antialiasing on
		ConnectionLayer connectionLayer = (ConnectionLayer) getLayer(LayerConstants.CONNECTION_LAYER);
		connectionLayer.setAntialias(SWT.ON);		
		return layer;
	}

	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new ViewObjectLayoutPolicy());
	}

	@Override
	protected List<EObject> getModelChildren() {
		List<EObject> children = new ArrayList<EObject>();
		GeneralizedNet generalizedNet = (GeneralizedNet) getModel();
		children.addAll(generalizedNet.getTransitions());
		children.addAll(generalizedNet.getPositions());
		for (Transition transition : generalizedNet.getTransitions()) {
			if (transition.getFailureState() != null) {
				children.add(transition.getFailureState());
			}
		}
		return children;
	}

	@Override
	public void activate() {
		if (!isActive()) {
			GeneralizedNet model = (GeneralizedNet) getModel();
			model.eAdapters().add(modelAdapter);
			for (Transition transition : model.getTransitions()) {
				transition.eAdapters().add(modelAdapter);
			}
		}
		super.activate();
	}

	@Override
	public void deactivate() {
		if (isActive()) {
			GeneralizedNet model = (GeneralizedNet) getModel();
			model.eAdapters().remove(modelAdapter);
			for (Transition transition : model.getTransitions()) {
				transition.eAdapters().remove(modelAdapter);
			}
		}
		super.deactivate();
	}

	private final void updateTransitionAdapters() {
		GeneralizedNet model = (GeneralizedNet) getModel();
		for (Transition transition : model.getTransitions()) {
			if (!transition.eAdapters().contains(modelAdapter)) {
				transition.eAdapters().add(modelAdapter);
			}
		}
	}

	public class ReliabilityModelAdapter implements Adapter {
		private EObject target;

		@Override
		public void notifyChanged(Notification notification) {
			//removing the adapter also causes notification and in this case the feature is null 
			if (notification.getFeature() == null) {
				return;
			}
			//refresh the whole container if a failureState hes been added/removed
			if (notification.getFeature().equals(SystemPackage.eINSTANCE.getTransition_FailureState())) {
				refresh();
				return;
			}
			
			if (notification.getFeature().equals(SystemPackage.eINSTANCE.getGeneralizedNet_Transitions())) {
				updateTransitionAdapters();
			}
			
			refreshChildren();
		}

		@Override
		public Notifier getTarget() {
			return target;
		}

		@Override
		public void setTarget(Notifier newTarget) {
			target = (EObject) newTarget;
		}

		@Override
		public boolean isAdapterForType(Object type) {
			return type.equals(GeneralizedNet.class) || type.equals(TransitionView.class);
		}
	}
}
