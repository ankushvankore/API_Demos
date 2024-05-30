package com.RestDemos;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class D01FirstTest {
  @Test
  public void test1() {
	  Response res = RestAssured.get("https://www.google.com");
	  int sCode = res.getStatusCode();
	  System.out.println("Status Code: " + sCode);
	  
	  Assert.assertEquals(sCode, 200);
	  System.out.println("Status code matching!!!");
  }
}
