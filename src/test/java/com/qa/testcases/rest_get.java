package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class rest_get
{
	RequestSpecification httprequest=RestAssured.given();
	
	@BeforeMethod
	public void init()
	{
		 httprequest=RestAssured.given();
	}
	
	@Test(priority=1)
	public void testgetmethodwithcorrectcity()
	{
		//RestAssured.baseURI=;
		
		Response response=httprequest.request(Method.GET,"http://api.openweathermap.org/data/2.5/weather?q=Pune&APPID=9bac348a4d8a628034772a76de8d87ca");
		int code=response.getStatusCode();
		System.out.println("STATUS CODE :"+code);
		String line=response.getStatusLine();
		System.out.println("STATUS LINE :"+line);
		Assert.assertEquals(code, 200);
		String content=response.getHeader("Content-Type");
		//System.out.println("CONTENT TYPE IS : "+content);
		
		Headers headers=response.getHeaders();
		//System.out.println("HEADERS ARE : "+headers);
		
		ResponseBody body=response.getBody();
		System.out.println("BODY IS :"+body.asString());
		
		JsonPath jsonpath=response.jsonPath();
		//System.out.println("Wind Value is "+jsonpath.get("wind"));
		
		//Deserialization
		CustomerResponse cc=response.as(CustomerResponse.class);
		System.out.println("Base is :"+cc.base);
		//System.out.println("Coordinates are :"+cc.coord);
		System.out.println("ID is : "+cc.id);
		//System.out.println("Main :"+cc.main);
		//System.out.println("Weather :"+cc.weather);
		
	}
	
	//@Test(priority=2)
	public void testgetmethodwithincorrectcity()
	{
		//RestAssured.baseURI=;
		
		Response response=httprequest.request(Method.GET,"http://api.openweathermap.org/data/2.5/weather?q=test&APPID=9bac348a4d8a628034772a76de8d87ca");
		int code=response.getStatusCode();
		System.out.println("STATUS CODE :"+code);
		Assert.assertEquals(code, 404);
		String line=response.getStatusLine();
		System.out.println("STATUS LINE :"+line);
		
		String content=response.getHeader("Content-Type");
		System.out.println("CONTENT TYPE IS : "+content);
		
		Headers headers=response.getHeaders();
		System.out.println("HEADERS ARE : "+headers);
		
		ResponseBody body=response.getBody();
		System.out.println("BODY IS :"+body.asString());
		
	}


}
