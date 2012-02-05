/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.reliability.system.view;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.reliability.system.view.ViewPackage
 * @generated
 */
public interface ViewFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ViewFactory eINSTANCE = com.reliability.system.view.impl.ViewFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>System View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System View</em>'.
	 * @generated
	 */
	SystemView createSystemView();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ViewPackage getViewPackage();

} //ViewFactory
