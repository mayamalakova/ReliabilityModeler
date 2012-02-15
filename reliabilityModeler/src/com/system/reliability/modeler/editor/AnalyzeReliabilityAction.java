package com.system.reliability.modeler.editor;

import java.util.Map;

import org.eclipse.gef.ui.actions.WorkbenchPartAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import com.reliability.system.GeneralizedNet;
import com.reliability.system.Port;
import com.system.reliability.analyzer.ReliabilityAnalyzer;
import com.system.reliability.analyzer.ReliabilityProfile;
import com.system.reliability.modeler.RgetPlugin;
import com.system.reliability.modeler.utils.Constants;
import com.system.reliability.modeler.utils.ReliabilityModelUtils;

public class AnalyzeReliabilityAction extends WorkbenchPartAction {
	private ReliabilityAnalyzer analyzer = new ReliabilityAnalyzer();

	public AnalyzeReliabilityAction(IWorkbenchPart part) {
		super(part);
	}

	@Override
	protected void init() {
		setText("Analyze Reliability");
		setId(Constants.ACTION_ANALYZE);
		ImageDescriptor image = AbstractUIPlugin.imageDescriptorFromPlugin(RgetPlugin.PLUGIN_ID,	"icons/rget_analyze_16.png");
		if (image != null) {
			setImageDescriptor(image);
		}
		setEnabled(false);
	}

	@Override
	protected boolean calculateEnabled() {
		if (analyzer.getSystemModel() != null) {
			return true;
		}
		
		return false;
	}

	public void setModel(GeneralizedNet model) {
		analyzer.setSysteModel(model);
	}

	@Override
	public void run() {
		showAnalyzisResults();
	}

	private void showAnalyzisResults() {
		Shell shell = PlatformUI.getWorkbench().getModalDialogShellProvider().getShell();
		Map<Port, ReliabilityProfile> reliabilityProfiles = analyzer.estimateReliability();
		MessageDialog.openInformation(shell, "Reliability Analyzis", ReliabilityModelUtils.getReliabilityProfilesText(reliabilityProfiles));
	}
	
}
