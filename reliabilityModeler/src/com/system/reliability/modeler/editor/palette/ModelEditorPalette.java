package com.system.reliability.modeler.editor.palette;

import org.eclipse.gef.palette.ConnectionCreationToolEntry;
import org.eclipse.gef.palette.CreationToolEntry;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.SelectionToolEntry;

import com.system.reliability.modeler.editor.CreationAndDirectEditTool;
import com.system.reliability.modeler.editor.factory.ComponentObjectFactory;
import com.system.reliability.modeler.editor.factory.ConnectorObjectFactory;
import com.system.reliability.modeler.editor.factory.FailureObjectFactory;
import com.system.reliability.modeler.editor.factory.LinkObjectFactory;
import com.system.reliability.modeler.editor.factory.PortObjectFactory;

public class ModelEditorPalette extends PaletteRoot {

	private PaletteGroup group;
	
	public ModelEditorPalette() {
		addGroup();
	    addSelectionTool();
	    addComponentTool();
	    addConnectorTool();
	    addPortTool();
	    addFailureTool();
	    addLinkTool();
	}
	
	private void addSelectionTool() {
	    SelectionToolEntry entry = new SelectionToolEntry();
	    group.add(entry);
	    setDefaultEntry(entry);
	  }
	 
	  private void addGroup() {
	    group = new PaletteGroup("Model Controls");
	    add(group);
	  }
	 
	  private void addComponentTool() {
	    CreationToolEntry entry = new CreationToolEntry("Component", "Create a new Component", new ComponentObjectFactory(), null, null);
	    entry.setToolClass(CreationAndDirectEditTool.class);
	    group.add(entry);
	  }
	 
	  private void addConnectorTool() {
	    CreationToolEntry entry = new CreationToolEntry("Connector", "Create a new Connector", new ConnectorObjectFactory(), null, null);
	    entry.setToolClass(CreationAndDirectEditTool.class);
	    group.add(entry);
	  }
	  
	private void addPortTool() {
		CreationToolEntry entry = new CreationToolEntry("Port", "Create a new Port", 	new PortObjectFactory(), null, null);
		entry.setToolClass(CreationAndDirectEditTool.class);
		group.add(entry);
	}
	
	private void addFailureTool() {
		CreationToolEntry entry = new CreationToolEntry("Failure", "Create a new Failure", 	new FailureObjectFactory(), null, null);
		entry.setToolClass(CreationAndDirectEditTool.class);
		group.add(entry);
	}

	private void addLinkTool() {
		CreationToolEntry entry = new ConnectionCreationToolEntry("Link", "Create a new Link", 	new LinkObjectFactory(), null, null);
		group.add(entry);
	}
	
}
