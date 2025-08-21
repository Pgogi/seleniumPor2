package testNG.testNG;

import org.testng.annotations.Test;

public class Group_CarLoan {

	@Test(groups= {"SmokeTest"})
	public void WebLoginCarlLoan() {
		System.out.println("WebLogin Car Loan");
	}
	
	@Test
	public void MobileLoginCarLoan() {
		System.out.println("MobileLogin Car Loan");
	}
	
	@Test(groups= {"Sanity"})
	public void APILoginCarLoan() {
		System.out.println("APILogin Car Loan");
	}
}
