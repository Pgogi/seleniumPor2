package testNG.testNG;

import org.testng.annotations.Test;

public class GroupHomeLoan {

	@Test(groups= {"SmokeTest"})
	public void WebLoginHomeLoan() {
		System.out.println("WebLogin Home Loan");
	}
	
	@Test(groups= {"Regression"})
	public void MobileLoginHomeLoan() {
		System.out.println("MobileLogin Home Loan");
	}
	
	@Test
	public void APILoginhomeLoan() {
		System.out.println("APILogin Home Loan");
	}
}
