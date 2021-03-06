/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.reliability.system.tests;

import com.reliability.system.SystemFactory;
import com.reliability.system.TransitionMatrixElement;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Transition Matrix Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TransitionMatrixElementTest extends TestCase {

	/**
	 * The fixture for this Transition Matrix Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionMatrixElement fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TransitionMatrixElementTest.class);
	}

	/**
	 * Constructs a new Transition Matrix Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionMatrixElementTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Transition Matrix Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TransitionMatrixElement fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Transition Matrix Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionMatrixElement getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SystemFactory.eINSTANCE.createTransitionMatrixElement());
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

} //TransitionMatrixElementTest
