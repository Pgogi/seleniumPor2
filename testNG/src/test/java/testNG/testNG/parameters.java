package testNG.testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameters {

	//@Parameteres({});

	@Test
	@Parameters({"a","b"})
	void add(int num1, int num2)
	{
		int sum = num1 + num2;
		System.out.println("sum of the two integers is: " + sum);
		
	}
}
