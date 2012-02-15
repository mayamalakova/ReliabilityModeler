package com.system.reliability.modeler.editor.figure;

import static com.system.reliability.modeler.utils.Constants.CONNECTOR_WIDTH;
import static com.system.reliability.modeler.utils.Constants.LABEL_HEIGTH;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;

import com.system.reliability.modeler.utils.Constants;

public class ConnectorFigure extends TransitionFigure{
	private Label label;
	private RectangleFigure square;

	public ConnectorFigure(int inputsCout, int outputsCount) {
		super(inputsCout, outputsCount);
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
	public Label getNameLabel() {
		return label;
	}

	@Override
	public IFigure getBaseFigure() {
		return square;
	}

	@Override
	public Rectangle getBaseFigureBounds() {
		return new Rectangle(bounds.width/2 - CONNECTOR_WIDTH/2, LABEL_HEIGTH, CONNECTOR_WIDTH, CONNECTOR_WIDTH);
	}

}
