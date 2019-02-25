package com.qa.basetest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	
	public static WebDriver driver;
	public static Properties config;
	public static FileInputStream fis;
	public static Logger log;
	public BaseTest()
	{
		log = Logger.getLogger("devpinoyLogger");
		config=new Properties();
		try {
			fis=new FileInputStream("C:\\Users\\SAHIL\\eclipse-workspace\\February2019_Project\\src\\main\\java\\com\\qa\\properties\\config.properties");
		} catch (FileNotFoundException e) {
	
			e.printStackTrace();
		}
		try {
			config.load(fis);
		} catch (IOException e) {
	
			e.printStackTrace();
		}
	}
	
	public void initialize()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Python 3.6\\chromedriver.exe");
		driver=new ChromeDriver();
		log.debug("Browser launched");
		driver.get(config.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		log.debug("URL opened");
	}

}
