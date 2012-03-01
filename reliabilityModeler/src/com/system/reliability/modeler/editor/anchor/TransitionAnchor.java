package com.system.reliability.modeler.editor.anchor;

import org.eclipse.draw2d.AbstractConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

public class TransitionAnchor extends AbstractConnectionAnchor {
	private int verticalOffset;
	private int horizontalOffset;
	
	public TransitionAnchor(){
	}

	public TransitionAnchor(IFigure owner){
		super(owner);
	}
	
	@Override
	public Point getLocation(Point reference) {
		Rectangle bounds = getOwner().getBounds();
		return new Point(bounds.x + bounds.width/2 + horizontalOffset, bounds.y + verticalOffset);
	}

	public int getHorizontalOffset() {
		return horizontalOffset;
	}

	public void setHorizontalOffset(int horizontalOffset) {
		this.horizontalOffset = horizontalOffset;
	}

	public int getVerticalOffset() {
		return verticalOffset;
	}

	public void setVerticalOffset(int verticalOffset) {
		this.verticalOffset = verticalOffset;
		//notify the listening connection in order to make it redraw itself 
		this.fireAnchorMoved();
	}

	public String toString() {
		return ("<" + horizontalOffset + ", " + verticalOffset + ">");
	}
}
