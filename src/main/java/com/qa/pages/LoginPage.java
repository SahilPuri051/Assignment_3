package com.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.basetest.*;

public class LoginPage extends TestBase {

	public WebDriverWait wait;
	
	// Page Factory (Object Repository)
	
	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//div[@btn-text=\"Login\"]")
	WebElement loginbtn;
	
	@FindBy(xpath="//input[@id='metricks']")
	WebElement checkbox;
	
	@FindBy(xpath="//a[contains(@class,'forgot-password')]")
	WebElement linktext;
	
	@FindBy(xpath="//div[@class='info']/h4")
	WebElement WelcomeMsg;
	
	@FindBy(xpath="//span[text()='Terminate']")
	WebElement Alert;
	
   public LoginPage()
   {
	   wait=new WebDriverWait(driver,10);
	   PageFactory.initElements(driver, this);
   }
   
   
   public String getUsernamePlaceholder()
   {
	   return username.getAttribute("placeholder");
   }
   
   
   public String getUsernameType()
   {
	   return username.getAttribute("type");
   }
   
   public String getUsernameSize()
   {
	   return username.getCssValue("height");
   }
   
   public String getUsernamealign()
   {
	   return username.getCssValue("text-align");
   }
   
   
   public String getUsernamewidth()
   {
	   return username.getCssValue("width");
   }
   
   
   public String getUsernamebgColor()
   {
	   return username.getCssValue("background");
   }
   
   
   public String getPasswordPlaceholder()
   {
	   return password.getAttribute("placeholder");
   }
   
   
   public String getPasswordType()
   {
	   return password.getAttribute("type");
   }
   
   public String getpasswordSize()
   {
	   return password.getCssValue("height");
   }
   
   public String getPasswordalign()
   {
	   return password.getCssValue("text-align");
   }
   
   
   public String getPasswordwidth()
   {
	   return password.getCssValue("width");
   }
   
   
   public String getPasswordbgColor()
   {
	   return password.getCssValue("background");
   }
   
   public boolean getcheckboxstate()
   {
	  return checkbox.isSelected();
   }
   
   public boolean checkBoxStatusAfterChecked() 
   {
	   return checkbox.isSelected();
   }
   
   public void checkBoxClick()
   {
	   checkbox.click();
   }
   
   public String getLinkText()
   {
	   return linktext.getText();
   }
   
   public String getWelcomeMsg()
   {
	   return WelcomeMsg.getText();
   }
   
   public String getTitle()
   {
	   return driver.getTitle();
   }
   
   public String btnalign()
   {
	return loginbtn.getCssValue("text-align");
   }
   
   
   public String btnheight()
   {
	return loginbtn.getCssValue("height");
   }
   
   
   public String btncolor()
   {
	return loginbtn.getCssValue("color");
   }
   
   
   public String btnwidth()
   {
	return loginbtn.getCssValue("width");
   }
   
   
   
   public HomePage login(String un,String pa)
   {
	   
	username.sendKeys(un);
	password.sendKeys(pa);
	loginbtn.click();
	
	if(Alert.isDisplayed())
	{
		Alert.click();
	}
	return new HomePage();
   }
}
