/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.reliability.system.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>system</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemTests extends TestSuite {

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
		TestSuite suite = new SystemTests("system Tests");
		suite.addTestSuite(GeneralizedNetTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemTests(String name) {
		super(name);
	}

} //SystemTests
