package com.qa.testcases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.basetest.BaseTest;
import com.qa.pages.Loginpage1;
import com.qa.pages.Loginpage2;
import com.qa.utilities.TestUtilData;

public class LoginPage2Test extends BaseTest {

	Loginpage1 login1;
	Loginpage2 login2;
	
	public LoginPage2Test()
	{
		super();
	}
	
	@BeforeMethod
	public void init() 
	{
		initialize();
		login1=new Loginpage1();
		login2=login1.clickSign();
		log.debug("Sign in button is clicked");
	}
	
	@DataProvider
	public Object[][] getdata() throws EncryptedDocumentException, FileNotFoundException, IOException
	{
		Object[][] data=TestUtilData.getTestData();
		return data;
	}
	@Test(dataProvider="getdata")
	public void test2(String un,String pa)
	{
		login2.signindetails(un,pa);
		log.debug("Details are entered in Username and password");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		log.debug("*********PASS****************");
	}
}
