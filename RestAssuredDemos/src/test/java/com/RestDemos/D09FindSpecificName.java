package com.RestDemos;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class D09FindSpecificName {
  @Test
  public void searchSpecificName() {
	
	given().get("https://reqres.in/api/users?page=2")
	.then()
	.assertThat().statusCode(200)
	.assertThat().body("data.id[2]", equalTo(9))
	.assertThat().body("data.first_name", hasItems("Tobias"))
	.log().all();
  }
}
