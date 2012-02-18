package com.system.reliability.modeler.utils;

import org.eclipse.swt.graphics.Color;

public interface Constants {
	public static final int PORT_WIDTH = 40;
	public static final int CONNECTOR_WIDTH = 40;
	public static final int LABEL_HEIGTH = 25;
	public static final int COMPONENT_WIDTH = 60;
	public static final int COMPONENT_HEIGTH = 40;
	
	public static final Color COLOR_DARK_BLUE = new Color(null, 113, 38, 13);
	public static final Color COLOR_LIGHT_BLUE = new Color(null, 226, 75, 24);
	public static final Color COLOR_DARK_YELLOW = new Color(null, 229, 222, 89);
	public static final Color COLOR_LIGHT_YELLOW = new Color(null, 248, 239, 78);
	
	public static final String ACTION_ANALYZE = "analyzeReliability";
	public static final String POLICY_SNAP_TO_GRID = "Snap Feedback";
}
