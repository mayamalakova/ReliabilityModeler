/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.reliability.system.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import com.reliability.system.GeneralizedNet;
import com.reliability.system.Port;
import com.reliability.system.PositionType;
import com.reliability.system.SystemPackage;
import com.reliability.system.TransitionMatrixElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.reliability.system.impl.PortImpl#getTransitionRow <em>Transition Row</em>}</li>
 *   <li>{@link com.reliability.system.impl.PortImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.reliability.system.impl.PortImpl#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortImpl extends PositionImpl implements Port {
	/**
	 * The cached value of the '{@link #getTransitionRow() <em>Transition Row</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionRow()
	 * @generated
	 * @ordered
	 */
	protected EList<TransitionMatrixElement> transitionRow;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final PositionType TYPE_EDEFAULT = PositionType.INTERNAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected PositionType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemPackage.Literals.PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransitionMatrixElement> getTransitionRow() {
		if (transitionRow == null) {
			transitionRow = new EObjectContainmentEList<TransitionMatrixElement>(TransitionMatrixElement.class, this, SystemPackage.PORT__TRANSITION_ROW);
		}
		return transitionRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(PositionType newType) {
		PositionType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.PORT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralizedNet getOwner() {
		if (eContainerFeatureID() != SystemPackage.PORT__OWNER) return null;
		return (GeneralizedNet)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(GeneralizedNet newOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwner, SystemPackage.PORT__OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(GeneralizedNet newOwner) {
		if (newOwner != eInternalContainer() || (eContainerFeatureID() != SystemPackage.PORT__OWNER && newOwner != null)) {
			if (EcoreUtil.isAncestor(this, newOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, SystemPackage.GENERALIZED_NET__POSITIONS, GeneralizedNet.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.PORT__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SystemPackage.PORT__OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwner((GeneralizedNet)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SystemPackage.PORT__TRANSITION_ROW:
				return ((InternalEList<?>)getTransitionRow()).basicRemove(otherEnd, msgs);
			case SystemPackage.PORT__OWNER:
				return basicSetOwner(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SystemPackage.PORT__OWNER:
				return eInternalContainer().eInverseRemove(this, SystemPackage.GENERALIZED_NET__POSITIONS, GeneralizedNet.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SystemPackage.PORT__TRANSITION_ROW:
				return getTransitionRow();
			case SystemPackage.PORT__TYPE:
				return getType();
			case SystemPackage.PORT__OWNER:
				return getOwner();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SystemPackage.PORT__TRANSITION_ROW:
				getTransitionRow().clear();
				getTransitionRow().addAll((Collection<? extends TransitionMatrixElement>)newValue);
				return;
			case SystemPackage.PORT__TYPE:
				setType((PositionType)newValue);
				return;
			case SystemPackage.PORT__OWNER:
				setOwner((GeneralizedNet)newValue);
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
			case SystemPackage.PORT__TRANSITION_ROW:
				getTransitionRow().clear();
				return;
			case SystemPackage.PORT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case SystemPackage.PORT__OWNER:
				setOwner((GeneralizedNet)null);
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
			case SystemPackage.PORT__TRANSITION_ROW:
				return transitionRow != null && !transitionRow.isEmpty();
			case SystemPackage.PORT__TYPE:
				return type != TYPE_EDEFAULT;
			case SystemPackage.PORT__OWNER:
				return getOwner() != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //PortImpl
