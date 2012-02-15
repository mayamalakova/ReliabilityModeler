package com.system.reliability.modeler.editor.figure;

import static com.system.reliability.modeler.utils.Constants.COMPONENT_HEIGTH;
import static com.system.reliability.modeler.utils.Constants.COMPONENT_WIDTH;
import static com.system.reliability.modeler.utils.Constants.LABEL_HEIGTH;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.Triangle;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;

import com.system.reliability.modeler.utils.Constants;

public class ComponentFigure extends TransitionFigure{
	private Label label;
	private Triangle triangle;

	public ComponentFigure(int inputsCout, int outputsCount){
		super(inputsCout, outputsCount);
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
	public Label getNameLabel() {
		return label;
	}

	@Override
	public IFigure getBaseFigure() {
		return triangle;
	}

	@Override
	public Rectangle getBaseFigureBounds() {
		return new Rectangle(bounds.width/2 - COMPONENT_WIDTH/2, LABEL_HEIGTH, COMPONENT_WIDTH, COMPONENT_HEIGTH);
	}

}
