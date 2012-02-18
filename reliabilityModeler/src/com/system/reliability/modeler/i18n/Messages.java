package com.system.reliability.modeler.i18n;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "com.system.reliability.modeler.i18n"; //$NON-NLS-1$
	public static String profile_message_not_enough_data;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {}
}
