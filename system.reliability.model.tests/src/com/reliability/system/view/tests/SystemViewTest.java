/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.reliability.system.view.tests;

import com.reliability.system.tests.GeneralizedNetTest;

import com.reliability.system.view.SystemView;
import com.reliability.system.view.ViewFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>System View</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemViewTest extends GeneralizedNetTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SystemViewTest.class);
	}

	/**
	 * Constructs a new System View test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemViewTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this System View test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SystemView getFixture() {
		return (SystemView)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ViewFactory.eINSTANCE.createSystemView());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //SystemViewTest
