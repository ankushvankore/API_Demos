package com.RestDemos;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class D13DeleteDemo {
  @Test
  public void deleteRequest() {
	  given()
	  	.delete("https://reqres.in/api/users/2")
	  .then()
	  	.assertThat().statusCode(204);
  }
}
