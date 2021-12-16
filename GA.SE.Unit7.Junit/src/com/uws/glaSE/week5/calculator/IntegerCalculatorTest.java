package com.uws.glaSE.week5.calculator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class IntegerCalculatorTest {

	@Test
	public void testSum() {
		//Elements of a test case
		//Test Environment
		IntegerCalculator anIntegerCalc = new IntegerCalculator();
		//Test Input
		int firtNumber = 3;
		int secondNumber = 3;
		//Test Expectation
		int expectedResult = 6;
		//Execute the test script
		int testResult = anIntegerCalc.sum(firtNumber, secondNumber);
		//Compare the result against the expectation
		Assert.assertEquals("3+3 is 6!", expectedResult, testResult);
	}
	
	

}
