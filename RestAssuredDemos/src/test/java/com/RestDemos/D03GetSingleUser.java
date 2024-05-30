package com.RestDemos;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class D03GetSingleUser {
  @Test
  public void getSingleUser() {
	  given().get("https://reqres.in/api/users/2")
	  .then().statusCode(200);
	  
  }
}