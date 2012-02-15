package com.system.reliability.modeler.editor.figure;

import static com.system.reliability.modeler.utils.Constants.LABEL_HEIGTH;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;

import com.system.reliability.modeler.editor.anchor.TransitionAnchor;
import com.system.reliability.modeler.utils.Constants;

public abstract class TransitionFigure extends Figure implements IModelFigure{
	private List<ConnectionAnchor> inputAnchors;
	private List<ConnectionAnchor> outputAnchors;
	private Rectangle modelConstraint;
	private int inputsCout;
	private int outputsCount;
	
	public TransitionFigure(int inputsCout, int outputsCount) {
		this.inputsCout = inputsCout;
		this.outputsCount = outputsCount;
	}
	
	public abstract IFigure getBaseFigure();
	
	public abstract Rectangle getBaseFigureBounds();
	
	@Override 
	protected void paintFigure(Graphics graphics) {
		
		Rectangle baseFigureBounds = getBaseFigureBounds().getCopy();
		
		setConstraint(getBaseFigure(), baseFigureBounds);
		setConstraint(getNameLabel(), new Rectangle(0, 0, bounds.width, LABEL_HEIGTH));
		
		drawPortConnectionLine(graphics, baseFigureBounds);
		
		getNameLabel().invalidate();
	    getBaseFigure().invalidate();
	}
	
	protected void drawPortConnectionLine(Graphics graphics, Rectangle baseFigureBounds) {
		graphics.setLineWidth(3);
		graphics.setForegroundColor(Constants.COLOR_DARK_BLUE);
		graphics.drawLine(
				bounds.x + bounds.width/2, 
				bounds.y + baseFigureBounds.height, 
				bounds.x + bounds.width/2, 
				bounds.y + bounds.height);
	}
	
	private void createConnectionAnchors() {
		int initialOffset = 80;
		int connectionLineHeigth = (modelConstraint.height - getBaseFigureBounds().height);
		
		//sometimes the connection is created before the figure so bounds is still not set
		int inputMargin = (modelConstraint.height > 0) ? connectionLineHeigth / (inputsCout + 1) : 20; 
		for (int i = 0; i < inputsCout + 1; i++) {
			TransitionAnchor inputAnchor = new TransitionAnchor(this);
			inputAnchor.verticalOffset = initialOffset + i * inputMargin;
			inputAnchor.horizontalOffset = - 1;
			inputAnchors.add(inputAnchor);
		}
		
		int outputMargin = (modelConstraint.height > 0) ? connectionLineHeigth / (outputsCount + 1) : 20; 
		for (int i = 0; i < outputsCount + 1; i++) {
			TransitionAnchor outputAnchor = new TransitionAnchor(this);
			outputAnchor.verticalOffset = initialOffset + i * outputMargin;
			outputAnchor.horizontalOffset = - 1;
			outputAnchors.add(outputAnchor);
		}

	}
	
	public ConnectionAnchor getOutputConnectionAnchor(int anchorIndex) {
		if (outputAnchors == null) {
			initAnchors();
		}
		// FIXME - this is a workaround, when deleting links the remaining
		// anchor indexes need to be updated !!!
		if (outputAnchors.size() <= anchorIndex) {
			return outputAnchors.get(outputsCount - 1);
		}
		return outputAnchors.get(anchorIndex);
	}

	public ConnectionAnchor getInputConnectionAnchor(int anchorIndex) {
		if (inputAnchors == null) {
			initAnchors();
		}
		// FIXME - this is a workaround, when deleting links the remaining
		// anchor indexes need to be updated !!!
		if (inputAnchors.size() <= anchorIndex) {
			return inputAnchors.get(inputsCout - 1);
		}
		
		return inputAnchors.get(anchorIndex);
	}
	
	private void initAnchors() {
		inputAnchors = new ArrayList<ConnectionAnchor>();
		outputAnchors = new ArrayList<ConnectionAnchor>();
		createConnectionAnchors();
	}

	public ConnectionAnchor getOpenSourceAnchor() {
		if (inputAnchors == null) {
			initAnchors();
		}
		return inputAnchors.get(inputsCout);
	}

	public ConnectionAnchor getOpenTargetAnchor() {
		if (inputAnchors == null) {
			initAnchors();
		}
		return outputAnchors.get(outputsCount);
	}

	public void updateAnchors() {
		initAnchors();
		createConnectionAnchors();
	}
	
	public void setInputsCout(int inputsCout) {
		this.inputsCout = inputsCout;
	}
	
	public void setOutputsCount(int outputsCount) {
		this.outputsCount = outputsCount;
	}

	public void setModelConstraint(Rectangle modelConstraint) {
		this.modelConstraint = modelConstraint;
	}
	
}
