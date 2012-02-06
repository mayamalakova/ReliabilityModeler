package com.system.reliability.modeler.editor.command;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;

import com.reliability.system.view.ViewLink;

public class CreateBendpointCommant extends Command {
	private int index;
    private Point location;
    private ViewLink link;
    
    @Override 
    public void execute() {
        link.getBendpoints().add(index, location);
    }
 
    @Override 
    public void undo() {
        link.getBendpoints().remove(index);
    }
 
    public void setIndex(int index) {
        this.index = index;
    }
 
    public void setLocation(Point location) {
        this.location = location;
    }
 
    public void setLink(ViewLink link) {
        this.link = link;
    }
}
