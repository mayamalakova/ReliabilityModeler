/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.reliability.system.view;

import com.reliability.system.SystemPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
	 * The meta object id for the '{@link com.reliability.system.view.impl.SystemViewImpl <em>System View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.reliability.system.view.impl.SystemViewImpl
	 * @see com.reliability.system.view.impl.ViewPackageImpl#getSystemView()
	 * @generated
	 */
	int SYSTEM_VIEW = 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_VIEW__TRANSITIONS = 0;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_VIEW__PORTS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_VIEW__NAME = 2;

	/**
	 * The number of structural features of the '<em>System View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_VIEW_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.reliability.system.view.impl.TransitionViewImpl <em>Transition View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.reliability.system.view.impl.TransitionViewImpl
	 * @see com.reliability.system.view.impl.ViewPackageImpl#getTransitionView()
	 * @generated
	 */
	int TRANSITION_VIEW = 1;

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
	 * The feature id for the '<em><b>Input Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIEW__INPUT_PORTS = SystemPackage.TRANSITION__INPUT_PORTS;

	/**
	 * The feature id for the '<em><b>Output Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIEW__OUTPUT_PORTS = SystemPackage.TRANSITION__OUTPUT_PORTS;

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
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIEW__CONSTRAINTS = SystemPackage.TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIEW__OWNER = SystemPackage.TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transition View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_VIEW_FEATURE_COUNT = SystemPackage.TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '<em>Rectangle</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.draw2d.geometry.Rectangle
	 * @see com.reliability.system.view.impl.ViewPackageImpl#getRectangle()
	 * @generated
	 */
	int RECTANGLE = 2;


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
	 * Returns the meta object for the containment reference list '{@link com.reliability.system.view.SystemView#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see com.reliability.system.view.SystemView#getTransitions()
	 * @see #getSystemView()
	 * @generated
	 */
	EReference getSystemView_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link com.reliability.system.view.SystemView#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see com.reliability.system.view.SystemView#getPorts()
	 * @see #getSystemView()
	 * @generated
	 */
	EReference getSystemView_Ports();

	/**
	 * Returns the meta object for the attribute '{@link com.reliability.system.view.SystemView#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.reliability.system.view.SystemView#getName()
	 * @see #getSystemView()
	 * @generated
	 */
	EAttribute getSystemView_Name();

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
	 * Returns the meta object for the attribute '{@link com.reliability.system.view.TransitionView#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraints</em>'.
	 * @see com.reliability.system.view.TransitionView#getConstraints()
	 * @see #getTransitionView()
	 * @generated
	 */
	EAttribute getTransitionView_Constraints();

	/**
	 * Returns the meta object for the container reference '{@link com.reliability.system.view.TransitionView#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see com.reliability.system.view.TransitionView#getOwner()
	 * @see #getTransitionView()
	 * @generated
	 */
	EReference getTransitionView_Owner();

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
		 * The meta object literal for the '{@link com.reliability.system.view.impl.SystemViewImpl <em>System View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.reliability.system.view.impl.SystemViewImpl
		 * @see com.reliability.system.view.impl.ViewPackageImpl#getSystemView()
		 * @generated
		 */
		EClass SYSTEM_VIEW = eINSTANCE.getSystemView();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_VIEW__TRANSITIONS = eINSTANCE.getSystemView_Transitions();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_VIEW__PORTS = eINSTANCE.getSystemView_Ports();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_VIEW__NAME = eINSTANCE.getSystemView_Name();

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
		 * The meta object literal for the '<em><b>Constraints</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_VIEW__CONSTRAINTS = eINSTANCE.getTransitionView_Constraints();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_VIEW__OWNER = eINSTANCE.getTransitionView_Owner();

		/**
		 * The meta object literal for the '<em>Rectangle</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.draw2d.geometry.Rectangle
		 * @see com.reliability.system.view.impl.ViewPackageImpl#getRectangle()
		 * @generated
		 */
		EDataType RECTANGLE = eINSTANCE.getRectangle();

	}

} //ViewPackage
