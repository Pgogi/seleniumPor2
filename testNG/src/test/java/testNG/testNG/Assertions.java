package testNG.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Assertions {

	//Assertions are use to compare the expected and actual results
	//Assert.assertTrue(), Assert.assertFalse(), 

	WebDriver driver;
	@BeforeClass
	void setup() {

		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
	}
	
	
	@AfterClass
	void tearDown() {
	driver.close();
	}

	@Test
	void verifypagetitle() {
		String Expected = "Google";
		String Actual = driver.getTitle();
		Assert.assertEquals(Expected, Actual);
	}
	
	@Test
	void verfyGooglelogo() {
		WebElement image =  driver.findElement(By.id("logo"));
		
		//verify google image displayed
		Assert.assertTrue(image.isDisplayed());
		
		//verify image should not be displayed
		//Assert.assertFalse(image.isDisplayed());
		
	}
}
