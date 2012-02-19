package com.system.reliability.modeler.i18n;

import java.text.MessageFormat;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "com.system.reliability.modeler.i18n.messages"; //$NON-NLS-1$
	public static String action_analyze_label;
	public static String action_analyze_tooltip;
	public static String action_dialog_title;
	public static String actions_show_hide_grid;
	public static String actions_snap_to_grid;
	public static String editor_message_load_failed;
	public static String editor_message_save_failed;
	public static String palette_create_component;
	public static String palette_create_component_tooltip;
	public static String palette_create_connector;
	public static String palette_create_connector_tooltip;
	public static String palette_create_failure;
	public static String palette_create_failure_tooltip;
	public static String palette_create_port;
	public static String palette_create_port_tooltip;
	public static String palette_drawer_elements;
	public static String palette_link_elements;
	public static String palette_link_elements_tooltip;
	public static String profile_message_not_enough_data;
	public static String profile_result;
	
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
		
	}

	private Messages() {}
	
	public String getString(String key, Object[] parameters ){
		return MessageFormat.format(key, parameters);
	}
	
}
