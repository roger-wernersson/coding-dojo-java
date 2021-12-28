package se.sigmatechnology.codingdojo.stringcalculator02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StringCalcTest {
	
	private int randomNumber = (int)(Math.random() * 10);

	@Test
	void addEmptyStringReturnsZero()
	{
		verifyAdd("", 0);
	}
	
	@Test
	void addSingleDigitReturnInteger()
	{
		verifyAdd(""+randomNumber, randomNumber);
	}
	
	@Test
	void addTwoNumbersReturnTheRightSum()
	{
		verifyAdd("123," + randomNumber,
				randomNumber + 123);
	}
	
	@Test
	void addManyNumbersReturnTheRightSum()
	{
		verifyAdd("1,2,3,4,5,6,7,8,9",
				1+2+3+4+5+6+7+8+9);
	}
	
	@Test
	void addUsingNewlineAsSeparatorGetTheRightSum()
	{
		verifyAdd("1\n2,3",
				1+2+3);
	}
	
	void verifyAdd(String input, int expected)
	{
		Calc calc = new Calc();
		
		int result = calc.add(input);
		
		assertEquals(expected, result);
	}
}
