package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.basetest.BaseTest;

public class Loginpage2 extends BaseTest {

	@FindBy(xpath="//input[@id='ap_email']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement submit;
	
	public Loginpage2()
	{
		PageFactory.initElements(driver,this);
	}
	
	public homepage signindetails(String un,String pa)
	{
		username.sendKeys(config.getProperty(un));
		password.sendKeys(config.getProperty(pa));
		submit.click();
		return new homepage();
	}
	
}
