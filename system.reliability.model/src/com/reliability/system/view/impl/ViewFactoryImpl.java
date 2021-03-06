/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.reliability.system.view.impl;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.reliability.system.Failure;
import com.reliability.system.Port;
import com.reliability.system.Transition;
import com.reliability.system.impl.SystemFactoryImpl;
import com.reliability.system.view.Anchor;
import com.reliability.system.view.FailureView;
import com.reliability.system.view.PortView;
import com.reliability.system.view.SystemView;
import com.reliability.system.view.TransitionView;
import com.reliability.system.view.ViewFactory;
import com.reliability.system.view.ViewLink;
import com.reliability.system.view.ViewPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @not generated
 */
public class ViewFactoryImpl extends SystemFactoryImpl implements ViewFactory {
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
			case ViewPackage.TRANSITION_VIEW: return createTransitionView();
			case ViewPackage.PORT_VIEW: return createPortView();
			case ViewPackage.VIEW_LINK: return createViewLink();
			case ViewPackage.FAILURE_VIEW: return createFailureView();
			case ViewPackage.SYSTEM_VIEW: return createSystemView();
			case ViewPackage.ANCHOR: return createAnchor();
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
			case ViewPackage.POINT:
				return createPointFromString(eDataType, initialValue);
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
			case ViewPackage.POINT:
				return convertPointToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewLink createViewLink() {
		ViewLinkImpl viewLink = new ViewLinkImpl();
		return viewLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureView createFailureView() {
		FailureViewImpl failureView = new FailureViewImpl();
		return failureView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemView createSystemView() {
		SystemViewImpl systemView = new SystemViewImpl();
		return systemView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Anchor createAnchor() {
		AnchorImpl anchor = new AnchorImpl();
		return anchor;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @not generated
	 */
	public Point createPointFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) {
			return null;
		}
		String[] values = initialValue.split(",");
		if (values.length != 2) {
			return null;
		}
		
		Point point = new Point();
		try { 
			point.setLocation(Integer.parseInt(values[0].trim()), Integer.parseInt(values[1].trim()));
		} catch(NumberFormatException e) {
			EcorePlugin.INSTANCE.log(e);
			point = null;		
		}
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @not generated
	 */
	public String convertPointToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) {
			return null;
		}
		Point p = (Point)instanceValue;
		return p.x + "," + p.y;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ViewPackage getViewPackage() {
		return (ViewPackage)getEPackage();
	}

	/**
	 * @not generated
	 */
	@Override
	public Transition createTransition() {
		return createTransitionView();
	}

	/**
	 * @not generated
	 */
	@Override
	public Port createPort() {
		return createPortView();
	}

	/**
	 * @not generated
	 */
	@Override
	public Failure createFailure() {
		return createFailureView();
	}

} // ViewFactoryImpl
