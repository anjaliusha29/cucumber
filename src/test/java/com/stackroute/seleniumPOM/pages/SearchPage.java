package com.stackroute.seleniumPOM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage
{
	WebDriver driver;
	
	WebElement SE_home_autocomplete;
    WebElement lmy;
    WebElement searchForm;
    //WebElement experience= driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div/form/div/div/div[2]/div[2]/div/div[2]/span"));
  
	WebElement spanMessage;
	
	
	public SearchPage(WebDriver driver)
	{
		this.driver = driver;
	}

	
	public SearchPage validSearch(String skill, String location) throws Exception
	{
		SE_home_autocomplete.sendKeys(skill);
		//password.sendKeys(password1);
		SE_home_autocomplete.click();
		lmy.sendKeys(location);
		lmy.click();
		searchForm.submit();
		
		return new SearchPage(driver);
		
	}


	/*public String invalidLogin(String skill) throws Exception
	{

		signInName.sendKeys(username);
		password.sendKeys(password1);
		signInbtn.click();
		
		
		return spanMessage.getText();
	}
	*/
	
	
	
}








