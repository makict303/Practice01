package com.phpTravels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.phpTravels;



public class signupForm {
	WebDriver driver;
	phpTravels rp;
	
	
	
	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\TestingFiles/chromedriver.exe");	
		driver = new ChromeDriver();
		rp = new phpTravels(driver);
		driver.get("https://www.phptravels.net/register");
	}
	
	@Parameters({"firstName","lastName", "MobileNo", "email", "password","confirmPassword"})
	
	@Test(priority=1)
	public void fillupRegistrationForm(String firstName,String lastName, String MobileNo, String email,String password,String confirmPassword) throws InterruptedException {
		rp.getFirstNameBox().sendKeys(firstName);
		rp.getLastNameBox().sendKeys(lastName);
		rp.getMobileNumberBox().sendKeys(MobileNo);
		rp.getEmaileBox().sendKeys(email);
		rp.getPaswordeBox().sendKeys(password);
		rp.getConfirmPasswordBox().sendKeys(confirmPassword);
		Thread.sleep(3000);
	}
	

	
	@Test(priority=2)
	public void signupButtonText() {
		String signupButtonText = rp.readsignupButtonText().getText();
	Assert.assertEquals(signupButtonText, "SIGN UP");
		String actual = driver.getCurrentUrl();
		Assert.assertEquals(actual, "https://www.phptravels.net/register");
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "register");
	}
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

}
