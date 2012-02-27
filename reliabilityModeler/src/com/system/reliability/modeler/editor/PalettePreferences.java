package com.system.reliability.modeler.editor;

import org.eclipse.draw2d.PositionConstants;
import org.eclipse.gef.ui.palette.FlyoutPaletteComposite;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * Preferences for the edotor palette
 */
public class PalettePreferences implements FlyoutPaletteComposite.FlyoutPreferences {
	protected static final int UNCOLLAPSED_PINNED = 4;
    private static final String PALETTE_DOCK_LOCATION = "org.eclipse.gmf.pdock"; //$NON-NLS-1$
    private static final String PALETTE_SIZE = "org.eclipse.gmf.psize"; //$NON-NLS-1$
    private static final String PALETTE_STATE = "org.eclipse.gmf.pstate"; //$NON-NLS-1$

    private IPreferenceStore preferences;

    public PalettePreferences(IPreferenceStore preferenceStore) {
        preferences = preferenceStore;
    }
    
    public int getDockLocation() {
        if (preferences.contains(PALETTE_DOCK_LOCATION)) {
            return preferences.getInt(PALETTE_DOCK_LOCATION);
        } else {
            return PositionConstants.WEST;
        }
    }

    public int getPaletteState() {
        if (preferences.contains(PALETTE_STATE)) {
            return preferences.getInt(PALETTE_STATE);
        } else {
        	return UNCOLLAPSED_PINNED;
        }
    }

    public int getPaletteWidth() {
        if (preferences.contains(PALETTE_SIZE)) {
            return preferences.getInt(PALETTE_SIZE);
        } else {
            return 130;
        }
    }
    
    public void setDockLocation(int location) {
        preferences.setValue(PALETTE_DOCK_LOCATION, location);
    }
    
    public void setPaletteState(int state) {
        preferences.setValue(PALETTE_STATE, state);
    }
    
    public void setPaletteWidth(int width) {
        preferences.setValue(PALETTE_SIZE, width);
    }   
}

