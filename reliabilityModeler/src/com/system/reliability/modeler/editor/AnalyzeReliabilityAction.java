package com.system.reliability.modeler.editor;

import java.util.Map;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import com.reliability.system.GeneralizedNet;
import com.reliability.system.Port;
import com.system.reliability.analyzer.ReliabilityAnalyzer;
import com.system.reliability.analyzer.ReliabilityProfile;
import com.system.reliability.modeler.RgetPlugin;
import com.system.reliability.modeler.utils.Constants;
import com.system.reliability.modeler.utils.ReliabilityModelUtils;

public class AnalyzeReliabilityAction extends Action {
	private ReliabilityAnalyzer analyzer;

	public AnalyzeReliabilityAction() {
		setId(Constants.ACTION_ANALYZE);
		setText("Analyze Reliability");
		setToolTipText("Analyze Reliability");
		ImageDescriptor image = AbstractUIPlugin.imageDescriptorFromPlugin(RgetPlugin.PLUGIN_ID,	"icons/rget_analyze_16.png");
		if (image != null) {
			setImageDescriptor(image);
		}
		analyzer = new ReliabilityAnalyzer();
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

	public void setSystemModel(GeneralizedNet model) {
		analyzer.setSysteModel(model);
		setEnabled(true);
	}
	
}
