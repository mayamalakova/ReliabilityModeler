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

import com.reliability.system.tests.SystemTests;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>ReliabilityView</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReliabilityViewAllTests extends TestSuite {

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
		TestSuite suite = new ReliabilityViewAllTests("ReliabilityView Tests");
		suite.addTest(ViewTests.suite());
		suite.addTest(SystemTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReliabilityViewAllTests(String name) {
		super(name);
	}

} //ReliabilityViewAllTests
