package testNG.testNG;

import org.testng.annotations.Test;

public class GroupDependent {

	@Test(dependsOnGroups= {"sanity"})
	public void testMethod1() {
		System.out.println("This is method 1");
	}
	@Test(groups= {"sanity"})
	public void testMethod2() {
		System.out.println("This is method sanity 1");
	}
	@Test(groups= {"sanity"})
	public void testMethod3() {
		System.out.println("This is method sanity 2");
	}
	@Test(groups= {"samity"})
	public void testMethod4() {
		System.out.println("This is method sanity 3");
	}
	
}
