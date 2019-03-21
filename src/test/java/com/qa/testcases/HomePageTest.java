package com.qa.testcases;

import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.basetest.Constants;
import com.qa.basetest.TestBase;
import com.qa.pages.ACEPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class HomePageTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;
	ACEPage acepage;
	
	public HomePageTest()
	{
		super();
	}
	
	@BeforeClass
	public void init()
	{
		initialize();
		loginpage=new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=12)
	public void checkHomePageTitle()
	{
		Assert.assertEquals(homepage.getPageTitle(),Constants.HomePageTitle);
		homepage.clickACE();
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException
	{
		homepage.logout();
		Thread.sleep(2000);
		driver.quit();
	
	}
}
