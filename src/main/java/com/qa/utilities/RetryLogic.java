package com.qa.utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer {
	

	public boolean retry(ITestResult result) 
	{
		int count=0; 
		int max=2; 
	
				if(count<max) 
				{ 
					count++; 
					return true; 
				} 
				return false; 
	} 

}
