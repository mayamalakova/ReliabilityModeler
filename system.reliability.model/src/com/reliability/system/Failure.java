/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.reliability.system;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.reliability.system.Failure#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.reliability.system.SystemPackage#getFailure()
 * @model
 * @generated
 */
public interface Failure extends Position {

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.reliability.system.Transition#getFailureState <em>Failure State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(Transition)
	 * @see com.reliability.system.SystemPackage#getFailure_Owner()
	 * @see com.reliability.system.Transition#getFailureState
	 * @model opposite="failureState" transient="false"
	 * @generated
	 */
	Transition getOwner();

	/**
	 * Sets the value of the '{@link com.reliability.system.Failure#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Transition value);
} // Failure
