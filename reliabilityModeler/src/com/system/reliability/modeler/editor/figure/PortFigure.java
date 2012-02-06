package com.system.reliability.modeler.editor.figure;

import static com.system.reliability.modeler.utils.Constants.LABEL_HEIGTH;
import static com.system.reliability.modeler.utils.Constants.PORT_WIDTH;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;

import com.system.reliability.modeler.editor.anchor.PortAnchor;

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
		setConstraint(ellipse, new Rectangle(bounds.width/2 - PORT_WIDTH/2, LABEL_HEIGTH, PORT_WIDTH, PORT_WIDTH));
		setConstraint(label, new Rectangle(0, 0, bounds.width, LABEL_HEIGTH));
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
			connectionAnchor = new PortAnchor(this);
		}
		return connectionAnchor;
	}

}
