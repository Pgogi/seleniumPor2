package testNG.testNG;

import org.testng.annotations.Test;

public class FirstTestCase {
	
	//in testNG cases executes with alphabetical order, if we want to execute according priority
	//then we need to add "priority" attribute with @Test
	
	@Test(priority=1)
	void setup() {
		System.out.println("This is demo setup method");
	}

	@Test(priority=2)
	void login() {
		System.out.println("This is demo login method");
	}
	
	@Test(priority=3)
	void logout() {
		System.out.println("This is dmeo log out method");
	}
}
