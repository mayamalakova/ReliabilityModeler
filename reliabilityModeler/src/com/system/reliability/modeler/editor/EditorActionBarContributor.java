package com.system.reliability.modeler.editor;

import org.eclipse.gef.ui.actions.ActionBarContributor;
import org.eclipse.gef.ui.actions.DeleteRetargetAction;
import org.eclipse.gef.ui.actions.RedoRetargetAction;
import org.eclipse.gef.ui.actions.UndoRetargetAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.actions.ActionFactory;


public class EditorActionBarContributor extends ActionBarContributor {
	AnalyzeReliabilityAction analyzeAction;
	
	@Override
	protected void buildActions() {
		addRetargetAction(new UndoRetargetAction());
		addRetargetAction(new RedoRetargetAction());
		addRetargetAction(new DeleteRetargetAction());
		analyzeAction = new AnalyzeReliabilityAction();
		addAction(analyzeAction);
	}

	@Override
	public void contributeToToolBar(IToolBarManager toolBarManager) {
		super.contributeToToolBar(toolBarManager);
		toolBarManager.add(getAction(ActionFactory.UNDO.getId()));
		toolBarManager.add(getAction(ActionFactory.REDO.getId()));
		toolBarManager.add(getAction(ActionFactory.DELETE.getId()));
//		toolBarManager.add(getAction(Constants.ACTION_ANALYZE));
	}

	@Override
	protected void declareGlobalActionKeys() {
		addGlobalActionKey(ActionFactory.SELECT_ALL.getId());
		addGlobalActionKey(ActionFactory.PASTE.getId());
		addGlobalActionKey(ActionFactory.DELETE.getId());
	}

	@Override
	public void contributeToMenu(IMenuManager menuManager) {
		menuManager.add(analyzeAction);
		super.contributeToMenu(menuManager);
	}

	@Override
	public void setActiveEditor(IEditorPart editor) {
		if (editor instanceof ReliabilityModelEditor) {
			ReliabilityModelEditor reliabilityEditor = (ReliabilityModelEditor) editor;
			analyzeAction.setSystemModel(reliabilityEditor.getModel());
		}
		super.setActiveEditor(editor);
	}
}
