package com.system.reliability.modeler.editor.part;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.reliability.system.view.ViewObject;

public class ViewObjectModelAdapter implements Adapter {
		private ViewObjectEditPart editPart;
		
		public ViewObjectModelAdapter(ViewObjectEditPart editPart) {
			this.editPart = editPart;
		}

		@Override
		public void notifyChanged(Notification notification) {
			//removing the adapter also causes notification and in this case the feature is null 
			if (notification.getFeature() == null) {
				return;
			}
			
			/*********************************************************************/
			if (ViewObjectEditPart.log.isDebugEnabled()) { ViewObjectEditPart.log.debug("Notification for " + ((EStructuralFeature)notification.getFeature()).getName() + 
					" for " + ((ViewObject) editPart.getModel()).getLabel());}
			/*********************************************************************/
			editPart.refreshVisuals();
		}

		@Override
		public Notifier getTarget() {
			return (Notifier) editPart.getModel();
		}

		@Override
		public void setTarget(Notifier newTarget) {
			// Do nothing.
		}

		@Override
		public boolean isAdapterForType(Object type) {
			return ViewObject.class.isAssignableFrom((Class<?>) type);
		}
	}