package com.system.reliability.modeler.editor.figure;

import static com.system.reliability.modeler.utils.Constants.CONNECTOR_WIDTH;
import static com.system.reliability.modeler.utils.Constants.LABEL_HEIGTH;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;

import com.system.reliability.modeler.editor.anchor.TransitionAnchor;
import com.system.reliability.modeler.utils.Constants;

public class ConnectorFigure extends Figure implements IModelFigure{
	private Label label;
	private RectangleFigure square;
	private ConnectionAnchor connectionAnchor;

	public ConnectorFigure() {
		setLayoutManager(new XYLayout());
		square = new RectangleFigure();
		square.setAntialias(1);
		square.setLineWidth(3);
		square.setBackgroundColor(Constants.COLOR_LIGHT_BLUE);
		square.setForegroundColor(Constants.COLOR_DARK_BLUE);
		add(square);
		label = new Label();
		label.setTextAlignment(PositionConstants.CENTER);
		add(label);
	}
	
	@Override 
	protected void paintFigure(Graphics graphics) {
		Rectangle bounds = getBounds().getCopy();
		setConstraint(square, new Rectangle(bounds.width/2 - CONNECTOR_WIDTH/2, LABEL_HEIGTH, CONNECTOR_WIDTH, CONNECTOR_WIDTH));
		setConstraint(label, new Rectangle(0, 0, bounds.width, LABEL_HEIGTH));
		graphics.setLineWidth(3);
		graphics.setForegroundColor(Constants.COLOR_DARK_BLUE);
		graphics.drawLine(bounds.x + bounds.width/2, bounds.y + LABEL_HEIGTH + CONNECTOR_WIDTH, bounds.x + bounds.width/2, bounds.y + bounds.height);
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
			connectionAnchor = new TransitionAnchor(this);
		}
		return connectionAnchor;
	}

}
