package com.qa.calculator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class SubtractorTest {

	private Subtractor subtractor;
	
	@Test
	public void test() {
		subtractor = new Subtractor();
		int expectedValue = 2;
		int actualValue = subtractor.Subtractor(4, 2);
		Assert.assertEquals(expectedValue, actualValue);
	}
}
