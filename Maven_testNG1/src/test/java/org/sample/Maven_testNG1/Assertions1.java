package org.sample.Maven_testNG1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Assertions1 {

	@Test
	public void Title() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		usernameField.sendKeys("Prabhakar", Keys.ENTER);
		Thread.sleep(3000);

		//Title
		String actualTitle = driver.getTitle();
		String ExpectedTitle = "OrangeHRM";
		Assert.assertEquals(actualTitle, ExpectedTitle);
		//URL
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		Assert.assertEquals(actualURL, expectedURL);
		//text
		String ActualText =  driver.findElement(By.name("username")).getAttribute("value");
		String ExpectedText = "Prabhakar";
		Assert.assertEquals(ActualText, ExpectedText);	

		System.out.println("Execution done successfully");
		driver.quit();

	}

	//intentionally failed the testcase
	@Test
	public void URL() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		usernameField.sendKeys("Prabhakar", Keys.ENTER);
		Thread.sleep(3000);

		//URL
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://opensource-demoo.orangehrmlive.com/web/index.php/auth/login";
		Assert.assertEquals(actualURL, expectedURL);
		
		//text
		String actualtext =  driver.findElement(By.name("username")).getAttribute("value");
		String ExpectedText = "Prabhakar";
		Assert.assertEquals(actualtext, ExpectedText);	
		
		driver.quit();
	}


}
