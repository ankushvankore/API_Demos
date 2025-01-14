package com.RestDemos;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class D03Get2 {
	@Test
	public void getSingleUser()
	{
		given().get("https://reqres.in/api/users/2")
		.then()
		.statusCode(200).log().all();
		
		Assert.assertEquals(200, 200, "Status code is not matching");
	}
}
