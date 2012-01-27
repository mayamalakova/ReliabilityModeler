package com.system.reliability.modeler.utils;

import com.reliability.system.Failure;
import com.reliability.system.GeneralizedNet;
import com.reliability.system.Port;
import com.reliability.system.PositionType;
import com.reliability.system.SystemFactory;
import com.reliability.system.Transition;
import com.reliability.system.TransitionType;

public class ReliabilityModelUtils {
	
	private static SystemFactory factory = SystemFactory.eINSTANCE; 
	
	public static GeneralizedNet createModel(){
		GeneralizedNet generalizedNet = factory.createGeneralizedNet();
		
		Transition connector = createTransition("Event Bus", "Transmits events between components", TransitionType.CONNECTOR);
		Port input1 = createPort("L11", PositionType.INTERNAL);
		connector.getInputPorts().add(input1);
		Port output1 = createPort("L12", PositionType.INTERNAL);
		connector.getOutputPorts().add(output1);
		Failure failure = createFailure("M1");
		connector.setFailureState(failure);
		generalizedNet.getTransitions().add(connector);
		
		Transition userInput = createTransition("User Input", null, TransitionType.COMPONENT);
		input1 = createPort("L21", PositionType.SYSTEM_INPUT);
		userInput.getInputPorts().add(input1);
		output1 = createPort("L22", PositionType.INTERNAL);
		userInput.getOutputPorts().add(output1);
		failure = createFailure("M2");
		userInput.setFailureState(failure);
		generalizedNet.getTransitions().add(userInput);
		
		Transition screenDriver = createTransition("Screen Driver", null, TransitionType.COMPONENT);
		input1 = createPort("L31", PositionType.INTERNAL);
		screenDriver.getInputPorts().add(input1);
		output1 = createPort("L32", PositionType.FINAL);
		screenDriver.getOutputPorts().add(output1);
		failure = createFailure("M3");
		screenDriver.setFailureState(failure);
		generalizedNet.getTransitions().add(screenDriver);
		
		return generalizedNet;
	}
	
	private static Transition createTransition(String name, String description, TransitionType type){
		Transition connector = factory.createTransition();
		connector.setName(name);
		connector.setDescription(description);
		connector.setType(type);
		
		return connector;
	}
	
	private static Port createPort(String id, PositionType type){
		Port port = factory.createPort();
		port.setId(id);
		port.setType(type);
		
		return port;
	}
	
	private static Failure createFailure(String id){
		Failure failure = factory.createFailure();
		failure.setId(id);
		
		return failure;
	}
}
