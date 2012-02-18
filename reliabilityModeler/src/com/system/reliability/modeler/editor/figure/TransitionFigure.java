package com.system.reliability.modeler.editor.figure;

import static com.system.reliability.modeler.utils.Constants.LABEL_HEIGTH;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;

import com.system.reliability.modeler.editor.anchor.TransitionAnchor;
import com.system.reliability.modeler.utils.Constants;

public abstract class TransitionFigure extends Figure implements IModelFigure{
	private static final Logger log = Logger.getLogger(TransitionFigure.class);
	
	private List<TransitionAnchor> inputAnchors;
	private List<TransitionAnchor> outputAnchors;
	private Rectangle modelConstraint;
	private int inputsCout;
	private int outputsCount;
	
	public TransitionFigure(int inputsCout, int outputsCount) {
		this.inputsCout = inputsCout;
		this.outputsCount = outputsCount;
		
		initAnchors();
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
	
	public void updateConnectionAnchors() {
		/*********************************************************************/
		if (log.isInfoEnabled()) { log.debug("Updating anchors ");}
		/*********************************************************************/
		updateAnchorListsSize();
		
		int initialOffset = 80;
		int connectionLineHeigth = (modelConstraint.height - getBaseFigureBounds().height);
		
		//sometimes the connection is created before the figure so bounds is still not set
		int inputMargin = (modelConstraint.height > 0) ? connectionLineHeigth / (inputsCout + 1) : 20; 
		int i = 0;
		for (TransitionAnchor inputAnchor: inputAnchors) {
			/*********************************************************************/
			if (log.isDebugEnabled()) { log.debug("Updating inputAnchor anchor " + i + " : " + inputAnchor.getVerticalOffset() + " -> " + (initialOffset + i * inputMargin));}
			/*********************************************************************/
			inputAnchor.setVerticalOffset(initialOffset + (i) * inputMargin);
			inputAnchor.setHorizontalOffset(-1);
			i++;
		}
		
		int outputMargin = (modelConstraint.height > 0) ? connectionLineHeigth / (outputsCount + 1) : 20; 
		i = 0;
		for (TransitionAnchor outputAnchor: outputAnchors) {
			/*********************************************************************/
			if (log.isDebugEnabled()) { log.debug("Updating output anchor " + i + " : " + outputAnchor.getVerticalOffset() + " -> " + (initialOffset + i * outputMargin));}
			/*********************************************************************/
			outputAnchor.setVerticalOffset(initialOffset + (i) * outputMargin);
			outputAnchor.setHorizontalOffset(-1);
			i++;
		}

	}
	
	/**
	 * Add an item or remove an item from the anchor input or output lists. This should happen 
	 * when a link gets created or deleted and the TransitionEditPart gets notified. 
	 * TODO: The size is not supposed to change by more than 1 but keep in mind that not all 
	 * scenarios may have benn considered
	 */
	private void updateAnchorListsSize() {
		if (inputAnchors.size() < inputsCout + 1) {
			/*********************************************************************/
			if (log.isInfoEnabled()) { log.info("Addind anchor size=" + inputAnchors.size() +" count=" + (inputsCout + 1));}
			/*********************************************************************/
			inputAnchors.add(new TransitionAnchor(this));
		} else if (inputAnchors.size() > inputsCout + 1) {
			/*********************************************************************/
			if (log.isInfoEnabled()) { log.info("Removing anchor size=" + inputAnchors.size() +" count=" + (inputsCout + 1));}
			/*********************************************************************/
			inputAnchors.remove(inputsCout + 1);
		}
		
		if (outputAnchors.size() < outputsCount + 1) {
			/*********************************************************************/
			if (log.isDebugEnabled()) { log.debug("Addind anchor size=" + outputAnchors.size() +" count=" + (outputsCount + 1));}
			/*********************************************************************/
			outputAnchors.add(new TransitionAnchor(this));
		} else if (outputAnchors.size() > outputsCount + 1) {
			/*********************************************************************/
			if (log.isDebugEnabled()) { log.debug("Removing anchor size=" + outputAnchors.size() +" count=" + (outputsCount + 1));}
			/*********************************************************************/
			outputAnchors.remove(outputsCount + 1); 
		}
	}
	
	/** 
	 * Get the output anchor at the given index
	 * @param anchorIndex
	 * @return
	 */
	public ConnectionAnchor getOutputConnectionAnchor(int anchorIndex) {
		if (outputAnchors.size() <= anchorIndex) {
			//this should never happen
			/*********************************************************************/
			log.error("Error! Not enought output anchors");
			/*********************************************************************/
			return outputAnchors.get(outputsCount - 1);
		}
		return outputAnchors.get(anchorIndex);
	}

	/** 
	 * Get the input anchor at the given index
	 * @param anchorIndex
	 * @return
	 */
	public ConnectionAnchor getInputConnectionAnchor(int anchorIndex) {
		if (inputAnchors.size() <= anchorIndex) {
			//this should never happen
			/*********************************************************************/
			log.error("Error! Not enought input anchors");
			/*********************************************************************/
			return inputAnchors.get(inputsCout - 1);
		}
		
		return inputAnchors.get(anchorIndex);
	}
	
	/**
	 * Create an initial empty input and output lists of anchors. Each list has one anchor more than
	 * the corresponding number of links. The redundant anchors are for incoming new links
	 */
	private void initAnchors() {
		inputAnchors = new ArrayList<TransitionAnchor>();
		for (int i = 0; i < inputsCout + 1; i++) {
			inputAnchors.add(new TransitionAnchor(this));
		}
		outputAnchors = new ArrayList<TransitionAnchor>();
		for (int i = 0; i < outputsCount + 1; i++) {
			outputAnchors.add(new TransitionAnchor(this));
		}
	}

	public ConnectionAnchor getOpenSourceAnchor() {
		return inputAnchors.get(inputsCout);
	}

	public ConnectionAnchor getOpenTargetAnchor() {
		return outputAnchors.get(outputsCount);
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
