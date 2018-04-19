package com.qa.calculator;

import org.junit.Assert;
import org.junit.Test;

public class MultiplyTest {

private Multiplier multiplier;
	
	@Test
	public void test() {
		multiplier = new Multiplier();
		int expectedValue = 8;
		int actualValue = multiplier.Multiply(4, 2);
		Assert.assertEquals(expectedValue, actualValue);
	}
}
