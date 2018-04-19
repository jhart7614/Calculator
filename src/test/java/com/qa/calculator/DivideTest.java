package com.qa.calculator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class DivideTest {

private Divider divider;
	
	@Test
	public void test() {
		divider = new Divider();
		int expectedValue = 2;
		int actualValue = divider.Divide(4, 2);
		Assert.assertEquals(expectedValue, actualValue);
	}

}
