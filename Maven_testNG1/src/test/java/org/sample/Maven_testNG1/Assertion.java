package org.sample.Maven_testNG1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import org.testng.Assert;

public class Assertion {

	@Test
	public void GooglePage() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String expectedTitle = "OrangeHRM";
		String Actual = driver.getTitle();
		Assert.assertEquals(Actual, expectedTitle, "Title is mismatched");
		driver.quit();
		
	}
}
