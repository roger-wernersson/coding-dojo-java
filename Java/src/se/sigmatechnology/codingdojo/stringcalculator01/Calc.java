package se.sigmatechnology.codingdojo.stringcalculator01;

public class Calc {

	public int add(String input) {
		
		if (input.isEmpty()) return 0;

		return Integer.parseInt(input);
	}
}
