package org.sample.Maven_testNG1;

import org.testng.annotations.Test;

public class grouping1 {

	//Grouping the test based on category i.e. sanity test, regression test, functional test etc..
	
	@Test(groups = {"Sanity"})
	public void WebLoginPersonalLoan() {
		System.out.println("WebLogin Personal Loan");
	}
	
	@Test(groups = {"Regression"})
	public void MobileLoginPersonalLoan() {
		System.out.println("MobileLogin Personal Loan");
	}
	
	@Test(groups = {"Smoke"})
	public void APILoginPersonalLoan() {
		System.out.println("APILogin Personal Loan");
	}
	
	
}
