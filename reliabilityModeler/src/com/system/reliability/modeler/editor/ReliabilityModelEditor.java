package com.system.reliability.modeler.editor;

import java.io.IOException;
import java.util.EventObject;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gef.ContextMenuProvider;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette;
import org.eclipse.gef.ui.properties.UndoablePropertySheetEntry;
import org.eclipse.gef.ui.properties.UndoablePropertySheetPage;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.IPropertySourceProvider;
import org.eclipse.ui.views.properties.PropertySheetPage;

import com.reliability.system.GeneralizedNet;
import com.reliability.system.view.ViewPackage;
import com.system.reliability.modeler.editor.palette.ModelEditorPalette;
import com.system.reliability.modeler.editor.part.ReliabilityEditPartFactory;
import com.system.reliability.modeler.properties.RgetPropertySourceProvider;

public class ReliabilityModelEditor extends GraphicalEditorWithFlyoutPalette {
	private GeneralizedNet system;
	private Resource systemResource;
	private PropertySheetPage propertyPage;
	private AnalyzeReliabilityAction analyzeAction;

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
			getCommandStack().markSaveLocation();
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
		analyzeAction = new AnalyzeReliabilityAction(this);
		analyzeAction.setModel(system);
		getActionRegistry().registerAction(analyzeAction);
		ContextMenuProvider menuProvider = new EditorContextMenuProvider(getGraphicalViewer(), getActionRegistry());
		getGraphicalViewer().setContextMenu(menuProvider);
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
			system = (GeneralizedNet) systemResource.getContents().get(0);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	 /**
     * Change the editor state to dirty when a command gets executed
     */
    @Override
    public void commandStackChanged(EventObject event) {
        firePropertyChange(PROP_DIRTY);
        super.commandStackChanged(event);
    }
 
    @Override @SuppressWarnings("rawtypes")
    public Object getAdapter(Class type) {
        if(type.equals(IPropertySheetPage.class)) {
			if (propertyPage == null) {
				propertyPage = (UndoablePropertySheetPage) super.getAdapter(type);
				IPropertySourceProvider sourceProvider = new RgetPropertySourceProvider();
				UndoablePropertySheetEntry root = new UndoablePropertySheetEntry(getCommandStack());
				root.setPropertySourceProvider(sourceProvider);
				propertyPage.setRootEntry(root);
			}
            return propertyPage;
        }
        return super.getAdapter(type);
    }
}
