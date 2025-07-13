package org.sample.Maven_testNG1;

import org.testng.annotations.Test;

public class grouping2 {

	@Test(groups = {"Sanity"})
	public void WebLoginHomeLoan() {
		System.out.println("WebLogin Home Loan");
	}
	
	@Test(groups = {"Regression"})
	public void MobileLoginHomeLoan() {
		System.out.println("MobileLogin Home Loan");
	}
	
	@Test(groups = {"Smoke"})
	public void APILoginhomeLoan() {
		System.out.println("APILogin Home Loan");
	}
	
	
}
