package com.system.reliability.modeler.editor.anchor;

import org.eclipse.draw2d.EllipseAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

public class PortAnchor extends EllipseAnchor {

	public PortAnchor(IFigure owner){
		super(owner);
	}
	
	@Override
	public Point getLocation(Point reference) {
		Rectangle bounds = getOwner().getBounds();
		Rectangle rectangle = Rectangle.SINGLETON;
		rectangle.setBounds(bounds.x + bounds.width/2 - 20,bounds.y + 25, 40, 40);
		rectangle.translate(-1, -1);
		rectangle.resize(1, 1);
		getOwner().translateToAbsolute(rectangle);

		Point ref = rectangle.getCenter().negate().translate(reference);

		if (ref.x == 0)
			return new Point(reference.x, (ref.y > 0) ? rectangle.bottom() : rectangle.y);
		if (ref.y == 0)
			return new Point((ref.x > 0) ? rectangle.right() : rectangle.x, reference.y);

		float dx = (ref.x > 0) ? 0.5f : -0.5f;
		float dy = (ref.y > 0) ? 0.5f : -0.5f;

		// ref.x, ref.y, r.width, r.height != 0 => safe to proceed

		float k = (float) (ref.y * rectangle.width) / (ref.x * rectangle.height);
		k = k * k;

		return rectangle.getCenter().translate((int) (rectangle.width * dx / Math.sqrt(1 + k)),
				(int) (rectangle.height * dy / Math.sqrt(1 + 1 / k)));
	}

}
