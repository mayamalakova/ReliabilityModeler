/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.reliability.system.view.impl;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import com.reliability.system.SystemPackage;
import com.reliability.system.impl.SystemPackageImpl;
import com.reliability.system.view.Anchor;
import com.reliability.system.view.FailureView;
import com.reliability.system.view.PortView;
import com.reliability.system.view.SystemView;
import com.reliability.system.view.TransitionView;
import com.reliability.system.view.ViewFactory;
import com.reliability.system.view.ViewLink;
import com.reliability.system.view.ViewObject;
import com.reliability.system.view.ViewPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewPackageImpl extends EPackageImpl implements ViewPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failureViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anchorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rectangleEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pointEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.reliability.system.view.ViewPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ViewPackageImpl() {
		super(eNS_URI, ViewFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ViewPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ViewPackage init() {
		if (isInited) return (ViewPackage)EPackage.Registry.INSTANCE.getEPackage(ViewPackage.eNS_URI);

		// Obtain or create and register package
		ViewPackageImpl theViewPackage = (ViewPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ViewPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ViewPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		SystemPackageImpl theSystemPackage = (SystemPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI) instanceof SystemPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI) : SystemPackage.eINSTANCE);

		// Create package meta-data objects
		theViewPackage.createPackageContents();
		theSystemPackage.createPackageContents();

		// Initialize created meta-data
		theViewPackage.initializePackageContents();
		theSystemPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theViewPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ViewPackage.eNS_URI, theViewPackage);
		return theViewPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitionView() {
		return transitionViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortView() {
		return portViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewObject() {
		return viewObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewObject_Constraints() {
		return (EAttribute)viewObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewObject_Label() {
		return (EAttribute)viewObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewObject_OutgoingLinks() {
		return (EReference)viewObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewObject_IncomingLinks() {
		return (EReference)viewObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewObject_Anchors() {
		return (EReference)viewObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewLink() {
		return viewLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewLink_Source() {
		return (EReference)viewLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewLink_Target() {
		return (EReference)viewLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewLink_Bendpoints() {
		return (EAttribute)viewLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewLink_SourceAnchor() {
		return (EReference)viewLinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewLink_TargetAnchor() {
		return (EReference)viewLinkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailureView() {
		return failureViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemView() {
		return systemViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnchor() {
		return anchorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnchor_Location() {
		return (EAttribute)anchorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRectangle() {
		return rectangleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPoint() {
		return pointEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewFactory getViewFactory() {
		return (ViewFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		transitionViewEClass = createEClass(TRANSITION_VIEW);

		portViewEClass = createEClass(PORT_VIEW);

		viewObjectEClass = createEClass(VIEW_OBJECT);
		createEAttribute(viewObjectEClass, VIEW_OBJECT__CONSTRAINTS);
		createEAttribute(viewObjectEClass, VIEW_OBJECT__LABEL);
		createEReference(viewObjectEClass, VIEW_OBJECT__OUTGOING_LINKS);
		createEReference(viewObjectEClass, VIEW_OBJECT__INCOMING_LINKS);
		createEReference(viewObjectEClass, VIEW_OBJECT__ANCHORS);

		viewLinkEClass = createEClass(VIEW_LINK);
		createEReference(viewLinkEClass, VIEW_LINK__SOURCE);
		createEReference(viewLinkEClass, VIEW_LINK__TARGET);
		createEAttribute(viewLinkEClass, VIEW_LINK__BENDPOINTS);
		createEReference(viewLinkEClass, VIEW_LINK__SOURCE_ANCHOR);
		createEReference(viewLinkEClass, VIEW_LINK__TARGET_ANCHOR);

		failureViewEClass = createEClass(FAILURE_VIEW);

		systemViewEClass = createEClass(SYSTEM_VIEW);

		anchorEClass = createEClass(ANCHOR);
		createEAttribute(anchorEClass, ANCHOR__LOCATION);

		// Create data types
		rectangleEDataType = createEDataType(RECTANGLE);
		pointEDataType = createEDataType(POINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SystemPackage theSystemPackage = (SystemPackage)EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		transitionViewEClass.getESuperTypes().add(theSystemPackage.getTransition());
		transitionViewEClass.getESuperTypes().add(this.getViewObject());
		portViewEClass.getESuperTypes().add(theSystemPackage.getPort());
		portViewEClass.getESuperTypes().add(this.getViewObject());
		failureViewEClass.getESuperTypes().add(theSystemPackage.getFailure());
		failureViewEClass.getESuperTypes().add(this.getViewObject());
		systemViewEClass.getESuperTypes().add(theSystemPackage.getGeneralizedNet());

		// Initialize classes and features; add operations and parameters
		initEClass(transitionViewEClass, TransitionView.class, "TransitionView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portViewEClass, PortView.class, "PortView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(viewObjectEClass, ViewObject.class, "ViewObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewObject_Constraints(), this.getRectangle(), "constraints", null, 0, 1, ViewObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewObject_Label(), ecorePackage.getEString(), "label", "", 0, 1, ViewObject.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getViewObject_OutgoingLinks(), this.getViewLink(), this.getViewLink_Source(), "outgoingLinks", null, 0, -1, ViewObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewObject_IncomingLinks(), this.getViewLink(), this.getViewLink_Target(), "incomingLinks", null, 0, -1, ViewObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewObject_Anchors(), this.getAnchor(), null, "anchors", null, 0, -1, ViewObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewLinkEClass, ViewLink.class, "ViewLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewLink_Source(), this.getViewObject(), this.getViewObject_OutgoingLinks(), "source", null, 0, 1, ViewLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getViewLink_Source().getEKeys().add(this.getViewObject_Label());
		initEReference(getViewLink_Target(), this.getViewObject(), this.getViewObject_IncomingLinks(), "target", null, 0, 1, ViewLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getViewLink_Target().getEKeys().add(this.getViewObject_Label());
		initEAttribute(getViewLink_Bendpoints(), this.getPoint(), "bendpoints", null, 0, -1, ViewLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewLink_SourceAnchor(), this.getAnchor(), null, "sourceAnchor", null, 0, 1, ViewLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewLink_TargetAnchor(), this.getAnchor(), null, "targetAnchor", null, 0, 1, ViewLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(failureViewEClass, FailureView.class, "FailureView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemViewEClass, SystemView.class, "SystemView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(anchorEClass, Anchor.class, "Anchor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnchor_Location(), this.getPoint(), "location", null, 0, 1, Anchor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(rectangleEDataType, Rectangle.class, "Rectangle", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(pointEDataType, Point.class, "Point", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ViewPackageImpl
