package com.system.reliability.modeler.editor.figure;

import static com.system.reliability.modeler.utils.Constants.COMPONENT_WIDTH;
import static com.system.reliability.modeler.utils.Constants.LABEL_HEIGTH;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.Triangle;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;

import com.system.reliability.modeler.editor.anchor.TransitionAnchor;
import com.system.reliability.modeler.utils.Constants;

public class ComponentFigure extends Figure implements IModelFigure{
	private Label label;
	private Triangle triangle;
	private ConnectionAnchor connectionAnchor;	

	public ComponentFigure(){
		setLayoutManager(new XYLayout());
		triangle = new Triangle();
		triangle.setDirection(PositionConstants.SOUTH);
		triangle.setAntialias(1);
		triangle.setLineWidth(3);
		triangle.setBackgroundColor(Constants.COLOR_LIGHT_BLUE);
		triangle.setForegroundColor(Constants.COLOR_DARK_BLUE);
		add(triangle);
		label = new Label();
		label.setTextAlignment(PositionConstants.CENTER);
		add(label);
	}
	
	@Override 
	protected void paintFigure(Graphics graphics) {
		Rectangle bounds = getBounds().getCopy();
		setConstraint(triangle, new Rectangle(bounds.width/2 - COMPONENT_WIDTH/2, 10, COMPONENT_WIDTH, COMPONENT_WIDTH));
		setConstraint(label, new Rectangle(0, 0, bounds.width, LABEL_HEIGTH));
		graphics.setLineWidth(3);
		graphics.setForegroundColor(Constants.COLOR_DARK_BLUE);
		graphics.drawLine(bounds.x + bounds.width/2, bounds.y + 50, bounds.x + bounds.width/2, bounds.y + bounds.height);
		label.invalidate();
		triangle.invalidate();
	}
	
	public Label getLabel() {
	    return label;
	  }

	@Override
	public Label getNameLabel() {
		return label;
	}

	@Override
	public ConnectionAnchor getConnectionAnchor() {
		if (connectionAnchor == null) {
			connectionAnchor = new TransitionAnchor(this);
		}
		return connectionAnchor;
	}

}
