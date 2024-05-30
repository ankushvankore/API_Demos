package com.RestDemos;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;
public class D06CheckFirstName {
	
	@Test
	public void checkFirstName()
	{
		given().get("https://reqres.in/api/users/2")
		  .then().body("data.first_name", equalTo("Janet"))
		  .log().all();
	}

}
