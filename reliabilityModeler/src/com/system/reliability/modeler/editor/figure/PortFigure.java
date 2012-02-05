package com.system.reliability.modeler.editor.figure;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.EllipseAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;

public class PortFigure extends Figure  implements IModelFigure {
	private Label label;
	private Ellipse ellipse;
	private ConnectionAnchor connectionAnchor;
	
	public PortFigure(){
		setLayoutManager(new XYLayout());
		ellipse = new Ellipse();
		add(ellipse);
		label = new Label();
		label.setTextAlignment(PositionConstants.CENTER);
		add(label);
	}
	
	@Override 
	protected void paintFigure(Graphics graphics) {
		Rectangle bounds = getBounds().getCopy();
		setConstraint(ellipse, new Rectangle(bounds.width/2 - 20,25, 40, 40));
		setConstraint(label, new Rectangle(0, 0, bounds.width, 25));
		label.invalidate();
		ellipse.invalidate();
	}
	
	@Override
	public Label getNameLabel() {
		return label;
	}

	@Override
	public ConnectionAnchor getConnectionAnchor() {
		if (connectionAnchor == null) {
			connectionAnchor = new EllipseAnchor(this);
		}
		return connectionAnchor;
	}

}
