/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.reliability.system.view.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>view</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new ViewTests("view Tests");
		suite.addTestSuite(TransitionViewTest.class);
		suite.addTestSuite(PortViewTest.class);
		suite.addTestSuite(FailureViewTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewTests(String name) {
		super(name);
	}

} //ViewTests
