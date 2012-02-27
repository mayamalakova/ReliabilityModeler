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
import com.system.reliability.modeler.RatPlugin;
import com.system.reliability.modeler.i18n.Messages;
import com.system.reliability.modeler.utils.Constants;
import com.system.reliability.modeler.utils.ReliabilityModelUtils;

public class AnalyzeReliabilityAction extends Action {
	private ReliabilityAnalyzer analyzer;

	public AnalyzeReliabilityAction() {
		setId(Constants.ACTION_ANALYZE);
		setText(Messages.action_analyze_label);
		setToolTipText(Messages.action_analyze_tooltip);
		ImageDescriptor image = AbstractUIPlugin.imageDescriptorFromPlugin(RatPlugin.PLUGIN_ID,	"icons/rget_analyze_16.png"); //$NON-NLS-1$
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
		MessageDialog.openInformation(shell, Messages.action_dialog_title, ReliabilityModelUtils.getReliabilityProfilesText(reliabilityProfiles));
	}

	public void setSystemModel(GeneralizedNet model) {
		analyzer.setSysteModel(model);
		setEnabled(true);
	}
	
}
