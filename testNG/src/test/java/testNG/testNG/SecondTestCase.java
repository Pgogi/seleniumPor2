package testNG.testNG;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class SecondTestCase {
	
	
	//need to use the assert statement to verify whether test is pass or fail
	@Test
	public void testMethod1()
	{
		System.out.println("Test case 1");
		
		Assert.assertEquals(1, 2);
	}

	@Test
	public void testMethod2()
	{
		System.out.println("Test case 2");
	}
	@Test
	public void testMethod3()
	{
		System.out.println("Test case 3");
	}
}
