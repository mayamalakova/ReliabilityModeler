package com.system.reliability.modeler.editor;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.Request;
import org.eclipse.gef.requests.DirectEditRequest;
import org.eclipse.gef.tools.CreationTool;
import org.eclipse.swt.widgets.Display;

public class CreationAndDirectEditTool extends CreationTool {

	@Override 
	protected void performCreation(int button) {
	    super.performCreation(button);
	 
	    EditPartViewer viewer = getCurrentViewer();
	    final Object model = getCreateRequest().getNewObject();
	    if (model == null || viewer == null) {
	      return;
	    }
	 
	    final Object object = getCurrentViewer().getEditPartRegistry().get(model);
	    if(object instanceof EditPart) {
	      Display.getCurrent().asyncExec(
	    		  new Runnable() {
			        public void run() {
			          EditPart part = (EditPart)object;
			          Request request = new DirectEditRequest();
			          part.performRequest(request);
			        }
	    		  });
	    }
	    
	  }
	
}
