package com.system.reliability.modeler.editor.figure;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.Triangle;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;

public class ConnectorFigure extends Figure {
	private Label label;
	private Triangle triangle;

	public ConnectorFigure(){
		setLayoutManager(new XYLayout());
		triangle = new Triangle();
		add(triangle);
		label = new Label();
		add(label);
	}
	
	@Override protected void paintFigure(Graphics graphics) {
		Rectangle bounds = getBounds().getCopy();
		setConstraint(triangle, new Rectangle(0, 0, bounds.width, bounds.height));
		setConstraint(label, new Rectangle(0, 0, bounds.width, bounds.height));
	}
	
	public Label getLabel() {
	    return label;
	  }
}
