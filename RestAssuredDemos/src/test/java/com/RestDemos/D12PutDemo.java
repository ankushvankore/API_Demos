package com.RestDemos;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;

public class D12PutDemo {
  @Test
  public void putDemo() {
	  Map<Object, Object>data = new HashMap<>();
		data.put("name", "morpheus");
		data.put("job", "zion resident");
		
		JSONObject obj = new JSONObject(data);
		System.out.println();
		
		given()
			.body(obj.toJSONString())
		.when()
			.put("https://reqres.in/api/users/2")
		.then()
			.assertThat().statusCode(200)
			//.assertThat().body("name", equalTo("morpheus"))
			.log().all();
  }
}
