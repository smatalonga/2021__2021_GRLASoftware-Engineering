package com.uws.glaSE.week5.cesarcypher;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class CesarCypherTest {

	@Test
	void testNullMessage() {
		String output = CesarCypher.Cypher(null, 1);
		assertNull(output);
	}
	
	@Test
	void testEmptyMessage() {
		String output = CesarCypher.Cypher("", 1);
		assertEquals("", output);
	}
	
	
	@Test
	void testPalindromeMessage() {
		String message = "amor a roma";
		String cyper = "bnps b spnb";
		String output = CesarCypher.Cypher(message, 1);
		assertEquals(cyper, output);
		
		output = CesarCypher.DeCypher(output, 1);
		assertEquals(message, output); 
	}
	
	@Test
	void testAnyStringMessage() {
		String message = "Roma";
		String expected = "amoR";
		String output = CesarCypher.Cypher(message, 1);
		assertEquals(expected, output);
	}
	
	

}
