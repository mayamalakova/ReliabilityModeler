/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.reliability.system.view;

import org.eclipse.emf.ecore.EFactory;
import com.reliability.system.SystemFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.reliability.system.view.ViewPackage
 * @not generated
 */
public interface ViewFactory extends SystemFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ViewFactory eINSTANCE = com.reliability.system.view.impl.ViewFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Transition View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition View</em>'.
	 * @generated
	 */
	TransitionView createTransitionView();

	/**
	 * Returns a new object of class '<em>Port View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port View</em>'.
	 * @generated
	 */
	PortView createPortView();

	/**
	 * Returns a new object of class '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link</em>'.
	 * @generated
	 */
	ViewLink createViewLink();

	/**
	 * Returns a new object of class '<em>Failure View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failure View</em>'.
	 * @generated
	 */
	FailureView createFailureView();

	/**
	 * Returns a new object of class '<em>System View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System View</em>'.
	 * @generated
	 */
	SystemView createSystemView();

	/**
	 * Returns a new object of class '<em>Anchor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Anchor</em>'.
	 * @generated
	 */
	Anchor createAnchor();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ViewPackage getViewPackage();

} //ViewFactory
