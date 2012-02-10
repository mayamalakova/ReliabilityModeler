/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.reliability.system.view.tests;

import com.reliability.system.tests.FailureTest;

import com.reliability.system.view.FailureView;
import com.reliability.system.view.ViewFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Failure View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link com.reliability.system.view.ViewObject#getLabel() <em>Label</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class FailureViewTest extends FailureTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FailureViewTest.class);
	}

	/**
	 * Constructs a new Failure View test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureViewTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Failure View test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FailureView getFixture() {
		return (FailureView)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ViewFactory.eINSTANCE.createFailureView());
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

	/**
	 * Tests the '{@link com.reliability.system.view.ViewObject#getLabel() <em>Label</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.reliability.system.view.ViewObject#getLabel()
	 * @generated
	 */
	public void testGetLabel() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link com.reliability.system.view.ViewObject#setLabel(java.lang.String) <em>Label</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.reliability.system.view.ViewObject#setLabel(java.lang.String)
	 * @generated
	 */
	public void testSetLabel() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //FailureViewTest
