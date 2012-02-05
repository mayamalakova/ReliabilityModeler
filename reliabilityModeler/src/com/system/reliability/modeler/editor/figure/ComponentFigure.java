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
		add(label);
	}
	
	@Override protected void paintFigure(Graphics graphics) {
		Rectangle bounds = getBounds().getCopy();
		setConstraint(triangle, new Rectangle(20,10, bounds.width - 40, bounds.height - 40));
		setConstraint(label, new Rectangle(0, 0, bounds.width, 25));
	}
	
	public Label getLabel() {
	    return label;
	  }

	@Override
	public Label getNameLabel() {
		return label;
	}

}
