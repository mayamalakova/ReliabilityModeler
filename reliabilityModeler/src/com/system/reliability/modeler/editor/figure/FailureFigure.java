package com.system.reliability.modeler.editor.figure;

import org.eclipse.draw2d.AbstractConnectionAnchor;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.EllipseAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;

import com.system.reliability.modeler.utils.Constants;

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
		Point point1 = new Point(bounds.x  + 2, bounds.y + bounds.height / 2);
		Point point2 = new Point(bounds.x + bounds.width / 4, bounds.y + bounds.height - 2);
		Point point3 = new Point(bounds.x + bounds.width * 3 / 4, bounds.y + bounds.height -2);
		Point point4 = new Point(bounds.x + bounds.width - 2, bounds.y + bounds.height/2);
		Point point5 = new Point(bounds.x + bounds.width * 3 / 4, bounds.y + 2);
		Point point6 =new Point(bounds.x + bounds.width / 4, bounds.y + 2);
		
		trianglePolygon.addPoint(point1);
		trianglePolygon.addPoint(point2);
		trianglePolygon.addPoint(point3);
		trianglePolygon.addPoint(point4);
		trianglePolygon.addPoint(point5);
		trianglePolygon.addPoint(point6);
		
		graphics.setAntialias(1);
		graphics.setLineWidth(3);
		graphics.setBackgroundColor(Constants.COLOR_LIGHT_YELLOW);
		graphics.setForegroundColor(Constants.COLOR_DARK_BLUE);
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

	class FailureAnchor extends AbstractConnectionAnchor {

		public FailureAnchor(){
		}

		public FailureAnchor(IFigure owner){
			super(owner);
		}
		
		@Override
		public Point getLocation(Point reference) {
			Rectangle bounds = getOwner().getBounds();
			return new Point(bounds.x, bounds.y + bounds.height / 2);
		}

}
}
