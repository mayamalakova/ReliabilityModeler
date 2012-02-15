/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.reliability.system.view;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import com.reliability.system.SystemPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.reliability.system.view.ViewFactory
 * @model kind="package"
 * @generated
 */
public interface ViewPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "view";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "system.reliability.model.view";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "view";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ViewPackage eINSTANCE = com.reliability.system.view.impl.ViewPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.reliability.system.view.impl.TransitionViewImpl <em>Transition View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.reliability.system.view.impl.TransitionViewImpl
	 * @see com.reliability.system.view.impl.ViewPackageImpl#getTransitionView()
	 * @generated
	 */
	int TRANSITION_VIEW = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIEW__NAME = SystemPackage.TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIEW__DESCRIPTION = SystemPackage.TRANSITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Failure State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIEW__FAILURE_STATE = SystemPackage.TRANSITION__FAILURE_STATE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIEW__TYPE = SystemPackage.TRANSITION__TYPE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIEW__OWNER = SystemPackage.TRANSITION__OWNER;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIEW__CONSTRAINTS = SystemPackage.TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIEW__LABEL = SystemPackage.TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIEW__OUTGOING_LINKS = SystemPackage.TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIEW__INCOMING_LINKS = SystemPackage.TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIEW_FEATURE_COUNT = SystemPackage.TRANSITION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.reliability.system.view.impl.PortViewImpl <em>Port View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.reliability.system.view.impl.PortViewImpl
	 * @see com.reliability.system.view.impl.ViewPackageImpl#getPortView()
	 * @generated
	 */
	int PORT_VIEW = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VIEW__ID = SystemPackage.PORT__ID;

	/**
	 * The feature id for the '<em><b>Transition Row</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VIEW__TRANSITION_ROW = SystemPackage.PORT__TRANSITION_ROW;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VIEW__TYPE = SystemPackage.PORT__TYPE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VIEW__OWNER = SystemPackage.PORT__OWNER;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VIEW__CONSTRAINTS = SystemPackage.PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VIEW__LABEL = SystemPackage.PORT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VIEW__OUTGOING_LINKS = SystemPackage.PORT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VIEW__INCOMING_LINKS = SystemPackage.PORT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Port View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VIEW_FEATURE_COUNT = SystemPackage.PORT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.reliability.system.view.impl.ViewObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.reliability.system.view.impl.ViewObjectImpl
	 * @see com.reliability.system.view.impl.ViewPackageImpl#getViewObject()
	 * @generated
	 */
	int VIEW_OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_OBJECT__CONSTRAINTS = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_OBJECT__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_OBJECT__OUTGOING_LINKS = 2;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_OBJECT__INCOMING_LINKS = 3;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_OBJECT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.reliability.system.view.impl.ViewLinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.reliability.system.view.impl.ViewLinkImpl
	 * @see com.reliability.system.view.impl.ViewPackageImpl#getViewLink()
	 * @generated
	 */
	int VIEW_LINK = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_LINK__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_LINK__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_LINK__BENDPOINTS = 2;

	/**
	 * The feature id for the '<em><b>Source Anchor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_LINK__SOURCE_ANCHOR = 3;

	/**
	 * The feature id for the '<em><b>Target Anchor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_LINK__TARGET_ANCHOR = 4;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_LINK_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.reliability.system.view.impl.FailureViewImpl <em>Failure View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.reliability.system.view.impl.FailureViewImpl
	 * @see com.reliability.system.view.impl.ViewPackageImpl#getFailureView()
	 * @generated
	 */
	int FAILURE_VIEW = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_VIEW__ID = SystemPackage.FAILURE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_VIEW__OWNER = SystemPackage.FAILURE__OWNER;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_VIEW__CONSTRAINTS = SystemPackage.FAILURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_VIEW__LABEL = SystemPackage.FAILURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_VIEW__OUTGOING_LINKS = SystemPackage.FAILURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_VIEW__INCOMING_LINKS = SystemPackage.FAILURE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Failure View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_VIEW_FEATURE_COUNT = SystemPackage.FAILURE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.reliability.system.view.impl.SystemViewImpl <em>System View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.reliability.system.view.impl.SystemViewImpl
	 * @see com.reliability.system.view.impl.ViewPackageImpl#getSystemView()
	 * @generated
	 */
	int SYSTEM_VIEW = 5;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_VIEW__TRANSITIONS = SystemPackage.GENERALIZED_NET__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Positions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_VIEW__POSITIONS = SystemPackage.GENERALIZED_NET__POSITIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_VIEW__NAME = SystemPackage.GENERALIZED_NET__NAME;

	/**
	 * The number of structural features of the '<em>System View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_VIEW_FEATURE_COUNT = SystemPackage.GENERALIZED_NET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '<em>Rectangle</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.draw2d.geometry.Rectangle
	 * @see com.reliability.system.view.impl.ViewPackageImpl#getRectangle()
	 * @generated
	 */
	int RECTANGLE = 6;


	/**
	 * The meta object id for the '<em>Point</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.draw2d.geometry.Point
	 * @see com.reliability.system.view.impl.ViewPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 7;


	/**
	 * Returns the meta object for class '{@link com.reliability.system.view.TransitionView <em>Transition View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition View</em>'.
	 * @see com.reliability.system.view.TransitionView
	 * @generated
	 */
	EClass getTransitionView();

	/**
	 * Returns the meta object for class '{@link com.reliability.system.view.PortView <em>Port View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port View</em>'.
	 * @see com.reliability.system.view.PortView
	 * @generated
	 */
	EClass getPortView();

	/**
	 * Returns the meta object for class '{@link com.reliability.system.view.ViewObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see com.reliability.system.view.ViewObject
	 * @generated
	 */
	EClass getViewObject();

	/**
	 * Returns the meta object for the attribute '{@link com.reliability.system.view.ViewObject#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraints</em>'.
	 * @see com.reliability.system.view.ViewObject#getConstraints()
	 * @see #getViewObject()
	 * @generated
	 */
	EAttribute getViewObject_Constraints();

	/**
	 * Returns the meta object for the attribute '{@link com.reliability.system.view.ViewObject#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see com.reliability.system.view.ViewObject#getLabel()
	 * @see #getViewObject()
	 * @generated
	 */
	EAttribute getViewObject_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link com.reliability.system.view.ViewObject#getOutgoingLinks <em>Outgoing Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outgoing Links</em>'.
	 * @see com.reliability.system.view.ViewObject#getOutgoingLinks()
	 * @see #getViewObject()
	 * @generated
	 */
	EReference getViewObject_OutgoingLinks();

	/**
	 * Returns the meta object for the reference list '{@link com.reliability.system.view.ViewObject#getIncomingLinks <em>Incoming Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Links</em>'.
	 * @see com.reliability.system.view.ViewObject#getIncomingLinks()
	 * @see #getViewObject()
	 * @generated
	 */
	EReference getViewObject_IncomingLinks();

	/**
	 * Returns the meta object for class '{@link com.reliability.system.view.ViewLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see com.reliability.system.view.ViewLink
	 * @generated
	 */
	EClass getViewLink();

	/**
	 * Returns the meta object for the container reference '{@link com.reliability.system.view.ViewLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source</em>'.
	 * @see com.reliability.system.view.ViewLink#getSource()
	 * @see #getViewLink()
	 * @generated
	 */
	EReference getViewLink_Source();

	/**
	 * Returns the meta object for the reference '{@link com.reliability.system.view.ViewLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see com.reliability.system.view.ViewLink#getTarget()
	 * @see #getViewLink()
	 * @generated
	 */
	EReference getViewLink_Target();

	/**
	 * Returns the meta object for the attribute list '{@link com.reliability.system.view.ViewLink#getBendpoints <em>Bendpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Bendpoints</em>'.
	 * @see com.reliability.system.view.ViewLink#getBendpoints()
	 * @see #getViewLink()
	 * @generated
	 */
	EAttribute getViewLink_Bendpoints();

	/**
	 * Returns the meta object for the attribute '{@link com.reliability.system.view.ViewLink#getSourceAnchor <em>Source Anchor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Anchor</em>'.
	 * @see com.reliability.system.view.ViewLink#getSourceAnchor()
	 * @see #getViewLink()
	 * @generated
	 */
	EAttribute getViewLink_SourceAnchor();

	/**
	 * Returns the meta object for the attribute '{@link com.reliability.system.view.ViewLink#getTargetAnchor <em>Target Anchor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Anchor</em>'.
	 * @see com.reliability.system.view.ViewLink#getTargetAnchor()
	 * @see #getViewLink()
	 * @generated
	 */
	EAttribute getViewLink_TargetAnchor();

	/**
	 * Returns the meta object for class '{@link com.reliability.system.view.FailureView <em>Failure View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure View</em>'.
	 * @see com.reliability.system.view.FailureView
	 * @generated
	 */
	EClass getFailureView();

	/**
	 * Returns the meta object for class '{@link com.reliability.system.view.SystemView <em>System View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System View</em>'.
	 * @see com.reliability.system.view.SystemView
	 * @generated
	 */
	EClass getSystemView();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.draw2d.geometry.Rectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Rectangle</em>'.
	 * @see org.eclipse.draw2d.geometry.Rectangle
	 * @model instanceClass="org.eclipse.draw2d.geometry.Rectangle"
	 * @generated
	 */
	EDataType getRectangle();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.draw2d.geometry.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Point</em>'.
	 * @see org.eclipse.draw2d.geometry.Point
	 * @model instanceClass="org.eclipse.draw2d.geometry.Point"
	 * @generated
	 */
	EDataType getPoint();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ViewFactory getViewFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.reliability.system.view.impl.TransitionViewImpl <em>Transition View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.reliability.system.view.impl.TransitionViewImpl
		 * @see com.reliability.system.view.impl.ViewPackageImpl#getTransitionView()
		 * @generated
		 */
		EClass TRANSITION_VIEW = eINSTANCE.getTransitionView();

		/**
		 * The meta object literal for the '{@link com.reliability.system.view.impl.PortViewImpl <em>Port View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.reliability.system.view.impl.PortViewImpl
		 * @see com.reliability.system.view.impl.ViewPackageImpl#getPortView()
		 * @generated
		 */
		EClass PORT_VIEW = eINSTANCE.getPortView();

		/**
		 * The meta object literal for the '{@link com.reliability.system.view.impl.ViewObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.reliability.system.view.impl.ViewObjectImpl
		 * @see com.reliability.system.view.impl.ViewPackageImpl#getViewObject()
		 * @generated
		 */
		EClass VIEW_OBJECT = eINSTANCE.getViewObject();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_OBJECT__CONSTRAINTS = eINSTANCE.getViewObject_Constraints();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_OBJECT__LABEL = eINSTANCE.getViewObject_Label();

		/**
		 * The meta object literal for the '<em><b>Outgoing Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_OBJECT__OUTGOING_LINKS = eINSTANCE.getViewObject_OutgoingLinks();

		/**
		 * The meta object literal for the '<em><b>Incoming Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_OBJECT__INCOMING_LINKS = eINSTANCE.getViewObject_IncomingLinks();

		/**
		 * The meta object literal for the '{@link com.reliability.system.view.impl.ViewLinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.reliability.system.view.impl.ViewLinkImpl
		 * @see com.reliability.system.view.impl.ViewPackageImpl#getViewLink()
		 * @generated
		 */
		EClass VIEW_LINK = eINSTANCE.getViewLink();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_LINK__SOURCE = eINSTANCE.getViewLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_LINK__TARGET = eINSTANCE.getViewLink_Target();

		/**
		 * The meta object literal for the '<em><b>Bendpoints</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_LINK__BENDPOINTS = eINSTANCE.getViewLink_Bendpoints();

		/**
		 * The meta object literal for the '<em><b>Source Anchor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_LINK__SOURCE_ANCHOR = eINSTANCE.getViewLink_SourceAnchor();

		/**
		 * The meta object literal for the '<em><b>Target Anchor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_LINK__TARGET_ANCHOR = eINSTANCE.getViewLink_TargetAnchor();

		/**
		 * The meta object literal for the '{@link com.reliability.system.view.impl.FailureViewImpl <em>Failure View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.reliability.system.view.impl.FailureViewImpl
		 * @see com.reliability.system.view.impl.ViewPackageImpl#getFailureView()
		 * @generated
		 */
		EClass FAILURE_VIEW = eINSTANCE.getFailureView();

		/**
		 * The meta object literal for the '{@link com.reliability.system.view.impl.SystemViewImpl <em>System View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.reliability.system.view.impl.SystemViewImpl
		 * @see com.reliability.system.view.impl.ViewPackageImpl#getSystemView()
		 * @generated
		 */
		EClass SYSTEM_VIEW = eINSTANCE.getSystemView();

		/**
		 * The meta object literal for the '<em>Rectangle</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.draw2d.geometry.Rectangle
		 * @see com.reliability.system.view.impl.ViewPackageImpl#getRectangle()
		 * @generated
		 */
		EDataType RECTANGLE = eINSTANCE.getRectangle();

		/**
		 * The meta object literal for the '<em>Point</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.draw2d.geometry.Point
		 * @see com.reliability.system.view.impl.ViewPackageImpl#getPoint()
		 * @generated
		 */
		EDataType POINT = eINSTANCE.getPoint();

	}

} //ViewPackage
