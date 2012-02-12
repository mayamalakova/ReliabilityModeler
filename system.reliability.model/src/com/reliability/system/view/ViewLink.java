/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.reliability.system.view;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.reliability.system.view.ViewLink#getSource <em>Source</em>}</li>
 *   <li>{@link com.reliability.system.view.ViewLink#getTarget <em>Target</em>}</li>
 *   <li>{@link com.reliability.system.view.ViewLink#getBendpoints <em>Bendpoints</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.reliability.system.view.ViewPackage#getViewLink()
 * @model
 * @generated
 */
public interface ViewLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.reliability.system.view.ViewObject#getOutgoingLinks <em>Outgoing Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see #setSource(ViewObject)
	 * @see com.reliability.system.view.ViewPackage#getViewLink_Source()
	 * @see com.reliability.system.view.ViewObject#getOutgoingLinks
	 * @model opposite="outgoingLinks" keys="label" transient="false"
	 * @generated
	 */
	ViewObject getSource();

	/**
	 * Sets the value of the '{@link com.reliability.system.view.ViewLink#getSource <em>Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' container reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ViewObject value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.reliability.system.view.ViewObject#getIncomingLinks <em>Incoming Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ViewObject)
	 * @see com.reliability.system.view.ViewPackage#getViewLink_Target()
	 * @see com.reliability.system.view.ViewObject#getIncomingLinks
	 * @model opposite="incomingLinks" keys="label"
	 * @generated
	 */
	ViewObject getTarget();

	/**
	 * Sets the value of the '{@link com.reliability.system.view.ViewLink#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ViewObject value);

	/**
	 * Returns the value of the '<em><b>Bendpoints</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.draw2d.geometry.Point}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bendpoints</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bendpoints</em>' attribute list.
	 * @see com.reliability.system.view.ViewPackage#getViewLink_Bendpoints()
	 * @model dataType="com.reliability.system.view.Point"
	 * @generated
	 */
	EList<Point> getBendpoints();

} // ViewLink
