package com.RestDemos;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class D02GetListUsers {
  @Test
  public void getList() {
	  Response res = RestAssured.get("https://reqres.in/api/users?page=2");
	  
	  System.out.println("Session ID : " + res.sessionId());
	  System.out.println("Status Code: " + res.statusCode());
	  System.out.println("Status Line: " + res.statusLine());
	  System.out.println("Time taken : " + res.getTime());
	  System.out.println("Body       : " + res.getBody().asString());
	  
	  Assert.assertTrue(res.statusCode() == 200);
  }
}
