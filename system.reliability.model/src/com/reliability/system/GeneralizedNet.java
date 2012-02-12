/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.reliability.system;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalized Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.reliability.system.GeneralizedNet#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link com.reliability.system.GeneralizedNet#getPositions <em>Positions</em>}</li>
 *   <li>{@link com.reliability.system.GeneralizedNet#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.reliability.system.SystemPackage#getGeneralizedNet()
 * @model extendedMetaData="name='GeneralizedNet' kind='elementOnly'"
 * @generated
 */
public interface GeneralizedNet extends EObject {
	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link com.reliability.system.Transition}.
	 * It is bidirectional and its opposite is '{@link com.reliability.system.Transition#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see com.reliability.system.SystemPackage#getGeneralizedNet_Transitions()
	 * @see com.reliability.system.Transition#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Positions</b></em>' containment reference list.
	 * The list contents are of type {@link com.reliability.system.Port}.
	 * It is bidirectional and its opposite is '{@link com.reliability.system.Port#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Positions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positions</em>' containment reference list.
	 * @see com.reliability.system.SystemPackage#getGeneralizedNet_Positions()
	 * @see com.reliability.system.Port#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<Port> getPositions();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.reliability.system.SystemPackage#getGeneralizedNet_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.reliability.system.GeneralizedNet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // GeneralizedNet
