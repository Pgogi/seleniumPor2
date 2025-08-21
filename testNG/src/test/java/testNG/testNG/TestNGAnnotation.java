package testNG.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;

public class TestNGAnnotation {

	@BeforeTest
	void beforeTest() {
		System.out.println("Before test method");
	}
	
	@AfterTest
	void afterTest() {
		System.out.println("After test method");
	}
	
	@BeforeMethod
	void setup() {
		System.out.println("Before method execution 1");
	}

	@BeforeClass
	void class1() {
		System.out.println("Before class method");
	}
	@AfterClass
	void class2() {
		System.out.println("After class method");
	}
	
	@AfterMethod
	void tearDown() {
		System.out.println("After method execution");
	}
	
	@Test
	void testMethod1() {
		System.out.println("This is fourth method");
	}
	
	@Test
	void testMethod2() {
		System.out.println("This is fifth method");
	}
	

}
