package com.RestDemos;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class D05CheckID {
  @Test
  public void checkId() {
	  given().get("https://reqres.in/api/users/2")
	  .then().body("data.id", equalTo(2))
	  .log().all();
	  
	  given().get("https://reqres.in/api/users?page=2")
	  .then().body("data.id[0]", equalTo(7))
	  .log().all();
  }
}
