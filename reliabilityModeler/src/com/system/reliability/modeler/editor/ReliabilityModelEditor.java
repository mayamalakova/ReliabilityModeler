package com.system.reliability.modeler.editor;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;

import com.reliability.system.view.SystemView;
import com.reliability.system.view.ViewPackage;
import com.system.reliability.modeler.editor.palette.ModelEditorPalette;
import com.system.reliability.modeler.editor.part.ReliabilityEditPartFactory;

public class ReliabilityModelEditor extends GraphicalEditorWithFlyoutPalette {
	private SystemView system;
	private Resource systemResource;

	public ReliabilityModelEditor() {
		setEditDomain(new DefaultEditDomain(this));
	}

	@Override
	protected PaletteRoot getPaletteRoot() {
		ModelEditorPalette palette = new ModelEditorPalette();
		return palette;
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		if (systemResource == null) {
			return;
		}

		try {
			systemResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
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

		if (input instanceof IFileEditorInput) {
			IFileEditorInput fileInput = (IFileEditorInput) input;
			IFile file = fileInput.getFile();
			loadModel(file.getFullPath().toOSString());
		}
	}

	private void loadModel(String fileLocaltion) {
		ViewPackage.eINSTANCE.eClass();
		ResourceSet resourceSet = new ResourceSetImpl();
		URI uri = URI.createFileURI(fileLocaltion);
		systemResource = resourceSet.createResource(uri);

		try {
			systemResource.load(null);
			system = (SystemView) systemResource.getContents().get(0);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
