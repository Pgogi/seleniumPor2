package org.sample.Maven_testNG1;

import org.testng.annotations.Test;

public class Prioritization {
	
	@Test
	public void closeBrowser() {
		System.out.println("This is the method for closing the browser");
	}
	
	@Test
	public void openBrowser() {
		System.out.println("This is the method for launching the browser");
	}
	
	@Test
	public void Login () {
		System.out.println("This is login page");
	}

}
