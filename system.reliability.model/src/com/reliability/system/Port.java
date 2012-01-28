/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.reliability.system;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.reliability.system.Port#getTransitionRow <em>Transition Row</em>}</li>
 *   <li>{@link com.reliability.system.Port#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.reliability.system.SystemPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends Position {
	/**
	 * Returns the value of the '<em><b>Transition Row</b></em>' containment reference list.
	 * The list contents are of type {@link com.reliability.system.TransitionMatrixElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition Row</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Row</em>' containment reference list.
	 * @see com.reliability.system.SystemPackage#getPort_TransitionRow()
	 * @model containment="true"
	 *        extendedMetaData="description='Fuzzy predicates describing transition conditions'"
	 * @generated
	 */
	EList<TransitionMatrixElement> getTransitionRow();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.reliability.system.PositionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see com.reliability.system.PositionType
	 * @see #setType(PositionType)
	 * @see com.reliability.system.SystemPackage#getPort_Type()
	 * @model unique="false"
	 * @generated
	 */
	PositionType getType();

	/**
	 * Sets the value of the '{@link com.reliability.system.Port#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see com.reliability.system.PositionType
	 * @see #getType()
	 * @generated
	 */
	void setType(PositionType value);

} // Port
