package com.RestDemos;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class D10PostDemo1 {
  @Test
  public void addingRecord() {
	  Map<String, Object> data = new HashMap<>();
	  data.put("name", "Vibhavari");
	  data.put("job", "Tester");
	  
	  System.out.println(data);
	  
	  JSONObject jObj = new JSONObject(data);
	  System.out.println(jObj);
	  
	  given()
	  	.body(jObj.toJSONString())
	 .when()
	 	.post("https://reqres.in/api/users")
	 .then()
	 	.assertThat().statusCode(201)
	 	.log().all();
  }
}
