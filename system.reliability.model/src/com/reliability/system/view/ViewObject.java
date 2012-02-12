/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.reliability.system.view;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link com.reliability.system.view.ViewObject#getLabel <em>Label</em>}</li>
 *   <li>{@link com.reliability.system.view.ViewObject#getOutgoingLinks <em>Outgoing Links</em>}</li>
 *   <li>{@link com.reliability.system.view.ViewObject#getIncomingLinks <em>Incoming Links</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see com.reliability.system.view.ViewPackage#getViewObject_Label()
	 * @model default="" transient="true" derived="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link com.reliability.system.view.ViewObject#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Outgoing Links</b></em>' containment reference list.
	 * The list contents are of type {@link com.reliability.system.view.ViewLink}.
	 * It is bidirectional and its opposite is '{@link com.reliability.system.view.ViewLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Links</em>' containment reference list.
	 * @see com.reliability.system.view.ViewPackage#getViewObject_OutgoingLinks()
	 * @see com.reliability.system.view.ViewLink#getSource
	 * @model opposite="source" containment="true"
	 * @generated
	 */
	EList<ViewLink> getOutgoingLinks();

	/**
	 * Returns the value of the '<em><b>Incoming Links</b></em>' reference list.
	 * The list contents are of type {@link com.reliability.system.view.ViewLink}.
	 * It is bidirectional and its opposite is '{@link com.reliability.system.view.ViewLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Links</em>' reference list.
	 * @see com.reliability.system.view.ViewPackage#getViewObject_IncomingLinks()
	 * @see com.reliability.system.view.ViewLink#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<ViewLink> getIncomingLinks();

} // ViewObject
