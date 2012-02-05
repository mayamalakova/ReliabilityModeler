package com.system.reliability.modeler.editor.palette;

import org.eclipse.gef.palette.CreationToolEntry;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.SelectionToolEntry;

import com.reliability.system.TransitionType;
import com.system.reliability.modeler.editor.factory.ComponentObjectFactory;
import com.system.reliability.modeler.editor.factory.ConnectorObjectFactory;

public class ModelEditorPalette extends PaletteRoot {

	private PaletteGroup group;
	
	public ModelEditorPalette() {
		addGroup();
	    addSelectionTool();
	    addComponentTool();
	    addConnectorTool();
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
	    entry.setType(TransitionType.COMPONENT	);
	    group.add(entry);
	  }
	 
	  private void addConnectorTool() {
	    CreationToolEntry entry = new CreationToolEntry("Connector", "Create a new Connector", new ConnectorObjectFactory(), null, null);
	    entry.setType(TransitionType.CONNECTOR);
	    group.add(entry);
	  }
}
