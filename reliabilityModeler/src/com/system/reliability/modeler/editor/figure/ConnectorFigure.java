package com.system.reliability.modeler.editor.figure;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;

public class ConnectorFigure extends Figure implements IModelFigure{
	private Label label;
	private RectangleFigure square;
	private ConnectionAnchor connectionAnchor;

	public ConnectorFigure() {
		setLayoutManager(new XYLayout());
		square = new RectangleFigure();
		add(square);
		label = new Label();
		label.setTextAlignment(PositionConstants.CENTER);
		add(label);
	}
	
	@Override 
	protected void paintFigure(Graphics graphics) {
		Rectangle bounds = getBounds().getCopy();
		setConstraint(square, new Rectangle(bounds.width/2 - 20,25, 40, 40));
		setConstraint(label, new Rectangle(0, 0, bounds.width, 25));
		graphics.drawLine(bounds.x + bounds.width/2, bounds.y + 65, bounds.x + bounds.width/2, bounds.y + bounds.height);
		label.invalidate();
	    square.invalidate();
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
			connectionAnchor = new ChopboxAnchor(this);
		}
		return connectionAnchor;
	}
}
