package com.stackroute.seleniumPOM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage 
{
	WebDriver driver;
	
	WebElement signInName;
	WebElement password;
	WebElement signInbtn;
	WebElement spanMessage;
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}

	
	public DashboardPage validLogin(String username, String password1) throws Exception
	{
		signInName.sendKeys(username);
		password.sendKeys(password1);
		signInbtn.click();
		
		return new DashboardPage(driver);
		
	}
	
	public String invalidLogin(String username, String password1) throws Exception
	{

		signInName.sendKeys(username);
		password.sendKeys(password1);
		signInbtn.click();
		
		
		return spanMessage.getText();
	}
	
	
	
	
}








