/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.reliability.system.tests;

import com.reliability.system.Failure;
import com.reliability.system.SystemFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Failure</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FailureTest extends PositionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FailureTest.class);
	}

	/**
	 * Constructs a new Failure test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Failure test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Failure getFixture() {
		return (Failure)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SystemFactory.eINSTANCE.createFailure());
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

} //FailureTest
