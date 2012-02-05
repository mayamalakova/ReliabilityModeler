package com.system.reliability.modeler.editor.figure;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.Triangle;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;

public class ComponentFigure extends Figure implements IModelFigure{
	private Label label;
	private Triangle triangle;

	public ComponentFigure(){
		setLayoutManager(new XYLayout());
		triangle = new Triangle();
		triangle.setDirection(PositionConstants.SOUTH);
		add(triangle);
		label = new Label();
		label.setTextAlignment(PositionConstants.CENTER);
		add(label);
	}
	
	@Override 
	protected void paintFigure(Graphics graphics) {
		Rectangle bounds = getBounds().getCopy();
		setConstraint(triangle, new Rectangle(bounds.width/2 - 30,10, 60, 60));
		setConstraint(label, new Rectangle(0, 0, bounds.width, 25));
		graphics.drawLine(bounds.x + bounds.width/2, bounds.y + 50, bounds.x + bounds.width/2, bounds.y + bounds.height);
	}
	
	public Label getLabel() {
	    return label;
	  }

	@Override
	public Label getNameLabel() {
		return label;
	}

}
