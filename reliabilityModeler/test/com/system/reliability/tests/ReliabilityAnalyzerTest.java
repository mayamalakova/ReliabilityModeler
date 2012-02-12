package com.system.reliability.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.reliability.system.Port;
import com.system.reliability.analyzer.ReliabilityAnalyzer;
import com.system.reliability.analyzer.ReliabilityProfile;
import com.system.reliability.modeler.utils.ReliabilityModelUtils;

public class ReliabilityAnalyzerTest {
	private static float EPSILON = 0.00000001f;
	
	@Test
	public void testReadModelFromFile() {
		ReliabilityAnalyzer analyzer = new ReliabilityAnalyzer();
		analyzer.readModel("test/My.system");
		assertNotNull(analyzer.getSystemModel());
		assertEquals("User Interface", analyzer.getSystemModel().getName());
	}

	@Test
	public void testRetrieveSystemInputs() {
		ReliabilityAnalyzer analyzer = new ReliabilityAnalyzer();
		analyzer.readModel("test/My.system");
		assertNotNull(analyzer.getSystemModel());
		assertEquals("User Interface", analyzer.getSystemModel().getName());
		List<Port> systemInputs = ReliabilityModelUtils.getSystemInputs(analyzer.getSystemModel());
		assertEquals(2, systemInputs.size());
		assertEquals("L11", systemInputs.get(0).getId());
		assertEquals("L21", systemInputs.get(1).getId());
	}
	
	@Test
	public void testEstimateReliability() {
		ReliabilityAnalyzer analyzer = new ReliabilityAnalyzer();
		analyzer.readModel("test/My.system");
		Map<Port, ReliabilityProfile> reliabilityProfiles = analyzer.estimateReliability();
		
		for (Port port: reliabilityProfiles.keySet()) {
			ReliabilityProfile profile = reliabilityProfiles.get(port);
			if (port.getId().equals("L11")){
				assertEquals(0.02f, profile.getTotalReliability(), EPSILON);
				assertEquals("Event Transmitter", profile.getWeakestTransition().getName());
			} else if (port.getId().equals("L21")) {
				assertEquals(0.03f, profile.getTotalReliability(), EPSILON);
				assertEquals("Input Device Driver 2", profile.getWeakestTransition().getName());
			}
		}
	}
}
