/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.reliability.system.impl;

import com.reliability.system.Failure;
import com.reliability.system.Port;
import com.reliability.system.SystemPackage;
import com.reliability.system.Transition;
import com.reliability.system.TransitionType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.reliability.system.impl.TransitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.reliability.system.impl.TransitionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.reliability.system.impl.TransitionImpl#getInputPorts <em>Input Ports</em>}</li>
 *   <li>{@link com.reliability.system.impl.TransitionImpl#getOutputPorts <em>Output Ports</em>}</li>
 *   <li>{@link com.reliability.system.impl.TransitionImpl#getFailureState <em>Failure State</em>}</li>
 *   <li>{@link com.reliability.system.impl.TransitionImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends EObjectImpl implements Transition {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInputPorts() <em>Input Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> inputPorts;

	/**
	 * The cached value of the '{@link #getOutputPorts() <em>Output Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> outputPorts;

	/**
	 * The cached value of the '{@link #getFailureState() <em>Failure State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureState()
	 * @generated
	 * @ordered
	 */
	protected Failure failureState;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TransitionType TYPE_EDEFAULT = TransitionType.COMPONENT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TransitionType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemPackage.Literals.TRANSITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.TRANSITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.TRANSITION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getInputPorts() {
		if (inputPorts == null) {
			inputPorts = new EObjectResolvingEList<Port>(Port.class, this, SystemPackage.TRANSITION__INPUT_PORTS);
		}
		return inputPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getOutputPorts() {
		if (outputPorts == null) {
			outputPorts = new EObjectResolvingEList<Port>(Port.class, this, SystemPackage.TRANSITION__OUTPUT_PORTS);
		}
		return outputPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Failure getFailureState() {
		return failureState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFailureState(Failure newFailureState, NotificationChain msgs) {
		Failure oldFailureState = failureState;
		failureState = newFailureState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SystemPackage.TRANSITION__FAILURE_STATE, oldFailureState, newFailureState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailureState(Failure newFailureState) {
		if (newFailureState != failureState) {
			NotificationChain msgs = null;
			if (failureState != null)
				msgs = ((InternalEObject)failureState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SystemPackage.TRANSITION__FAILURE_STATE, null, msgs);
			if (newFailureState != null)
				msgs = ((InternalEObject)newFailureState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SystemPackage.TRANSITION__FAILURE_STATE, null, msgs);
			msgs = basicSetFailureState(newFailureState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.TRANSITION__FAILURE_STATE, newFailureState, newFailureState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TransitionType newType) {
		TransitionType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.TRANSITION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SystemPackage.TRANSITION__FAILURE_STATE:
				return basicSetFailureState(null, msgs);
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
			case SystemPackage.TRANSITION__NAME:
				return getName();
			case SystemPackage.TRANSITION__DESCRIPTION:
				return getDescription();
			case SystemPackage.TRANSITION__INPUT_PORTS:
				return getInputPorts();
			case SystemPackage.TRANSITION__OUTPUT_PORTS:
				return getOutputPorts();
			case SystemPackage.TRANSITION__FAILURE_STATE:
				return getFailureState();
			case SystemPackage.TRANSITION__TYPE:
				return getType();
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
			case SystemPackage.TRANSITION__NAME:
				setName((String)newValue);
				return;
			case SystemPackage.TRANSITION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SystemPackage.TRANSITION__INPUT_PORTS:
				getInputPorts().clear();
				getInputPorts().addAll((Collection<? extends Port>)newValue);
				return;
			case SystemPackage.TRANSITION__OUTPUT_PORTS:
				getOutputPorts().clear();
				getOutputPorts().addAll((Collection<? extends Port>)newValue);
				return;
			case SystemPackage.TRANSITION__FAILURE_STATE:
				setFailureState((Failure)newValue);
				return;
			case SystemPackage.TRANSITION__TYPE:
				setType((TransitionType)newValue);
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
			case SystemPackage.TRANSITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SystemPackage.TRANSITION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SystemPackage.TRANSITION__INPUT_PORTS:
				getInputPorts().clear();
				return;
			case SystemPackage.TRANSITION__OUTPUT_PORTS:
				getOutputPorts().clear();
				return;
			case SystemPackage.TRANSITION__FAILURE_STATE:
				setFailureState((Failure)null);
				return;
			case SystemPackage.TRANSITION__TYPE:
				setType(TYPE_EDEFAULT);
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
			case SystemPackage.TRANSITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SystemPackage.TRANSITION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SystemPackage.TRANSITION__INPUT_PORTS:
				return inputPorts != null && !inputPorts.isEmpty();
			case SystemPackage.TRANSITION__OUTPUT_PORTS:
				return outputPorts != null && !outputPorts.isEmpty();
			case SystemPackage.TRANSITION__FAILURE_STATE:
				return failureState != null;
			case SystemPackage.TRANSITION__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(", description: ");
		result.append(description);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
