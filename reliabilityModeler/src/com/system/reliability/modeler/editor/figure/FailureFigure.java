package com.system.reliability.modeler.editor.figure;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.EllipseAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;

public class FailureFigure extends Figure implements IModelFigure {
	private Label label;
	private ConnectionAnchor connectionAnchor;	

	public FailureFigure() {
		super();
		label = new Label();
		label.setTextAlignment(PositionConstants.LEFT);
		add(label);
		setLayoutManager(new FreeformLayout());
	}

	@Override
	public Label getNameLabel() {
		return label;
	}

	@Override
	protected void paintFigure(Graphics graphics) {
		Rectangle bounds = getClientArea();
		setConstraint(label, new Rectangle(bounds.x + 10, bounds.y + 10,	bounds.width - 21, bounds.height - 21));
		PointList trianglePolygon = new PointList(6);
		Point point1 = new Point(bounds.x, bounds.y + bounds.height / 2);
		Point point2 = new Point(bounds.x + bounds.width / 4, bounds.y + bounds.height - 1);
		Point point3 = new Point(bounds.x + bounds.width * 3 / 4, bounds.y + bounds.height -1);
		Point point4 = new Point(bounds.x + bounds.width - 1, bounds.y + bounds.height/2);
		Point point5 = new Point(bounds.x + bounds.width * 3 / 4, bounds.y);
		Point point6 =new Point(bounds.x + bounds.width / 4, bounds.y);
		
		trianglePolygon.addPoint(point1);
		trianglePolygon.addPoint(point2);
		trianglePolygon.addPoint(point3);
		trianglePolygon.addPoint(point4);
		trianglePolygon.addPoint(point5);
		trianglePolygon.addPoint(point6);
		
		graphics.setBackgroundColor(ColorConstants.cyan);
		graphics.setForegroundColor(ColorConstants.black);
		graphics.fillPolygon(trianglePolygon);
		graphics.drawPolygon(trianglePolygon);
	}

	@Override
	public ConnectionAnchor getConnectionAnchor() {
		if (connectionAnchor == null) {
			connectionAnchor = new EllipseAnchor(this);
		}
		return connectionAnchor;
	}

}
