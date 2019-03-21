package com.qa.basetest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public static WebDriver driver; 
	public static Properties prop; 

	public TestBase() 
		{	 
			prop=WebDriverFactory.initializeConfig();
	 	} 
	
	public void initialize()
	{
		driver = Driver.getCurrentDriver(driver);
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Constants.implicitWaitTime,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Constants.pageLoadWaitTime, TimeUnit.SECONDS);
	}

}
