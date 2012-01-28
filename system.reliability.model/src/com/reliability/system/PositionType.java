/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.reliability.system;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Position Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.reliability.system.SystemPackage#getPositionType()
 * @model
 * @generated
 */
public enum PositionType implements Enumerator {
	/**
	 * The '<em><b>INTERNAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNAL_VALUE
	 * @generated
	 * @ordered
	 */
	INTERNAL(0, "INTERNAL", "Internal"),

	/**
	 * The '<em><b>SYSTEM INPUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYSTEM_INPUT_VALUE
	 * @generated
	 * @ordered
	 */
	SYSTEM_INPUT(1, "SYSTEM_INPUT", "systemInput"),

	/**
	 * The '<em><b>FINAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINAL_VALUE
	 * @generated
	 * @ordered
	 */
	FINAL(2, "FINAL", "final");

	/**
	 * The '<em><b>INTERNAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INTERNAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERNAL
	 * @model literal="Internal"
	 * @generated
	 * @ordered
	 */
	public static final int INTERNAL_VALUE = 0;

	/**
	 * The '<em><b>SYSTEM INPUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SYSTEM INPUT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYSTEM_INPUT
	 * @model literal="systemInput"
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEM_INPUT_VALUE = 1;

	/**
	 * The '<em><b>FINAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FINAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FINAL
	 * @model literal="final"
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_VALUE = 2;

	/**
	 * An array of all the '<em><b>Position Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PositionType[] VALUES_ARRAY =
		new PositionType[] {
			INTERNAL,
			SYSTEM_INPUT,
			FINAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Position Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PositionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Position Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PositionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PositionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Position Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PositionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PositionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Position Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PositionType get(int value) {
		switch (value) {
			case INTERNAL_VALUE: return INTERNAL;
			case SYSTEM_INPUT_VALUE: return SYSTEM_INPUT;
			case FINAL_VALUE: return FINAL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PositionType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //PositionType
