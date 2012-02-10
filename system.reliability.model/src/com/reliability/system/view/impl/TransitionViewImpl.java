/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.reliability.system.view.impl;

import com.reliability.system.impl.TransitionImpl;

import com.reliability.system.view.SystemView;
import com.reliability.system.view.TransitionView;
import com.reliability.system.view.ViewLink;
import com.reliability.system.view.ViewObject;
import com.reliability.system.view.ViewPackage;

import java.util.Collection;
import org.eclipse.draw2d.geometry.Rectangle;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.reliability.system.view.impl.TransitionViewImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link com.reliability.system.view.impl.TransitionViewImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link com.reliability.system.view.impl.TransitionViewImpl#getOutgoingLinks <em>Outgoing Links</em>}</li>
 *   <li>{@link com.reliability.system.view.impl.TransitionViewImpl#getIncomingLinks <em>Incoming Links</em>}</li>
 *   <li>{@link com.reliability.system.view.impl.TransitionViewImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link com.reliability.system.view.impl.TransitionViewImpl#getFailureLink <em>Failure Link</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionViewImpl extends TransitionImpl implements TransitionView {
	/**
	 * The default value of the '{@link #getConstraints() <em>Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected static final Rectangle CONSTRAINTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected Rectangle constraints = CONSTRAINTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutgoingLinks() <em>Outgoing Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<ViewLink> outgoingLinks;

	/**
	 * The cached value of the '{@link #getIncomingLinks() <em>Incoming Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<ViewLink> incomingLinks;

	/**
	 * The cached value of the '{@link #getFailureLink() <em>Failure Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureLink()
	 * @generated
	 * @ordered
	 */
	protected ViewLink failureLink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewPackage.Literals.TRANSITION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rectangle getConstraints() {
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraints(Rectangle newConstraints) {
		Rectangle oldConstraints = constraints;
		constraints = newConstraints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewPackage.TRANSITION_VIEW__CONSTRAINTS, oldConstraints, constraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @not generated
	 */
	public String getLabel() {
		return getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @not generated
	 */
	public void setLabel(String newLabel) {
		setName(newLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ViewLink> getOutgoingLinks() {
		if (outgoingLinks == null) {
			outgoingLinks = new EObjectContainmentWithInverseEList<ViewLink>(ViewLink.class, this, ViewPackage.TRANSITION_VIEW__OUTGOING_LINKS, ViewPackage.VIEW_LINK__SOURCE);
		}
		return outgoingLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ViewLink> getIncomingLinks() {
		if (incomingLinks == null) {
			incomingLinks = new EObjectWithInverseResolvingEList<ViewLink>(ViewLink.class, this, ViewPackage.TRANSITION_VIEW__INCOMING_LINKS, ViewPackage.VIEW_LINK__TARGET);
		}
		return incomingLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemView getOwner() {
		if (eContainerFeatureID() != ViewPackage.TRANSITION_VIEW__OWNER) return null;
		return (SystemView)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(SystemView newOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwner, ViewPackage.TRANSITION_VIEW__OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(SystemView newOwner) {
		if (newOwner != eInternalContainer() || (eContainerFeatureID() != ViewPackage.TRANSITION_VIEW__OWNER && newOwner != null)) {
			if (EcoreUtil.isAncestor(this, newOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, ViewPackage.SYSTEM_VIEW__TRANSITIONS, SystemView.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewPackage.TRANSITION_VIEW__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewLink getFailureLink() {
		return failureLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFailureLink(ViewLink newFailureLink, NotificationChain msgs) {
		ViewLink oldFailureLink = failureLink;
		failureLink = newFailureLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ViewPackage.TRANSITION_VIEW__FAILURE_LINK, oldFailureLink, newFailureLink);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailureLink(ViewLink newFailureLink) {
		if (newFailureLink != failureLink) {
			NotificationChain msgs = null;
			if (failureLink != null)
				msgs = ((InternalEObject)failureLink).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ViewPackage.TRANSITION_VIEW__FAILURE_LINK, null, msgs);
			if (newFailureLink != null)
				msgs = ((InternalEObject)newFailureLink).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ViewPackage.TRANSITION_VIEW__FAILURE_LINK, null, msgs);
			msgs = basicSetFailureLink(newFailureLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewPackage.TRANSITION_VIEW__FAILURE_LINK, newFailureLink, newFailureLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViewPackage.TRANSITION_VIEW__OUTGOING_LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingLinks()).basicAdd(otherEnd, msgs);
			case ViewPackage.TRANSITION_VIEW__INCOMING_LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingLinks()).basicAdd(otherEnd, msgs);
			case ViewPackage.TRANSITION_VIEW__OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwner((SystemView)otherEnd, msgs);
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
			case ViewPackage.TRANSITION_VIEW__OUTGOING_LINKS:
				return ((InternalEList<?>)getOutgoingLinks()).basicRemove(otherEnd, msgs);
			case ViewPackage.TRANSITION_VIEW__INCOMING_LINKS:
				return ((InternalEList<?>)getIncomingLinks()).basicRemove(otherEnd, msgs);
			case ViewPackage.TRANSITION_VIEW__OWNER:
				return basicSetOwner(null, msgs);
			case ViewPackage.TRANSITION_VIEW__FAILURE_LINK:
				return basicSetFailureLink(null, msgs);
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
			case ViewPackage.TRANSITION_VIEW__OWNER:
				return eInternalContainer().eInverseRemove(this, ViewPackage.SYSTEM_VIEW__TRANSITIONS, SystemView.class, msgs);
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
			case ViewPackage.TRANSITION_VIEW__CONSTRAINTS:
				return getConstraints();
			case ViewPackage.TRANSITION_VIEW__LABEL:
				return getLabel();
			case ViewPackage.TRANSITION_VIEW__OUTGOING_LINKS:
				return getOutgoingLinks();
			case ViewPackage.TRANSITION_VIEW__INCOMING_LINKS:
				return getIncomingLinks();
			case ViewPackage.TRANSITION_VIEW__OWNER:
				return getOwner();
			case ViewPackage.TRANSITION_VIEW__FAILURE_LINK:
				return getFailureLink();
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
			case ViewPackage.TRANSITION_VIEW__CONSTRAINTS:
				setConstraints((Rectangle)newValue);
				return;
			case ViewPackage.TRANSITION_VIEW__LABEL:
				setLabel((String)newValue);
				return;
			case ViewPackage.TRANSITION_VIEW__OUTGOING_LINKS:
				getOutgoingLinks().clear();
				getOutgoingLinks().addAll((Collection<? extends ViewLink>)newValue);
				return;
			case ViewPackage.TRANSITION_VIEW__INCOMING_LINKS:
				getIncomingLinks().clear();
				getIncomingLinks().addAll((Collection<? extends ViewLink>)newValue);
				return;
			case ViewPackage.TRANSITION_VIEW__OWNER:
				setOwner((SystemView)newValue);
				return;
			case ViewPackage.TRANSITION_VIEW__FAILURE_LINK:
				setFailureLink((ViewLink)newValue);
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
			case ViewPackage.TRANSITION_VIEW__CONSTRAINTS:
				setConstraints(CONSTRAINTS_EDEFAULT);
				return;
			case ViewPackage.TRANSITION_VIEW__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case ViewPackage.TRANSITION_VIEW__OUTGOING_LINKS:
				getOutgoingLinks().clear();
				return;
			case ViewPackage.TRANSITION_VIEW__INCOMING_LINKS:
				getIncomingLinks().clear();
				return;
			case ViewPackage.TRANSITION_VIEW__OWNER:
				setOwner((SystemView)null);
				return;
			case ViewPackage.TRANSITION_VIEW__FAILURE_LINK:
				setFailureLink((ViewLink)null);
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
			case ViewPackage.TRANSITION_VIEW__CONSTRAINTS:
				return CONSTRAINTS_EDEFAULT == null ? constraints != null : !CONSTRAINTS_EDEFAULT.equals(constraints);
			case ViewPackage.TRANSITION_VIEW__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case ViewPackage.TRANSITION_VIEW__OUTGOING_LINKS:
				return outgoingLinks != null && !outgoingLinks.isEmpty();
			case ViewPackage.TRANSITION_VIEW__INCOMING_LINKS:
				return incomingLinks != null && !incomingLinks.isEmpty();
			case ViewPackage.TRANSITION_VIEW__OWNER:
				return getOwner() != null;
			case ViewPackage.TRANSITION_VIEW__FAILURE_LINK:
				return failureLink != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ViewObject.class) {
			switch (derivedFeatureID) {
				case ViewPackage.TRANSITION_VIEW__CONSTRAINTS: return ViewPackage.VIEW_OBJECT__CONSTRAINTS;
				case ViewPackage.TRANSITION_VIEW__LABEL: return ViewPackage.VIEW_OBJECT__LABEL;
				case ViewPackage.TRANSITION_VIEW__OUTGOING_LINKS: return ViewPackage.VIEW_OBJECT__OUTGOING_LINKS;
				case ViewPackage.TRANSITION_VIEW__INCOMING_LINKS: return ViewPackage.VIEW_OBJECT__INCOMING_LINKS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ViewObject.class) {
			switch (baseFeatureID) {
				case ViewPackage.VIEW_OBJECT__CONSTRAINTS: return ViewPackage.TRANSITION_VIEW__CONSTRAINTS;
				case ViewPackage.VIEW_OBJECT__LABEL: return ViewPackage.TRANSITION_VIEW__LABEL;
				case ViewPackage.VIEW_OBJECT__OUTGOING_LINKS: return ViewPackage.TRANSITION_VIEW__OUTGOING_LINKS;
				case ViewPackage.VIEW_OBJECT__INCOMING_LINKS: return ViewPackage.TRANSITION_VIEW__INCOMING_LINKS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (constraints: ");
		result.append(constraints);
		result.append(", label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //TransitionViewImpl
