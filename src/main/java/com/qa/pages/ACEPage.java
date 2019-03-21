package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.basetest.TestBase;

public class ACEPage extends TestBase {

	JavascriptExecutor je;
	public ACEPage()
	{
		je=(JavascriptExecutor)driver;
		PageFactory.initElements(driver,this);
	}
	
	// Page Factory (Object Repository)
	
	@FindBy(xpath="//a[@data-target='developers']")
	WebElement developersbtn;
	
	@FindBy(xpath="//iframe[contains(@export-big-data,'exportBigData')]")
	WebElement bigFrame;
	
	@FindBy(xpath="//*[name()='g'][contains(@class,'highcharts-button ')]")
	WebElement contextMenu;
	
	@FindBy(xpath="//div[text()='Download PNG image']")
	WebElement downloadPng;
	
	@FindBy(xpath="//div[@id='chart']")
	WebElement Chart;
	
	public void clickonDev()
	{
		developersbtn.click();
	}
	
	public void enterFrame(int num)
	{
		driver.switchTo().frame(num);
		Chart.click();
	}
	
	public void exitFrame()
	{
		driver.switchTo().defaultContent();
	}
	
	public void enterBigFrameAndClickMenu()  throws InterruptedException
	{ 
		je.executeScript("window.scrollBy(0,700)");
		driver.switchTo().frame(bigFrame);
		Thread.sleep(2000);
		contextMenu.click();
	}
	
	public void downloadPng() {
		downloadPng.click();
	}



	

	
}
