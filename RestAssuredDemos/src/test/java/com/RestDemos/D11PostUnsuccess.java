package com.RestDemos;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

public class D11PostUnsuccess {
  @Test
  public void postUnsuccess() {
	  Map<Object, Object>data = new HashMap<>();
		data.put("email", "sydney@fife");
		
		JSONObject obj = new JSONObject(data);
		System.out.println();
		
		given()
			.body(obj.toJSONString())
		.when()
			.post("https://reqres.in/api/register")
		.then()
			.assertThat().statusCode(400)
			.assertThat().body("error", equalTo("Missing email or username"))
			.log().all();
	  	
  }
}
