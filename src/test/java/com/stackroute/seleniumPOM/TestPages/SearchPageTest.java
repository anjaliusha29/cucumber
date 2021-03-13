package com.stackroute.seleniumPOM.TestPages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.stackroute.seleniumPOM.pages.DashboardPage;
import com.stackroute.seleniumPOM.pages.LoginPage;
import com.stackroute.seleniumPOM.pages.SearchPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchPageTest 
{
static WebDriver wd;
 
SearchPage searchPage= null;
	
	@BeforeClass
	public static void init()
	{
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
		wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.monsterindia.com/seeker/dashboard");
	}
	
	@Test
	public void validSearchTest() throws Exception
	{
		searchPage = new SearchPage(wd);
		
		PageFactory.initElements(wd, searchPage);
		
		SearchPage dbPage = searchPage.validSearch("java","kochi");
				
		
		PageFactory.initElements(wd, dbPage);
		
		//boolean loginstatus = dbPage.getWelcomeMessage().contains("Welcome");
		//assertTrue(loginstatus);
		
		
	}
	
	
	/*@Test
	public void InvalidLoginTest() throws Exception
	{
		loginPage = new LoginPage(wd);
		
		PageFactory.initElements(wd, loginPage);
		
		String errmsg = loginPage.invalidLogin("Dwight@gmail.com", "admin123");
		
		
		
		
		assertTrue(errmsg.contentEquals("Invalid credentials"));
		
		
	}*/


}








