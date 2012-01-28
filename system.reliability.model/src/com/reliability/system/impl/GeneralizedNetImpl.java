/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.reliability.system.impl;

import com.reliability.system.GeneralizedNet;
import com.reliability.system.Port;
import com.reliability.system.SystemPackage;
import com.reliability.system.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generalized Net</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.reliability.system.impl.GeneralizedNetImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link com.reliability.system.impl.GeneralizedNetImpl#getPositions <em>Positions</em>}</li>
 *   <li>{@link com.reliability.system.impl.GeneralizedNetImpl#getSystemInputs <em>System Inputs</em>}</li>
 *   <li>{@link com.reliability.system.impl.GeneralizedNetImpl#getFinalPositions <em>Final Positions</em>}</li>
 *   <li>{@link com.reliability.system.impl.GeneralizedNetImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralizedNetImpl extends EObjectImpl implements GeneralizedNet {
	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * The cached value of the '{@link #getPositions() <em>Positions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositions()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> positions;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralizedNetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemPackage.Literals.GENERALIZED_NET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<Transition>(Transition.class, this, SystemPackage.GENERALIZED_NET__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPositions() {
		if (positions == null) {
			positions = new EObjectContainmentEList<Port>(Port.class, this, SystemPackage.GENERALIZED_NET__POSITIONS);
		}
		return positions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getSystemInputs() {
		// TODO: implement this method to return the 'System Inputs' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getFinalPositions() {
		// TODO: implement this method to return the 'Final Positions' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.GENERALIZED_NET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SystemPackage.GENERALIZED_NET__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case SystemPackage.GENERALIZED_NET__POSITIONS:
				return ((InternalEList<?>)getPositions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SystemPackage.GENERALIZED_NET__TRANSITIONS:
				return getTransitions();
			case SystemPackage.GENERALIZED_NET__POSITIONS:
				return getPositions();
			case SystemPackage.GENERALIZED_NET__SYSTEM_INPUTS:
				return getSystemInputs();
			case SystemPackage.GENERALIZED_NET__FINAL_POSITIONS:
				return getFinalPositions();
			case SystemPackage.GENERALIZED_NET__NAME:
				return getName();
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
			case SystemPackage.GENERALIZED_NET__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case SystemPackage.GENERALIZED_NET__POSITIONS:
				getPositions().clear();
				getPositions().addAll((Collection<? extends Port>)newValue);
				return;
			case SystemPackage.GENERALIZED_NET__SYSTEM_INPUTS:
				getSystemInputs().clear();
				getSystemInputs().addAll((Collection<? extends Port>)newValue);
				return;
			case SystemPackage.GENERALIZED_NET__FINAL_POSITIONS:
				getFinalPositions().clear();
				getFinalPositions().addAll((Collection<? extends Port>)newValue);
				return;
			case SystemPackage.GENERALIZED_NET__NAME:
				setName((String)newValue);
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
			case SystemPackage.GENERALIZED_NET__TRANSITIONS:
				getTransitions().clear();
				return;
			case SystemPackage.GENERALIZED_NET__POSITIONS:
				getPositions().clear();
				return;
			case SystemPackage.GENERALIZED_NET__SYSTEM_INPUTS:
				getSystemInputs().clear();
				return;
			case SystemPackage.GENERALIZED_NET__FINAL_POSITIONS:
				getFinalPositions().clear();
				return;
			case SystemPackage.GENERALIZED_NET__NAME:
				setName(NAME_EDEFAULT);
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
			case SystemPackage.GENERALIZED_NET__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case SystemPackage.GENERALIZED_NET__POSITIONS:
				return positions != null && !positions.isEmpty();
			case SystemPackage.GENERALIZED_NET__SYSTEM_INPUTS:
				return !getSystemInputs().isEmpty();
			case SystemPackage.GENERALIZED_NET__FINAL_POSITIONS:
				return !getFinalPositions().isEmpty();
			case SystemPackage.GENERALIZED_NET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //GeneralizedNetImpl
