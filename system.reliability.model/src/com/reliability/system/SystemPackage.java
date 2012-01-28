/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.reliability.system;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see com.reliability.system.SystemFactory
 * @model kind="package"
 * @generated
 */
public interface SystemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "system";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "system.reliability.model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gn";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SystemPackage eINSTANCE = com.reliability.system.impl.SystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.reliability.system.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.reliability.system.impl.TransitionImpl
	 * @see com.reliability.system.impl.SystemPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Input Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__INPUT_PORTS = 2;

	/**
	 * The feature id for the '<em><b>Output Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__OUTPUT_PORTS = 3;

	/**
	 * The feature id for the '<em><b>Failure State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__FAILURE_STATE = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TYPE = 5;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link com.reliability.system.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.reliability.system.impl.PositionImpl
	 * @see com.reliability.system.impl.SystemPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__ID = 0;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.reliability.system.impl.TransitionMatrixElementImpl <em>Transition Matrix Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.reliability.system.impl.TransitionMatrixElementImpl
	 * @see com.reliability.system.impl.SystemPackageImpl#getTransitionMatrixElement()
	 * @generated
	 */
	int TRANSITION_MATRIX_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Opposite Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_MATRIX_ELEMENT__OPPOSITE_POSITION = 0;

	/**
	 * The feature id for the '<em><b>Necessity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_MATRIX_ELEMENT__NECESSITY = 1;

	/**
	 * The feature id for the '<em><b>Possibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_MATRIX_ELEMENT__POSSIBILITY = 2;

	/**
	 * The number of structural features of the '<em>Transition Matrix Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_MATRIX_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.reliability.system.impl.GeneralizedNetImpl <em>Generalized Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.reliability.system.impl.GeneralizedNetImpl
	 * @see com.reliability.system.impl.SystemPackageImpl#getGeneralizedNet()
	 * @generated
	 */
	int GENERALIZED_NET = 3;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZED_NET__TRANSITIONS = 0;

	/**
	 * The feature id for the '<em><b>Positions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZED_NET__POSITIONS = 1;

	/**
	 * The feature id for the '<em><b>System Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZED_NET__SYSTEM_INPUTS = 2;

	/**
	 * The feature id for the '<em><b>Final Positions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZED_NET__FINAL_POSITIONS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZED_NET__NAME = 4;

	/**
	 * The number of structural features of the '<em>Generalized Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZED_NET_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.reliability.system.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.reliability.system.impl.PortImpl
	 * @see com.reliability.system.impl.SystemPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__ID = POSITION__ID;

	/**
	 * The feature id for the '<em><b>Transition Row</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__TRANSITION_ROW = POSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__TYPE = POSITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = POSITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.reliability.system.impl.FailureImpl <em>Failure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.reliability.system.impl.FailureImpl
	 * @see com.reliability.system.impl.SystemPackageImpl#getFailure()
	 * @generated
	 */
	int FAILURE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE__ID = POSITION__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE__OWNER = POSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Failure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_FEATURE_COUNT = POSITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.reliability.system.PositionType <em>Position Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.reliability.system.PositionType
	 * @see com.reliability.system.impl.SystemPackageImpl#getPositionType()
	 * @generated
	 */
	int POSITION_TYPE = 6;

	/**
	 * The meta object id for the '{@link com.reliability.system.TransitionType <em>Transition Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.reliability.system.TransitionType
	 * @see com.reliability.system.impl.SystemPackageImpl#getTransitionType()
	 * @generated
	 */
	int TRANSITION_TYPE = 7;


	/**
	 * Returns the meta object for class '{@link com.reliability.system.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see com.reliability.system.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link com.reliability.system.Transition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.reliability.system.Transition#getName()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.reliability.system.Transition#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.reliability.system.Transition#getDescription()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Description();

	/**
	 * Returns the meta object for the reference list '{@link com.reliability.system.Transition#getInputPorts <em>Input Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Ports</em>'.
	 * @see com.reliability.system.Transition#getInputPorts()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_InputPorts();

	/**
	 * Returns the meta object for the reference list '{@link com.reliability.system.Transition#getOutputPorts <em>Output Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output Ports</em>'.
	 * @see com.reliability.system.Transition#getOutputPorts()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_OutputPorts();

	/**
	 * Returns the meta object for the containment reference '{@link com.reliability.system.Transition#getFailureState <em>Failure State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Failure State</em>'.
	 * @see com.reliability.system.Transition#getFailureState()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_FailureState();

	/**
	 * Returns the meta object for the attribute '{@link com.reliability.system.Transition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.reliability.system.Transition#getType()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Type();

	/**
	 * Returns the meta object for class '{@link com.reliability.system.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see com.reliability.system.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for the attribute '{@link com.reliability.system.Position#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.reliability.system.Position#getId()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Id();

	/**
	 * Returns the meta object for class '{@link com.reliability.system.TransitionMatrixElement <em>Transition Matrix Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Matrix Element</em>'.
	 * @see com.reliability.system.TransitionMatrixElement
	 * @generated
	 */
	EClass getTransitionMatrixElement();

	/**
	 * Returns the meta object for the reference '{@link com.reliability.system.TransitionMatrixElement#getOppositePosition <em>Opposite Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opposite Position</em>'.
	 * @see com.reliability.system.TransitionMatrixElement#getOppositePosition()
	 * @see #getTransitionMatrixElement()
	 * @generated
	 */
	EReference getTransitionMatrixElement_OppositePosition();

	/**
	 * Returns the meta object for the attribute '{@link com.reliability.system.TransitionMatrixElement#getNecessity <em>Necessity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Necessity</em>'.
	 * @see com.reliability.system.TransitionMatrixElement#getNecessity()
	 * @see #getTransitionMatrixElement()
	 * @generated
	 */
	EAttribute getTransitionMatrixElement_Necessity();

	/**
	 * Returns the meta object for the attribute '{@link com.reliability.system.TransitionMatrixElement#getPossibility <em>Possibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Possibility</em>'.
	 * @see com.reliability.system.TransitionMatrixElement#getPossibility()
	 * @see #getTransitionMatrixElement()
	 * @generated
	 */
	EAttribute getTransitionMatrixElement_Possibility();

	/**
	 * Returns the meta object for class '{@link com.reliability.system.GeneralizedNet <em>Generalized Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalized Net</em>'.
	 * @see com.reliability.system.GeneralizedNet
	 * @generated
	 */
	EClass getGeneralizedNet();

	/**
	 * Returns the meta object for the containment reference list '{@link com.reliability.system.GeneralizedNet#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see com.reliability.system.GeneralizedNet#getTransitions()
	 * @see #getGeneralizedNet()
	 * @generated
	 */
	EReference getGeneralizedNet_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link com.reliability.system.GeneralizedNet#getPositions <em>Positions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Positions</em>'.
	 * @see com.reliability.system.GeneralizedNet#getPositions()
	 * @see #getGeneralizedNet()
	 * @generated
	 */
	EReference getGeneralizedNet_Positions();

	/**
	 * Returns the meta object for the reference list '{@link com.reliability.system.GeneralizedNet#getSystemInputs <em>System Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>System Inputs</em>'.
	 * @see com.reliability.system.GeneralizedNet#getSystemInputs()
	 * @see #getGeneralizedNet()
	 * @generated
	 */
	EReference getGeneralizedNet_SystemInputs();

	/**
	 * Returns the meta object for the reference list '{@link com.reliability.system.GeneralizedNet#getFinalPositions <em>Final Positions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Final Positions</em>'.
	 * @see com.reliability.system.GeneralizedNet#getFinalPositions()
	 * @see #getGeneralizedNet()
	 * @generated
	 */
	EReference getGeneralizedNet_FinalPositions();

	/**
	 * Returns the meta object for the attribute '{@link com.reliability.system.GeneralizedNet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.reliability.system.GeneralizedNet#getName()
	 * @see #getGeneralizedNet()
	 * @generated
	 */
	EAttribute getGeneralizedNet_Name();

	/**
	 * Returns the meta object for class '{@link com.reliability.system.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see com.reliability.system.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the containment reference list '{@link com.reliability.system.Port#getTransitionRow <em>Transition Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transition Row</em>'.
	 * @see com.reliability.system.Port#getTransitionRow()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_TransitionRow();

	/**
	 * Returns the meta object for the attribute '{@link com.reliability.system.Port#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.reliability.system.Port#getType()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Type();

	/**
	 * Returns the meta object for class '{@link com.reliability.system.Failure <em>Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure</em>'.
	 * @see com.reliability.system.Failure
	 * @generated
	 */
	EClass getFailure();

	/**
	 * Returns the meta object for the container reference '{@link com.reliability.system.Failure#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see com.reliability.system.Failure#getOwner()
	 * @see #getFailure()
	 * @generated
	 */
	EReference getFailure_Owner();

	/**
	 * Returns the meta object for enum '{@link com.reliability.system.PositionType <em>Position Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Position Type</em>'.
	 * @see com.reliability.system.PositionType
	 * @generated
	 */
	EEnum getPositionType();

	/**
	 * Returns the meta object for enum '{@link com.reliability.system.TransitionType <em>Transition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transition Type</em>'.
	 * @see com.reliability.system.TransitionType
	 * @generated
	 */
	EEnum getTransitionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SystemFactory getSystemFactory();

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
		 * The meta object literal for the '{@link com.reliability.system.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.reliability.system.impl.TransitionImpl
		 * @see com.reliability.system.impl.SystemPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__NAME = eINSTANCE.getTransition_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__DESCRIPTION = eINSTANCE.getTransition_Description();

		/**
		 * The meta object literal for the '<em><b>Input Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__INPUT_PORTS = eINSTANCE.getTransition_InputPorts();

		/**
		 * The meta object literal for the '<em><b>Output Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__OUTPUT_PORTS = eINSTANCE.getTransition_OutputPorts();

		/**
		 * The meta object literal for the '<em><b>Failure State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__FAILURE_STATE = eINSTANCE.getTransition_FailureState();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__TYPE = eINSTANCE.getTransition_Type();

		/**
		 * The meta object literal for the '{@link com.reliability.system.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.reliability.system.impl.PositionImpl
		 * @see com.reliability.system.impl.SystemPackageImpl#getPosition()
		 * @generated
		 */
		EClass POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__ID = eINSTANCE.getPosition_Id();

		/**
		 * The meta object literal for the '{@link com.reliability.system.impl.TransitionMatrixElementImpl <em>Transition Matrix Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.reliability.system.impl.TransitionMatrixElementImpl
		 * @see com.reliability.system.impl.SystemPackageImpl#getTransitionMatrixElement()
		 * @generated
		 */
		EClass TRANSITION_MATRIX_ELEMENT = eINSTANCE.getTransitionMatrixElement();

		/**
		 * The meta object literal for the '<em><b>Opposite Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_MATRIX_ELEMENT__OPPOSITE_POSITION = eINSTANCE.getTransitionMatrixElement_OppositePosition();

		/**
		 * The meta object literal for the '<em><b>Necessity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_MATRIX_ELEMENT__NECESSITY = eINSTANCE.getTransitionMatrixElement_Necessity();

		/**
		 * The meta object literal for the '<em><b>Possibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_MATRIX_ELEMENT__POSSIBILITY = eINSTANCE.getTransitionMatrixElement_Possibility();

		/**
		 * The meta object literal for the '{@link com.reliability.system.impl.GeneralizedNetImpl <em>Generalized Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.reliability.system.impl.GeneralizedNetImpl
		 * @see com.reliability.system.impl.SystemPackageImpl#getGeneralizedNet()
		 * @generated
		 */
		EClass GENERALIZED_NET = eINSTANCE.getGeneralizedNet();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZED_NET__TRANSITIONS = eINSTANCE.getGeneralizedNet_Transitions();

		/**
		 * The meta object literal for the '<em><b>Positions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZED_NET__POSITIONS = eINSTANCE.getGeneralizedNet_Positions();

		/**
		 * The meta object literal for the '<em><b>System Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZED_NET__SYSTEM_INPUTS = eINSTANCE.getGeneralizedNet_SystemInputs();

		/**
		 * The meta object literal for the '<em><b>Final Positions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZED_NET__FINAL_POSITIONS = eINSTANCE.getGeneralizedNet_FinalPositions();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZED_NET__NAME = eINSTANCE.getGeneralizedNet_Name();

		/**
		 * The meta object literal for the '{@link com.reliability.system.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.reliability.system.impl.PortImpl
		 * @see com.reliability.system.impl.SystemPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Transition Row</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__TRANSITION_ROW = eINSTANCE.getPort_TransitionRow();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__TYPE = eINSTANCE.getPort_Type();

		/**
		 * The meta object literal for the '{@link com.reliability.system.impl.FailureImpl <em>Failure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.reliability.system.impl.FailureImpl
		 * @see com.reliability.system.impl.SystemPackageImpl#getFailure()
		 * @generated
		 */
		EClass FAILURE = eINSTANCE.getFailure();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE__OWNER = eINSTANCE.getFailure_Owner();

		/**
		 * The meta object literal for the '{@link com.reliability.system.PositionType <em>Position Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.reliability.system.PositionType
		 * @see com.reliability.system.impl.SystemPackageImpl#getPositionType()
		 * @generated
		 */
		EEnum POSITION_TYPE = eINSTANCE.getPositionType();

		/**
		 * The meta object literal for the '{@link com.reliability.system.TransitionType <em>Transition Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.reliability.system.TransitionType
		 * @see com.reliability.system.impl.SystemPackageImpl#getTransitionType()
		 * @generated
		 */
		EEnum TRANSITION_TYPE = eINSTANCE.getTransitionType();

	}

} //SystemPackage
