package org.sample.Maven_testNG1;

import org.testng.annotations.Test;

public class grouping3 {

	@Test(groups = {"Smoke"})
	public void WebLoginCarlLoan() {
		System.out.println("WebLogin Car Loan");
	}
	
	@Test(groups = {"Sanity"})
	public void MobileLoginCarLoan() {
		System.out.println("MobileLogin Car Loan");
	}
	
	@Test(groups = {"Regression"})
	public void APILoginCarLoan() {
		System.out.println("APILogin Car Loan");
	}
	
	
}
