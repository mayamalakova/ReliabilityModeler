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
	    mainGroup = new PaletteGroup("Controls");
	    add(mainGroup);
	    addSelectionTool();
		   
	    addLinkTool();
	  }
	 
	private void addElemensGroup() {
		elementsGroup = new PaletteDrawer("Model Elements", ImageDescriptor.createFromFile(
				RgetPlugin.class, "images/rget_model_16.png"));
		add(elementsGroup);
		addComponentTool();
		addConnectorTool();
		addPortTool();
		addFailureTool();
	}
	  
	  private void addComponentTool() {
	    CreationToolEntry entry = new CreationToolEntry("Component", "Create a new Component", new ComponentObjectFactory(), 
	    		ImageDescriptor.createFromFile(RgetPlugin.class, "images/component_16.png"),
				ImageDescriptor.createFromFile(RgetPlugin.class, "images/component_16.png"));
	    entry.setToolClass(CreationAndDirectEditTool.class);
	    elementsGroup.add(entry);
	  }
	 
	  private void addConnectorTool() {
	    CreationToolEntry entry = new CreationToolEntry("Connector", "Create a new Connector", new ConnectorObjectFactory(), 
	    		ImageDescriptor.createFromFile(RgetPlugin.class, "images/connector_16.png"), 
	    		ImageDescriptor.createFromFile(RgetPlugin.class, "images/connector_16.png"));
	    entry.setToolClass(CreationAndDirectEditTool.class);
	    elementsGroup.add(entry);
	  }
	  
	private void addPortTool() {
		CreationToolEntry entry = new CreationToolEntry("Port", "Create a new Port", 	new PortObjectFactory(), 
				ImageDescriptor.createFromFile(RgetPlugin.class, "images/port_16.png"),  
				ImageDescriptor.createFromFile(RgetPlugin.class, "images/port_16.png"));
		entry.setToolClass(CreationAndDirectEditTool.class);
		elementsGroup.add(entry);
	}
	
	private void addFailureTool() {
		CreationToolEntry entry = new CreationToolEntry("Failure", "Create a new Failure", 	new FailureObjectFactory(), 
				ImageDescriptor.createFromFile(RgetPlugin.class, "images/failure_16.png"), 
				ImageDescriptor.createFromFile(RgetPlugin.class, "images/failure_16.png"));
		entry.setToolClass(CreationAndDirectEditTool.class);
		elementsGroup.add(entry);
	}

	private void addLinkTool() {
		CreationToolEntry entry = new ConnectionCreationToolEntry("Link", "Create a new Link", 	new LinkObjectFactory(), 
				ImageDescriptor.createFromFile(RgetPlugin.class, "images/link_16.gif"), 
				ImageDescriptor.createFromFile(RgetPlugin.class, "images/link_16.gif"));
		mainGroup.add(entry);
	}
	
}
