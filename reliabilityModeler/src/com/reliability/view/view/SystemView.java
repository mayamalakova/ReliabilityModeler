/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.reliability.view.view;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import com.reliability.system.Port;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.reliability.view.view.SystemView#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link com.reliability.view.view.SystemView#getPorts <em>Ports</em>}</li>
 *   <li>{@link com.reliability.view.view.SystemView#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.reliability.view.view.ViewPackage#getSystemView()
 * @model
 * @generated
 */
public interface SystemView extends EObject {

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link com.reliability.view.view.TransitionView}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see com.reliability.view.view.ViewPackage#getSystemView_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<TransitionView> getTransitions();

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link com.reliability.system.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see com.reliability.view.view.ViewPackage#getSystemView_Ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getPorts();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.reliability.view.view.ViewPackage#getSystemView_Name()
	 * @model default=""
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.reliability.view.view.SystemView#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);
} // SystemView
