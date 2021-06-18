package com.cg.tdddemo.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {
	private StringCalculator stringCalculator;
	private static final String ANY_SINGLE_NUMBER_AS_STRING = "500";
	private static final int SAME_SINGLE_NUMBER_AS_INTEGER = 500;

	@Before
	public void setup() {
		stringCalculator = new StringCalculator();
	}

	@Test
	public void test_calculate_GivenEmptyString_ShouldReturnZeroAsNumber() {

		int result = stringCalculator.calculate("");
		assertEquals(0, result);
	}

	@Test
	public void test_calculate_GivenAnySingleNumberAsString_ShouldReturnSameNumberAsInteger() {

		int result = stringCalculator.calculate(ANY_SINGLE_NUMBER_AS_STRING);
		assertEquals(SAME_SINGLE_NUMBER_AS_INTEGER, result);
	}
	
	@Test
	public void test_calculate_Given1And2AsString_ShouldReturn3AsInteger() {

		int result = stringCalculator.calculate("1,2");
		assertEquals(3, result);
	}
	
	@Test
	public void test_calculate_Given10And20AsString_ShouldReturn30AsInteger() {

		int result = stringCalculator.calculate("10,20");
		assertEquals(30, result);
	}
	@Test
	public void test_calculate_Given100And200AsString_ShouldReturn300AsInteger() {

		int result = stringCalculator.calculate("100,200");
		assertEquals(300, result);
	}
	@Test
	public void test_calculate_Given100And200And300AsString_ShouldReturn600AsInteger() {

		int result = stringCalculator.calculate("100,200,300");
		assertEquals(600, result);
	}
	
	@Test
	public void test_calculate_GivenBAndA_ThrowNumberFormatException() {

		int result = stringCalculator.calculate("B,A");
		
	}
	

	

}
