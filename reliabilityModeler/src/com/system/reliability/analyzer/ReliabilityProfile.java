package com.system.reliability.analyzer;

import java.util.HashMap;
import java.util.Map;

import com.reliability.system.Failure;
import com.reliability.system.Transition;
import com.system.reliability.modeler.i18n.Messages;

public class ReliabilityProfile {
	private Transition weakestTransition;
	private float totalReliability;
	private Map<Failure, Float> failureToNecessity;
	private boolean isCalculated = false;
	
	//TODO add possibility to calculations
	public ReliabilityProfile(){
		failureToNecessity = new HashMap<Failure, Float>();
	}
	
	public void updateFailureNecessity(TransitionPath path) {
		Failure failure = path.getFailure();
		float pathReliability = path.getReliability();
		Float oldNecessity = failureToNecessity.get(failure);
		if (oldNecessity == null || oldNecessity < pathReliability) {
			failureToNecessity.put(failure, Float.valueOf(pathReliability));
			isCalculated = false;
		}
	}
	
	public void calculateTotalReliability(){
		totalReliability = 0;
		for (Failure failure: failureToNecessity.keySet()) {
			float necessity = failureToNecessity.get(failure);
			if (totalReliability < necessity) {
				totalReliability = necessity;
				weakestTransition = failure.getOwner();
			}
		}
		
		isCalculated = true;
	}

	public Transition getWeakestTransition() {
		if (!isCalculated){
			calculateTotalReliability();
		}
		return weakestTransition;
	}

	public float getTotalReliability() {
		if (!isCalculated){
			calculateTotalReliability();
		}
		return totalReliability;
	}
	
	public String toString() {
		if (getWeakestTransition() == null) {
			return Messages.profile_message_not_enough_data;
		}
		String necessity = Float.toString(getTotalReliability());  
		String possibiility = Float.toString(1 - getTotalReliability());
		String weekestPoint = getWeakestTransition().getName();
		String displayText = Messages.bind(Messages.profile_result, new String[]{necessity, possibiility, weekestPoint});
		return displayText;
	}
}
