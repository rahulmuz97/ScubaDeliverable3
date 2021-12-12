package com.test.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class LoginPageObject
{
	WebDriver driver;
	//Locators
	By username=By.id("txtUsername");
	By password=By.name("txtPassword");
	By loginButton=By.xpath("//input[@id=\"btnLogin\"]");
	
	//constructor invoked at the time of object creation, pass driver chrome/firefox/safari..
	public LoginPageObject(WebDriver driver) 
	{
		this.driver = driver;
	}
	// Automation actions/methods
	
	
	public void typeUserName() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.findElement(username).sendKeys("Admin");

	}
	public void typePassword() throws InterruptedException
	{
		Thread.sleep(4000);
		
		driver.findElement(password).sendKeys("admin123");

	}
	public void clickOnLoginButton()
	{
		driver.findElement(loginButton).click();	
	}

}











