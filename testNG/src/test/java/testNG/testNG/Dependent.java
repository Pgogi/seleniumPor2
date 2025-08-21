package testNG.testNG;

import org.testng.annotations.Test;

public class Dependent {

	@Test(dependsOnMethods= {"openbrowser"})
	public void signin() {
		System.out.println("The sign in method");
	}
	
	@Test
	public void openbrowser() {
		System.out.println("This is open browser method");
	}
	
	@Test(dependsOnMethods= {"signin"})
	void logOut() {
		System.out.println("This is logout method");
	}
}
