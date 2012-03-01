package com.system.reliability.modeler.editor.figure;

import static com.system.reliability.modeler.utils.Constants.LABEL_HEIGTH;

import org.apache.log4j.Logger;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

import com.system.reliability.modeler.editor.anchor.TransitionAnchor;
import com.system.reliability.modeler.utils.Constants;

public abstract class TransitionFigure extends Figure implements IModelFigure{
	private static final Logger log = Logger.getLogger(TransitionFigure.class);
	
	public ConnectionAnchor getConnectionAnchor(Point location) {
		TransitionAnchor anchor = new TransitionAnchor(this);
		anchor.setVerticalOffset(location.y - getBounds().y);
		return anchor;
	}

	public abstract IFigure getBaseFigure();
	
	public abstract Rectangle getBaseFigureBounds();
	
	@Override 
	protected void paintFigure(Graphics graphics) {
		
		Rectangle baseFigureBounds = getBaseFigureBounds().getCopy();
		
		setConstraint(getBaseFigure(), baseFigureBounds);
		setConstraint(getNameLabel(), new Rectangle(0, 0, bounds.width, LABEL_HEIGTH));
		
		drawPortConnectionLine(graphics, baseFigureBounds);
		
		getNameLabel().invalidate();
	    getBaseFigure().invalidate();
	}
	
	protected void drawPortConnectionLine(Graphics graphics, Rectangle baseFigureBounds) {
		graphics.setLineWidth(3);
		graphics.setForegroundColor(Constants.COLOR_DARK_BLUE);
		graphics.drawLine(
				bounds.x + bounds.width/2, 
				bounds.y + baseFigureBounds.height, 
				bounds.x + bounds.width/2, 
				bounds.y + bounds.height);
	}
	
}
