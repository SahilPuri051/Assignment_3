package com.qa.utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qa.basetest.*;;

public class CustomListeners extends TestBase implements ITestListener {


	public void onTestStart(ITestResult result) {
	
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getMethod().getMethodName()+" Pass ******");
		GetScreenshot.getshot(result,"PASS");
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println(result.getMethod().getMethodName()+" Fail ******");
		GetScreenshot.getshot(result,"FAIL");
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
