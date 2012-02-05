/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.reliability.system.view;

import com.reliability.system.Transition;

import org.eclipse.draw2d.geometry.Rectangle;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.reliability.system.view.TransitionView#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link com.reliability.system.view.TransitionView#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.reliability.system.view.ViewPackage#getTransitionView()
 * @model
 * @generated
 */
public interface TransitionView extends Transition {
	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' attribute.
	 * @see #setConstraints(Rectangle)
	 * @see com.reliability.system.view.ViewPackage#getTransitionView_Constraints()
	 * @model dataType="com.reliability.system.view.Rectangle"
	 * @generated
	 */
	Rectangle getConstraints();

	/**
	 * Sets the value of the '{@link com.reliability.system.view.TransitionView#getConstraints <em>Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraints</em>' attribute.
	 * @see #getConstraints()
	 * @generated
	 */
	void setConstraints(Rectangle value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.reliability.system.view.SystemView#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(SystemView)
	 * @see com.reliability.system.view.ViewPackage#getTransitionView_Owner()
	 * @see com.reliability.system.view.SystemView#getTransitions
	 * @model opposite="transitions" transient="false"
	 * @generated
	 */
	SystemView getOwner();

	/**
	 * Sets the value of the '{@link com.reliability.system.view.TransitionView#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(SystemView value);

} // TransitionView
