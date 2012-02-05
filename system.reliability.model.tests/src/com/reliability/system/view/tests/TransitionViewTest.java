/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.reliability.system.view.tests;

import com.reliability.system.tests.TransitionTest;

import com.reliability.system.view.TransitionView;
import com.reliability.system.view.ViewFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Transition View</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TransitionViewTest extends TransitionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TransitionViewTest.class);
	}

	/**
	 * Constructs a new Transition View test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionViewTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Transition View test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TransitionView getFixture() {
		return (TransitionView)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ViewFactory.eINSTANCE.createTransitionView());
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

} //TransitionViewTest
