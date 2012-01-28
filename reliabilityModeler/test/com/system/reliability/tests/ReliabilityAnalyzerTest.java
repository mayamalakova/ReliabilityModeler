package com.system.reliability.tests;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.reliability.system.Port;
import com.system.reliability.analyzer.ReliabilityAnalyzer;
import com.system.reliability.modeler.utils.ReliabilityModelUtils;

public class ReliabilityAnalyzerTest {
	
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
}
