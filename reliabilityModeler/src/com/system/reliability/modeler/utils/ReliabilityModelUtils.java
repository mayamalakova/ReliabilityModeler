package com.system.reliability.modeler.utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import com.reliability.system.Failure;
import com.reliability.system.GeneralizedNet;
import com.reliability.system.Port;
import com.reliability.system.PositionType;
import com.reliability.system.SystemFactory;
import com.reliability.system.SystemPackage;
import com.reliability.system.TransitionMatrixElement;
import com.reliability.system.TransitionType;
import com.reliability.system.util.SystemResourceFactoryImpl;
import com.reliability.system.view.SystemView;
import com.reliability.system.view.TransitionView;
import com.reliability.system.view.ViewFactory;
import com.reliability.system.view.ViewPackage;
import com.reliability.system.view.util.ViewResourceFactoryImpl;

public class ReliabilityModelUtils {
	
	private static ViewFactory viewFactory = ViewFactory.eINSTANCE; 
	private static SystemFactory systemFactory = SystemFactory.eINSTANCE;
	
	public static SystemView createModel(){
		SystemView generalizedNet = viewFactory.createSystemView();
		
		TransitionView connector = createTransition("Event Bus", "Transmits events between components", TransitionType.CONNECTOR);
		Port input1 = createPort("L11", PositionType.INTERNAL);
		connector.getInputPorts().add(input1);
		Port output1 = createPort("L12", PositionType.INTERNAL);
		connector.getOutputPorts().add(output1);
		Failure failure = createFailure("M1");
		connector.setFailureState(failure);
		generalizedNet.getTransitions().add(connector);
		
		TransitionView userInput = createTransition("User Input", null, TransitionType.COMPONENT);
		input1 = createPort("L21", PositionType.SYSTEM_INPUT);
		userInput.getInputPorts().add(input1);
		output1 = createPort("L22", PositionType.INTERNAL);
		userInput.getOutputPorts().add(output1);
		failure = createFailure("M2");
		userInput.setFailureState(failure);
		generalizedNet.getTransitions().add(userInput);
		
		TransitionView screenDriver = createTransition("Screen Driver", null, TransitionType.COMPONENT);
		input1 = createPort("L31", PositionType.INTERNAL);
		screenDriver.getInputPorts().add(input1);
		output1 = createPort("L32", PositionType.FINAL);
		screenDriver.getOutputPorts().add(output1);
		failure = createFailure("M3");
		screenDriver.setFailureState(failure);
		generalizedNet.getTransitions().add(screenDriver);
		
		return generalizedNet;
	}
	
	public static EObject createModelFromFile(String fileLocaltion, Resource resource) {
		EObject model  = null;
		
		SystemPackage.eINSTANCE.eClass();
		ViewPackage.eINSTANCE.eClass();
		ResourceSet resourceSet = new ResourceSetImpl();
		URI uri = URI.createFileURI(fileLocaltion);
		resource = resourceSet.createResource(uri);
		
		if (resource == null) {
			//explicitly register the model resource factory if invoked outside of the eclipse platform
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("system", new SystemResourceFactoryImpl());
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("view", new ViewResourceFactoryImpl());
			resource = resourceSet.createResource(uri);
		}
		
		try {
			resource.load(null);
			model = resource.getContents().get(0);
		} catch (IOException e) {
			model = null;
			e.printStackTrace();
		}

		return model;
	}
	
	private static TransitionView createTransition(String name, String description, TransitionType type){
		TransitionView connector = viewFactory.createTransitionView();
		connector.setName(name);
		connector.setDescription(description);
		connector.setType(type);
		connector.setConstraints(new Rectangle(0, 0, 30, 30));
		
		return connector;
	}
	
	private static Port createPort(String id, PositionType type){
		Port port = systemFactory.createPort();
		port.setId(id);
		port.setType(type);
		
		return port;
	}
	
	private static Failure createFailure(String id){
		Failure failure = systemFactory.createFailure();
		failure.setId(id);
		
		return failure;
	}
	
	public static List<Port> clonePortsList(List<Port> source){
		List<Port> target = new ArrayList<Port>();
		for (Port port: source){
			target.add(port);
		}
		return target;
	}
	
	//TODO: Make this work with SystemView
	public static List<Port> getSystemInputs(GeneralizedNet systemModel) {
		List<Port> systemInputs = ReliabilityModelUtils.clonePortsList(systemModel.getPositions());
		
		for (Port port: systemModel.getPositions()) {
			for (TransitionMatrixElement matrixElement: port.getTransitionRow()){
				systemInputs.remove(matrixElement.getOppositePosition());
			}
		}
		
		return systemInputs;
	}
	
}
