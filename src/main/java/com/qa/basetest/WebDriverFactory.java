package com.qa.basetest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverFactory {


	static Properties prop;
	
	// Returns desired webdriver instance 
	public static WebDriver createWebdriver(WebDriver driver) {
		
	    String browser=prop.getProperty("browser");
		if(browser.contains("chrome")) 
		{ 
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
			driver= new ChromeDriver(); 
			 
		} 
		else if(browser.contains("firefox")) 
		{ 
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Drivers/geckodriver.exe");
			driver= new FirefoxDriver(); 
		}
		
		else if(browser.contains("Edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\SAHIL\\eclipse-workspace\\BlueOptima_Project1\\Drivers\\MicrosoftWebDriver.exe");
			driver= new EdgeDriver();
			
		}
		return driver; 
		
	}
	
	// Initializes Config.properties File
	public static Properties initializeConfig()
	{
		try 
		{ 
			FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"/config/config.properties"); 
			prop=new Properties(); 
			prop.load(file); 
		} 
		catch(IOException e) 
		{ 
			e.printStackTrace(); 
		} 
		 
		return prop;
	}

}
