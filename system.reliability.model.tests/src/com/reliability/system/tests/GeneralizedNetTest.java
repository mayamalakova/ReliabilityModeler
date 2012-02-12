/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.reliability.system.tests;

import com.reliability.system.GeneralizedNet;
import com.reliability.system.SystemFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Generalized Net</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeneralizedNetTest extends TestCase {

	/**
	 * The fixture for this Generalized Net test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralizedNet fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GeneralizedNetTest.class);
	}

	/**
	 * Constructs a new Generalized Net test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralizedNetTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Generalized Net test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(GeneralizedNet fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Generalized Net test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralizedNet getFixture() {
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
		setFixture(SystemFactory.eINSTANCE.createGeneralizedNet());
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

} //GeneralizedNetTest
