package se.sigmatechnology.codingdojo.stringcalculator02;

public class Calc {
	int add(String integers)
	{
		if (integers.isEmpty())
			return 0;
		
		String[] numbers = integers
				.replace("\n", ",")
				.split(",");
		
		int total = 0;
		for (String number : numbers )
		{
			total += Integer.parseInt(number);
		}
		return total;
	}
}
