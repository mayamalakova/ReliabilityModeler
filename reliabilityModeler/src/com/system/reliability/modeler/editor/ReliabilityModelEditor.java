package com.system.reliability.modeler.editor;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;

import com.reliability.view.view.SystemView;
import com.system.reliability.modeler.editor.part.ReliabilityEditPartFactory;
import com.system.reliability.modeler.utils.ReliabilityModelUtils;

public class ReliabilityModelEditor extends GraphicalEditorWithFlyoutPalette {
	private SystemView system;

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
	    getGraphicalViewer().setContents(system);
	  } 
	
	@Override 
	protected void configureGraphicalViewer() {
	    super.configureGraphicalViewer();
	    getGraphicalViewer().setEditPartFactory(new ReliabilityEditPartFactory());
	  }

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		super.init(site, input);
		
		if(input instanceof IFileEditorInput) {
		    IFileEditorInput fileInput = (IFileEditorInput) input;
		    IFile file = fileInput.getFile();
		    system = (SystemView) ReliabilityModelUtils.createModelFromFile(file.getFullPath().toOSString());
		}
	} 
	
	
}
