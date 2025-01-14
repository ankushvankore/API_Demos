package com.RestDemos;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class D07MultipleTests {
  @Test
  public void multipleTests() {
	  given().get("https://reqres.in/api/users?page=2")
	  .then().body("data.id[0]", equalTo(7))
	  .body("data.first_name[0]", equalTo("ichael"))
	  .log().all();
	  
	  given().get("https://reqres.in/api/users?page=2")
	  .then().body("data.id[0]", equalTo(7))
	  .body("data.first_name[2]", equalTo("Tobias"))
	  .log().all();
  }
}
