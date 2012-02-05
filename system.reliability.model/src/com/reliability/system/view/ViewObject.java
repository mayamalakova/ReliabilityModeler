/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.reliability.system.view;

import org.eclipse.draw2d.geometry.Rectangle;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.reliability.system.view.ViewObject#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.reliability.system.view.ViewPackage#getViewObject()
 * @model abstract="true"
 * @generated
 */
public interface ViewObject extends EObject {
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
	 * @see com.reliability.system.view.ViewPackage#getViewObject_Constraints()
	 * @model dataType="com.reliability.system.view.Rectangle"
	 * @generated
	 */
	Rectangle getConstraints();

	/**
	 * Sets the value of the '{@link com.reliability.system.view.ViewObject#getConstraints <em>Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraints</em>' attribute.
	 * @see #getConstraints()
	 * @generated
	 */
	void setConstraints(Rectangle value);

} // ViewObject
