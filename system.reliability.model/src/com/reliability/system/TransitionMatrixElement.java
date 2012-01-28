/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.reliability.system;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Matrix Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.reliability.system.TransitionMatrixElement#getOppositePosition <em>Opposite Position</em>}</li>
 *   <li>{@link com.reliability.system.TransitionMatrixElement#getNecessity <em>Necessity</em>}</li>
 *   <li>{@link com.reliability.system.TransitionMatrixElement#getPossibility <em>Possibility</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.reliability.system.SystemPackage#getTransitionMatrixElement()
 * @model
 * @generated
 */
public interface TransitionMatrixElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Opposite Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opposite Position</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite Position</em>' reference.
	 * @see #setOppositePosition(Position)
	 * @see com.reliability.system.SystemPackage#getTransitionMatrixElement_OppositePosition()
	 * @model required="true"
	 * @generated
	 */
	Position getOppositePosition();

	/**
	 * Sets the value of the '{@link com.reliability.system.TransitionMatrixElement#getOppositePosition <em>Opposite Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite Position</em>' reference.
	 * @see #getOppositePosition()
	 * @generated
	 */
	void setOppositePosition(Position value);

	/**
	 * Returns the value of the '<em><b>Necessity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Necessity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Necessity</em>' attribute.
	 * @see #setNecessity(float)
	 * @see com.reliability.system.SystemPackage#getTransitionMatrixElement_Necessity()
	 * @model unique="false"
	 * @generated
	 */
	float getNecessity();

	/**
	 * Sets the value of the '{@link com.reliability.system.TransitionMatrixElement#getNecessity <em>Necessity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Necessity</em>' attribute.
	 * @see #getNecessity()
	 * @generated
	 */
	void setNecessity(float value);

	/**
	 * Returns the value of the '<em><b>Possibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Possibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Possibility</em>' attribute.
	 * @see #setPossibility(float)
	 * @see com.reliability.system.SystemPackage#getTransitionMatrixElement_Possibility()
	 * @model unique="false"
	 * @generated
	 */
	float getPossibility();

	/**
	 * Sets the value of the '{@link com.reliability.system.TransitionMatrixElement#getPossibility <em>Possibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Possibility</em>' attribute.
	 * @see #getPossibility()
	 * @generated
	 */
	void setPossibility(float value);

} // TransitionMatrixElement
