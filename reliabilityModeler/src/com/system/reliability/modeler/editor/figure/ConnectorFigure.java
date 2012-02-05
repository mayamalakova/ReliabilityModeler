package com.system.reliability.modeler.editor.figure;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;

public class ConnectorFigure extends Figure implements IModelFigure{
	private Label label;
	private RectangleFigure square;

	public ConnectorFigure() {
		setLayoutManager(new XYLayout());
		square = new RectangleFigure();
		add(square);
		label = new Label();
		add(label);
	}
	
	@Override protected void paintFigure(Graphics graphics) {
		Rectangle bounds = getBounds().getCopy();
		setConstraint(square, new Rectangle(20,25, bounds.width - 60, bounds.height - 60));
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
