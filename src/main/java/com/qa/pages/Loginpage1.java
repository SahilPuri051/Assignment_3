package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.basetest.BaseTest;

public class Loginpage1 extends BaseTest {
	
	public static Actions act;
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	WebElement signin;

	@FindBy(xpath="//div[@id='nav-flyout-ya-signin']//span[text()='Sign in']")
	WebElement signinbutton;
	
	public Loginpage1()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void mousehover()
	{
	act=new Actions(driver);
	act.moveToElement(signin).perform();
	}
	
	public Loginpage2 clickSign()
	{
		act=new Actions(driver);
		act.moveToElement(signin).perform();
		signinbutton.click();
		return new Loginpage2();
	}
}
