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
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.reliability.system.Transition#getName <em>Name</em>}</li>
 *   <li>{@link com.reliability.system.Transition#getDescription <em>Description</em>}</li>
 *   <li>{@link com.reliability.system.Transition#getInputPorts <em>Input Ports</em>}</li>
 *   <li>{@link com.reliability.system.Transition#getOutputPorts <em>Output Ports</em>}</li>
 *   <li>{@link com.reliability.system.Transition#getFailureState <em>Failure State</em>}</li>
 *   <li>{@link com.reliability.system.Transition#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.reliability.system.SystemPackage#getTransition()
 * @model extendedMetaData="name='Transition' kind='elementOnly'"
 * @generated
 */
public interface Transition extends EObject {
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
	 * @see com.reliability.system.SystemPackage#getTransition_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.reliability.system.Transition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see com.reliability.system.SystemPackage#getTransition_Description()
	 * @model unique="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.reliability.system.Transition#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Input Ports</b></em>' reference list.
	 * The list contents are of type {@link com.reliability.system.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Ports</em>' reference list.
	 * @see com.reliability.system.SystemPackage#getTransition_InputPorts()
	 * @model required="true"
	 * @generated
	 */
	EList<Port> getInputPorts();

	/**
	 * Returns the value of the '<em><b>Output Ports</b></em>' reference list.
	 * The list contents are of type {@link com.reliability.system.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Ports</em>' reference list.
	 * @see com.reliability.system.SystemPackage#getTransition_OutputPorts()
	 * @model required="true"
	 * @generated
	 */
	EList<Port> getOutputPorts();

	/**
	 * Returns the value of the '<em><b>Failure State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure State</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure State</em>' containment reference.
	 * @see #setFailureState(Failure)
	 * @see com.reliability.system.SystemPackage#getTransition_FailureState()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Failure getFailureState();

	/**
	 * Sets the value of the '{@link com.reliability.system.Transition#getFailureState <em>Failure State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure State</em>' containment reference.
	 * @see #getFailureState()
	 * @generated
	 */
	void setFailureState(Failure value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.reliability.system.TransitionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see com.reliability.system.TransitionType
	 * @see #setType(TransitionType)
	 * @see com.reliability.system.SystemPackage#getTransition_Type()
	 * @model unique="false"
	 * @generated
	 */
	TransitionType getType();

	/**
	 * Sets the value of the '{@link com.reliability.system.Transition#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see com.reliability.system.TransitionType
	 * @see #getType()
	 * @generated
	 */
	void setType(TransitionType value);

} // Transition
