package com.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.qa.basetest.BaseTest;
import com.qa.pages.Loginpage1;
import com.qa.pages.Loginpage2;

public class LoginPage1Test extends BaseTest{
	
	Loginpage1 login1;
	Loginpage2 login2;
	
	public LoginPage1Test()
	{
		super();
	}
	@BeforeMethod
	public void init1()
	{
		
		initialize();
		login1=new Loginpage1();
	}
	
	@Test(priority=1)
	public void test1()
	{
		login1.mousehover();
		log.debug("Mouse hover Done");
		login2=login1.clickSign();
		log.debug("Sign in button is clicked");
		System.out.println(driver.getCurrentUrl());
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
