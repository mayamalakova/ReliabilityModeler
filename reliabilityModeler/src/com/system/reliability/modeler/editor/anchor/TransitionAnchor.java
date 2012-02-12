package com.system.reliability.modeler.editor.anchor;

import org.eclipse.draw2d.AbstractConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

public class TransitionAnchor extends AbstractConnectionAnchor {

	public TransitionAnchor(){
	}

	public TransitionAnchor(IFigure owner){
		super(owner);
	}
	
	@Override
	public Point getLocation(Point reference) {
		Rectangle bounds = getOwner().getBounds();
		return new Point(bounds.x + bounds.width/2, bounds.y + 80);
	}

}
