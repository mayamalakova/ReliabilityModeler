package com.system.reliability.modeler.editor.command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.gef.commands.Command;

import com.reliability.system.view.ViewLink;
import com.reliability.system.view.ViewObject;

public abstract class DeleteViewObjectCommand extends Command {
	private Map<ViewLink, ViewObject> linkSources;
	private Map<ViewLink, ViewObject> linkTargets;
	private List<ViewLink> links;

	protected void detachLinks() {
		links = new ArrayList<ViewLink>();
		linkSources = new HashMap<ViewLink, ViewObject>();
		linkTargets = new HashMap<ViewLink, ViewObject>();
		links.addAll(getSelectedObject().getIncomingLinks());
		links.addAll(getSelectedObject().getOutgoingLinks());
		for (ViewLink link : links) {
			linkSources.put(link, link.getSource());
			linkTargets.put(link, link.getTarget());
			link.setSource(null);
			link.setTarget(null);
		}
	}

	protected void reattachLinks() {
		for (ViewLink link : links) {
			link.setSource(linkSources.get(link));
			link.setTarget(linkTargets.get(link));
		}
	}

	protected abstract ViewObject getSelectedObject();

}
