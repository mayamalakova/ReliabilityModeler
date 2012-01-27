package com.system.reliability.modeler.editor;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette;

import com.system.reliability.modeler.utils.ReliabilityModelUtils;

public class ReliabilityModelEditor extends GraphicalEditorWithFlyoutPalette {

	public ReliabilityModelEditor(){
		setEditDomain(new DefaultEditDomain(this));
	}
	
	@Override
	protected PaletteRoot getPaletteRoot() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Auto-generated method stub

	}

	@Override 
	protected void initializeGraphicalViewer() {
	    super.initializeGraphicalViewer();
	    getGraphicalViewer().setContents(ReliabilityModelUtils.createModel());
	  } 
	
	@Override 
	protected void configureGraphicalViewer() {
	    super.configureGraphicalViewer();
	    getGraphicalViewer().setEditPartFactory(new ReliabilityEditPartFactory());
	  } 
}
