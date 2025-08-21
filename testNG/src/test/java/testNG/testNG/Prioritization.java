package testNG.testNG;

import org.testng.annotations.*;

public class Prioritization {
	
//setting the execution sequence of the test cases
	//bydefault testNG run the test bases on alphabetically order
	//if we dont want to run any particular test then we have to disable that test case
	//use @Test(enable=false) for not executing the selected test case
	
	
	@Test(priority=1)
	public void CloseBrowser() {
		System.out.println("Close the browser");
	}
	
	@Test
	public void OpenBrowser() {
		System.out.println("Open the browser");
	}
	@Test(enabled=false)
	public void openAccount() {
		System.out.println("Open the account");
	}
}
