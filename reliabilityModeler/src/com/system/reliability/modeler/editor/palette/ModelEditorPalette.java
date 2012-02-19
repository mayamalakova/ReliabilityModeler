package com.system.reliability.modeler.editor.palette;

import org.eclipse.gef.palette.ConnectionCreationToolEntry;
import org.eclipse.gef.palette.CreationToolEntry;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.SelectionToolEntry;
import org.eclipse.jface.resource.ImageDescriptor;

import com.system.reliability.modeler.RgetPlugin;
import com.system.reliability.modeler.editor.CreationAndDirectEditTool;
import com.system.reliability.modeler.editor.factory.ComponentObjectFactory;
import com.system.reliability.modeler.editor.factory.ConnectorObjectFactory;
import com.system.reliability.modeler.editor.factory.FailureObjectFactory;
import com.system.reliability.modeler.editor.factory.LinkObjectFactory;
import com.system.reliability.modeler.editor.factory.PortObjectFactory;
import com.system.reliability.modeler.i18n.Messages;

public class ModelEditorPalette extends PaletteRoot {

	private PaletteGroup mainGroup;
	private PaletteContainer elementsGroup;
	
	public ModelEditorPalette() {
		addControlGroup();
	    addElemensGroup();
	}
	
	private void addSelectionTool() {
	    SelectionToolEntry entry = new SelectionToolEntry();
	    mainGroup.add(entry);
	    setDefaultEntry(entry);
	  }
	 
	  private void addControlGroup() {
	    mainGroup = new PaletteGroup("Controls"); //$NON-NLS-1$
	    add(mainGroup);
	    addSelectionTool();
		   
	    addLinkTool();
	  }
	 
	private void addElemensGroup() {
		elementsGroup = new PaletteDrawer(Messages.palette_drawer_elements, ImageDescriptor.createFromFile(
				RgetPlugin.class, "images/rget_model_16.png")); //$NON-NLS-1$
		add(elementsGroup);
		addComponentTool();
		addConnectorTool();
		addPortTool();
		addFailureTool();
	}
	  
	  private void addComponentTool() {
	    CreationToolEntry entry = new CreationToolEntry(Messages.palette_create_component, Messages.palette_create_component_tooltip, new ComponentObjectFactory(), 
	    		ImageDescriptor.createFromFile(RgetPlugin.class, "images/component_16.png"), //$NON-NLS-1$
				ImageDescriptor.createFromFile(RgetPlugin.class, "images/component_16.png")); //$NON-NLS-1$
	    entry.setToolClass(CreationAndDirectEditTool.class);
	    elementsGroup.add(entry);
	  }
	 
	  private void addConnectorTool() {
	    CreationToolEntry entry = new CreationToolEntry(Messages.palette_create_connector, Messages.palette_create_connector_tooltip, new ConnectorObjectFactory(), 
	    		ImageDescriptor.createFromFile(RgetPlugin.class, "images/connector_16.png"),  //$NON-NLS-1$
	    		ImageDescriptor.createFromFile(RgetPlugin.class, "images/connector_16.png")); //$NON-NLS-1$
	    entry.setToolClass(CreationAndDirectEditTool.class);
	    elementsGroup.add(entry);
	  }
	  
	private void addPortTool() {
		CreationToolEntry entry = new CreationToolEntry(Messages.palette_create_port, Messages.palette_create_port_tooltip, 	new PortObjectFactory(), 
				ImageDescriptor.createFromFile(RgetPlugin.class, "images/port_16.png"),   //$NON-NLS-1$
				ImageDescriptor.createFromFile(RgetPlugin.class, "images/port_16.png")); //$NON-NLS-1$
		entry.setToolClass(CreationAndDirectEditTool.class);
		elementsGroup.add(entry);
	}
	
	private void addFailureTool() {
		CreationToolEntry entry = new CreationToolEntry(Messages.palette_create_failure, Messages.palette_create_failure_tooltip, 	new FailureObjectFactory(), 
				ImageDescriptor.createFromFile(RgetPlugin.class, "images/failure_16.png"),  //$NON-NLS-1$
				ImageDescriptor.createFromFile(RgetPlugin.class, "images/failure_16.png")); //$NON-NLS-1$
		entry.setToolClass(CreationAndDirectEditTool.class);
		elementsGroup.add(entry);
	}

	private void addLinkTool() {
		CreationToolEntry entry = new ConnectionCreationToolEntry(Messages.palette_link_elements, Messages.palette_link_elements_tooltip, 	new LinkObjectFactory(), 
				ImageDescriptor.createFromFile(RgetPlugin.class, "images/link_16.gif"),  //$NON-NLS-1$
				ImageDescriptor.createFromFile(RgetPlugin.class, "images/link_16.gif")); //$NON-NLS-1$
		mainGroup.add(entry);
	}
	
}
