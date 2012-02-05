/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.reliability.system.view;

import com.reliability.system.Port;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.reliability.system.view.PortView#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.reliability.system.view.ViewPackage#getPortView()
 * @model
 * @generated
 */
public interface PortView extends Port, ViewObject {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.reliability.system.view.SystemView#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(SystemView)
	 * @see com.reliability.system.view.ViewPackage#getPortView_Owner()
	 * @see com.reliability.system.view.SystemView#getPorts
	 * @model opposite="ports" transient="false"
	 * @generated
	 */
	SystemView getOwner();

	/**
	 * Sets the value of the '{@link com.reliability.system.view.PortView#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(SystemView value);

} // PortView