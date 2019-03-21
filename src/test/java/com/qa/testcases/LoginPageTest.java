package com.qa.testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.basetest.*;
import com.qa.pages.*;

public class LoginPageTest extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeClass
	public void init()
	{
		initialize();
		loginpage=new LoginPage();
	}
	
	@Test(priority=1)
	public void usernametype()
	{
		String un=loginpage.getUsernameType();
		Assert.assertEquals(un,Constants.usernameType);
	}
	
	@Test(priority=2)
	public void usernametext()
	{
		String un1=loginpage.getUsernamePlaceholder();
		Assert.assertEquals(un1,Constants.usernamePlaceholder);
	}
	@Test(priority=3)
	public void passwordtext()
	{
		String pa=loginpage.getPasswordPlaceholder();
		Assert.assertEquals(pa,Constants.passwordPlaceholder);
	}
	
	@Test(priority=4)
	public void passwordtype()
	{
		String pa1=loginpage.getPasswordType();
		Assert.assertEquals(pa1,Constants.passwordType);
	}
	
	@Test(priority=5)
	public void welcomeMsg()
	{
		Assert.assertEquals(loginpage.getWelcomeMsg(),Constants.WelcomeMsg);
	}
	
	@Test(priority=6)
	public void checkTitle()
	{
		Assert.assertEquals(loginpage.getTitle(),Constants.HomePageTitle);
	}

	@Test(priority=7)
	public void loginButtonHeight()
	{
		Assert.assertEquals(loginpage.btnheight(),Constants.loginBtnHeight);	   
	}
	
	@Test(priority=8)
	public void loginButtonColor()
	{
		Assert.assertEquals(loginpage.btncolor(),Constants.loginBtnColor);	   
	}
	
	@Test(priority=9)
	public void loginButtonalign()
	{
		Assert.assertEquals(loginpage.btnalign(),Constants.btnalign);	   
	}
	
	@Test(priority=10)
	public void checkboxinital()
	{
		Assert.assertFalse(loginpage.getcheckboxstate());
	}
	
	@Test(priority=11)
	public void checkboxfinal() throws InterruptedException
	{
		loginpage.checkBoxClick();
		Assert.assertTrue(loginpage.checkBoxStatusAfterChecked());
	}
	   
	@Test
	public void usernameParameters()
	{
	 Assert.assertEquals(loginpage.getUsernamealign(),Constants.usernameAlign);	
	 Assert.assertEquals(loginpage.getUsernamebgColor(),Constants.usernameBgColor);
	 Assert.assertEquals(loginpage.getUsernameSize(),Constants.usernameSize);
	 Assert.assertEquals(loginpage.getUsernamewidth(),Constants.usernameWidth);
	}
	
	@AfterClass
	public void tearDown()
	{
	
		driver.quit();
		
	}
}
