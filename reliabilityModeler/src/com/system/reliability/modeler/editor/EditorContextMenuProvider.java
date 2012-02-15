package com.system.reliability.modeler.editor;

import org.eclipse.gef.ContextMenuProvider;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.actions.ActionFactory;

import com.system.reliability.modeler.utils.Constants;

public class EditorContextMenuProvider extends ContextMenuProvider {
	private ActionRegistry actionRegistry;

	public EditorContextMenuProvider(EditPartViewer viewer, ActionRegistry registry) {
		super(viewer);
		setActionRegistry(registry);
	}

	@Override
	public void buildContextMenu(IMenuManager menu) {
		IAction action;
		GEFActionConstants.addStandardActionGroups(menu);
		action = getActionRegistry().getAction(ActionFactory.UNDO.getId());
		menu.appendToGroup(GEFActionConstants.GROUP_UNDO, action);
		action = getActionRegistry().getAction(ActionFactory.REDO.getId());
		menu.appendToGroup(GEFActionConstants.GROUP_UNDO, action);
		action = getActionRegistry().getAction(ActionFactory.DELETE.getId());
		menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);
		action = getActionRegistry().getAction(Constants.ACTION_ANALYZE);
		menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);
	}

	private ActionRegistry getActionRegistry() {
		return actionRegistry;
	}

	private void setActionRegistry(ActionRegistry registry) {
		actionRegistry = registry;
	}
}