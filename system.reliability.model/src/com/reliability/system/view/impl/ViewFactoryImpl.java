/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.reliability.system.view.impl;

import com.reliability.system.view.*;

import org.eclipse.draw2d.geometry.Rectangle;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class ViewFactoryImpl extends EFactoryImpl implements ViewFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static ViewFactory init() {
		try {
			ViewFactory theViewFactory = (ViewFactory)EPackage.Registry.INSTANCE.getEFactory("system.reliability.model.view"); 
			if (theViewFactory != null) {
				return theViewFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ViewFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public ViewFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ViewPackage.SYSTEM_VIEW: return createSystemView();
			case ViewPackage.TRANSITION_VIEW: return createTransitionView();
			case ViewPackage.PORT_VIEW: return createPortView();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ViewPackage.RECTANGLE:
				return createRectangleFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ViewPackage.RECTANGLE:
				return convertRectangleToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SystemView createSystemView() {
		SystemViewImpl systemView = new SystemViewImpl();
		return systemView;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionView createTransitionView() {
		TransitionViewImpl transitionView = new TransitionViewImpl();
		return transitionView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortView createPortView() {
		PortViewImpl portView = new PortViewImpl();
		return portView;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @not generated
	 */
	public Rectangle createRectangleFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) {
			return null;
		}
		String[] values = initialValue.split(",");
		if (values.length != 4) {
			return null;
		}

		Rectangle rect = new Rectangle();
		try {
			int localtionX = Integer.parseInt(values[0].trim());
			int locationY = Integer.parseInt(values[1].trim());
			int width = Integer.parseInt(values[2].trim());
			int heigth = Integer.parseInt(values[3].trim());
			rect.setLocation(localtionX, locationY);
			rect.setSize(width, heigth);
		} catch (NumberFormatException e) {
			EcorePlugin.INSTANCE.log(e);
			rect = null;
		}
		return rect;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @not generated
	 */
	public String convertRectangleToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) {
			return null;
		}
		Rectangle rect = (Rectangle) instanceValue;
		return rect.x + "," + rect.y + "," + rect.width + "," + rect.height;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ViewPackage getViewPackage() {
		return (ViewPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ViewPackage getPackage() {
		return ViewPackage.eINSTANCE;
	}

} // ViewFactoryImpl
