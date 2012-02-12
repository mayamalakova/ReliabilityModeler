/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.reliability.system.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import com.reliability.system.Position;
import com.reliability.system.SystemPackage;
import com.reliability.system.TransitionMatrixElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Matrix Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.reliability.system.impl.TransitionMatrixElementImpl#getOppositePosition <em>Opposite Position</em>}</li>
 *   <li>{@link com.reliability.system.impl.TransitionMatrixElementImpl#getNecessity <em>Necessity</em>}</li>
 *   <li>{@link com.reliability.system.impl.TransitionMatrixElementImpl#getPossibility <em>Possibility</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionMatrixElementImpl extends EObjectImpl implements TransitionMatrixElement {
	/**
	 * The cached value of the '{@link #getOppositePosition() <em>Opposite Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOppositePosition()
	 * @generated
	 * @ordered
	 */
	protected Position oppositePosition;

	/**
	 * The default value of the '{@link #getNecessity() <em>Necessity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNecessity()
	 * @generated
	 * @ordered
	 */
	protected static final float NECESSITY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNecessity() <em>Necessity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNecessity()
	 * @generated
	 * @ordered
	 */
	protected float necessity = NECESSITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPossibility() <em>Possibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibility()
	 * @generated
	 * @ordered
	 */
	protected static final float POSSIBILITY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPossibility() <em>Possibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibility()
	 * @generated
	 * @ordered
	 */
	protected float possibility = POSSIBILITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionMatrixElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemPackage.Literals.TRANSITION_MATRIX_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position getOppositePosition() {
		if (oppositePosition != null && oppositePosition.eIsProxy()) {
			InternalEObject oldOppositePosition = (InternalEObject)oppositePosition;
			oppositePosition = (Position)eResolveProxy(oldOppositePosition);
			if (oppositePosition != oldOppositePosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemPackage.TRANSITION_MATRIX_ELEMENT__OPPOSITE_POSITION, oldOppositePosition, oppositePosition));
			}
		}
		return oppositePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position basicGetOppositePosition() {
		return oppositePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOppositePosition(Position newOppositePosition) {
		Position oldOppositePosition = oppositePosition;
		oppositePosition = newOppositePosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.TRANSITION_MATRIX_ELEMENT__OPPOSITE_POSITION, oldOppositePosition, oppositePosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNecessity() {
		return necessity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNecessity(float newNecessity) {
		float oldNecessity = necessity;
		necessity = newNecessity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.TRANSITION_MATRIX_ELEMENT__NECESSITY, oldNecessity, necessity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPossibility() {
		return possibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPossibility(float newPossibility) {
		float oldPossibility = possibility;
		possibility = newPossibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.TRANSITION_MATRIX_ELEMENT__POSSIBILITY, oldPossibility, possibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SystemPackage.TRANSITION_MATRIX_ELEMENT__OPPOSITE_POSITION:
				if (resolve) return getOppositePosition();
				return basicGetOppositePosition();
			case SystemPackage.TRANSITION_MATRIX_ELEMENT__NECESSITY:
				return getNecessity();
			case SystemPackage.TRANSITION_MATRIX_ELEMENT__POSSIBILITY:
				return getPossibility();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SystemPackage.TRANSITION_MATRIX_ELEMENT__OPPOSITE_POSITION:
				setOppositePosition((Position)newValue);
				return;
			case SystemPackage.TRANSITION_MATRIX_ELEMENT__NECESSITY:
				setNecessity((Float)newValue);
				return;
			case SystemPackage.TRANSITION_MATRIX_ELEMENT__POSSIBILITY:
				setPossibility((Float)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SystemPackage.TRANSITION_MATRIX_ELEMENT__OPPOSITE_POSITION:
				setOppositePosition((Position)null);
				return;
			case SystemPackage.TRANSITION_MATRIX_ELEMENT__NECESSITY:
				setNecessity(NECESSITY_EDEFAULT);
				return;
			case SystemPackage.TRANSITION_MATRIX_ELEMENT__POSSIBILITY:
				setPossibility(POSSIBILITY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SystemPackage.TRANSITION_MATRIX_ELEMENT__OPPOSITE_POSITION:
				return oppositePosition != null;
			case SystemPackage.TRANSITION_MATRIX_ELEMENT__NECESSITY:
				return necessity != NECESSITY_EDEFAULT;
			case SystemPackage.TRANSITION_MATRIX_ELEMENT__POSSIBILITY:
				return possibility != POSSIBILITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (necessity: ");
		result.append(necessity);
		result.append(", possibility: ");
		result.append(possibility);
		result.append(')');
		return result.toString();
	}

} //TransitionMatrixElementImpl
