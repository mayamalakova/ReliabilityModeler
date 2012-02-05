/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.reliability.system.view.tests;

import com.reliability.system.tests.PortTest;

import com.reliability.system.view.PortView;
import com.reliability.system.view.ViewFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Port View</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PortViewTest extends PortTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PortViewTest.class);
	}

	/**
	 * Constructs a new Port View test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortViewTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Port View test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PortView getFixture() {
		return (PortView)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ViewFactory.eINSTANCE.createPortView());
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

} //PortViewTest
