package testNG.testNG;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class Annotations {

	//@Test
	//@BeforeMethod, @AfterMethod. //@BeforeClass, @AfterClass
	//@BeforeTest, @AfterTest. @BeforeSuite, @AfterSuite
	
	@BeforeMethod
	void setup() {
		System.out.println("Before method execution");
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
		System.out.println("This is first method");
	}
	
	@Test
	void testMethod2() {
		System.out.println("This is second method");
	}
	

	@Test
	void testMethod3() {
		System.out.println("This is third method");
	}
}
