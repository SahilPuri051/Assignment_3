package com.qa.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.basetest.Constants;
import com.qa.basetest.TestBase;
import com.qa.pages.ACEPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class ACEPageTest extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;
	ACEPage analyzepage;
	
	public ACEPageTest()
	{
		super();
	}
	
	@BeforeClass
	public void init()
	{
		initialize();
		loginpage = new LoginPage();
		homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		analyzepage=homepage.goToACE();
	}
	
	
	@Test(priority=14)
	public void enterFrame()
	{
		analyzepage.clickonDev();
		analyzepage.enterFrame(Constants.Chart_Number);
		analyzepage.exitFrame();
	}
	
	
	@Test(priority=15)
	public void downloadPngTest() throws InterruptedException
	{
		analyzepage.enterBigFrameAndClickMenu();
		analyzepage.downloadPng();
	}

}
