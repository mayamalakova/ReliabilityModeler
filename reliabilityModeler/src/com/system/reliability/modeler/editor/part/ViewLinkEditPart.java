package com.system.reliability.modeler.editor.part;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.gef.editpolicies.ConnectionEndpointEditPolicy;

import com.system.reliability.modeler.editor.policy.LinkConnectionEditPolicy;

public class ViewLinkEditPart extends  AbstractConnectionEditPart {

	 public ViewLinkEditPart() {
		    super();
		  }
		 
		  @Override 
		  protected void createEditPolicies() {
		    installEditPolicy(EditPolicy.CONNECTION_ENDPOINTS_ROLE, new ConnectionEndpointEditPolicy());
		    installEditPolicy(EditPolicy.CONNECTION_ROLE, new LinkConnectionEditPolicy());
		  }
		 
		  @Override 
		  protected IFigure createFigure() {
		    PolylineConnection conn = new PolylineConnection();
		    return conn;
		  }

}
