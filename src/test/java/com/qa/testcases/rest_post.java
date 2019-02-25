package com.qa.testcases;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class rest_post {
	RequestSpecification httprequest;
	
	@Test
	public void createPost()
	{
		RestAssured.baseURI="https://reqres.in";
		httprequest=RestAssured.given();
		httprequest.header("Content=Type","application/json");
		org.json.simple.JSONObject rjson=new org.json.simple.JSONObject();
		rjson.put("name", "morpheus");
		rjson.put("job","leader");
		//rjson.put("Email", "sahil.puri051@gmail.com");
	
		
		httprequest.body(rjson.toJSONString());
		Response response=httprequest.request(Method.POST,"/api/users");
		
		String responsebody=response.body().asString();
		System.out.println(responsebody);
		
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		
		Headers headers=response.getHeaders();
		System.out.println("Headers are : "+headers);
		
		JsonPath jpath=response.jsonPath();
		String created_id=jpath.get("id");
		System.out.println("Created ID : "+created_id);
		System.out.println("--------------------------------------------------");
		getcall(created_id);
	}
	
	public void getcall(String cid)
	{
		RestAssured.baseURI="https://reqres.in";
		httprequest=RestAssured.given();
		Response response=httprequest.get("/api/users/2");
		String body=response.body().asString();
		System.out.println("Body is : "+body);
		Headers headers=response.getHeaders();
		System.out.println("Headers are : "+headers);
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
	}
}
