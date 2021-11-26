package se.sigmatechnology.codingdojo.stringcalculator01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Random;

import org.junit.jupiter.api.Test;

public class CalcTest {

	private int random1 = getRandomValue();
	
	@Test
	public void addEmptyStringReturnsZero() {
		Calc calc = new Calc();
		
		int result = calc.add("");
		
		assertEquals(0, result);
	}

	@Test
	public void add123Returns123() {
		Calc calc = new Calc();
		
		int result = calc.add("" + random1);
		
		assertEquals(random1, result);
	}
	
	private int getRandomValue() {
		Random generator = new Random();
		return generator.nextInt(100);
	}
}
