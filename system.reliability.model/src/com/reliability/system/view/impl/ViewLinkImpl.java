/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.reliability.system.view.impl;

import java.util.Collection;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.reliability.system.view.ViewLink;
import com.reliability.system.view.ViewObject;
import com.reliability.system.view.ViewPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.reliability.system.view.impl.ViewLinkImpl#getSource <em>Source</em>}</li>
 *   <li>{@link com.reliability.system.view.impl.ViewLinkImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link com.reliability.system.view.impl.ViewLinkImpl#getBendpoints <em>Bendpoints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewLinkImpl extends EObjectImpl implements ViewLink {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ViewObject target;

	/**
	 * The cached value of the '{@link #getBendpoints() <em>Bendpoints</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBendpoints()
	 * @generated
	 * @ordered
	 */
	protected EList<Point> bendpoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewPackage.Literals.VIEW_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewObject getSource() {
		if (eContainerFeatureID() != ViewPackage.VIEW_LINK__SOURCE) return null;
		return (ViewObject)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(ViewObject newSource, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSource, ViewPackage.VIEW_LINK__SOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(ViewObject newSource) {
		if (newSource != eInternalContainer() || (eContainerFeatureID() != ViewPackage.VIEW_LINK__SOURCE && newSource != null)) {
			if (EcoreUtil.isAncestor(this, newSource))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, ViewPackage.VIEW_OBJECT__OUTGOING_LINKS, ViewObject.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewPackage.VIEW_LINK__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewObject getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (ViewObject)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewPackage.VIEW_LINK__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewObject basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(ViewObject newTarget, NotificationChain msgs) {
		ViewObject oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ViewPackage.VIEW_LINK__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(ViewObject newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, ViewPackage.VIEW_OBJECT__INCOMING_LINKS, ViewObject.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, ViewPackage.VIEW_OBJECT__INCOMING_LINKS, ViewObject.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewPackage.VIEW_LINK__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Point> getBendpoints() {
		if (bendpoints == null) {
			bendpoints = new EDataTypeUniqueEList<Point>(Point.class, this, ViewPackage.VIEW_LINK__BENDPOINTS);
		}
		return bendpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViewPackage.VIEW_LINK__SOURCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSource((ViewObject)otherEnd, msgs);
			case ViewPackage.VIEW_LINK__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, ViewPackage.VIEW_OBJECT__INCOMING_LINKS, ViewObject.class, msgs);
				return basicSetTarget((ViewObject)otherEnd, msgs);
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
			case ViewPackage.VIEW_LINK__SOURCE:
				return basicSetSource(null, msgs);
			case ViewPackage.VIEW_LINK__TARGET:
				return basicSetTarget(null, msgs);
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
			case ViewPackage.VIEW_LINK__SOURCE:
				return eInternalContainer().eInverseRemove(this, ViewPackage.VIEW_OBJECT__OUTGOING_LINKS, ViewObject.class, msgs);
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
			case ViewPackage.VIEW_LINK__SOURCE:
				return getSource();
			case ViewPackage.VIEW_LINK__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case ViewPackage.VIEW_LINK__BENDPOINTS:
				return getBendpoints();
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
			case ViewPackage.VIEW_LINK__SOURCE:
				setSource((ViewObject)newValue);
				return;
			case ViewPackage.VIEW_LINK__TARGET:
				setTarget((ViewObject)newValue);
				return;
			case ViewPackage.VIEW_LINK__BENDPOINTS:
				getBendpoints().clear();
				getBendpoints().addAll((Collection<? extends Point>)newValue);
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
			case ViewPackage.VIEW_LINK__SOURCE:
				setSource((ViewObject)null);
				return;
			case ViewPackage.VIEW_LINK__TARGET:
				setTarget((ViewObject)null);
				return;
			case ViewPackage.VIEW_LINK__BENDPOINTS:
				getBendpoints().clear();
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
			case ViewPackage.VIEW_LINK__SOURCE:
				return getSource() != null;
			case ViewPackage.VIEW_LINK__TARGET:
				return target != null;
			case ViewPackage.VIEW_LINK__BENDPOINTS:
				return bendpoints != null && !bendpoints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @not generated
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer("Link: ");
		result.append(getSource().getLabel());
		result.append(" -> ");
		if (getTarget() != null) {
			result.append(getTarget().getLabel());
		} else {
			result.append("N/A");
		}
		
		return result.toString();
	}

} //ViewLinkImpl
