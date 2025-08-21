package testNG.testNG;

import org.testng.annotations.*;

public class Groups_PersonalLoan {

	//Grouping the test based on category i.e. sanity test, regression test, functional test etc..
	
	@Test(groups= {"SmokeTest"})
	public void WebLoginPersonalLoan() {
		System.out.println("WebLogin Personal Loan");
	}
	
	@Test
	public void MobileLoginPersonalLoan() {
		System.out.println("MobileLogin Personal Loan");
	}
	
	@Test
	public void APILoginPersonalLoan() {
		System.out.println("APILogin Personal Loan");
	}
	
}
