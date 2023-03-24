package testcases;

import org.testng.Assert;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class API_TEST {

//	@Test
//	public void getRequest() {
//
//		given().get("https://reqres.in/api/users?page=2").then().statusCode(200)
//				.body("data[2].first_name", equalTo("Tobias"))
//				.body("data.first_name", hasItems("Michael", "Lindsay", "Tobias", "Byron"));
//
//	}
//
//	@Test
//	public void postRequest() {
//
//		JSONObject payload = new JSONObject();
//		payload.put("name", "chinmay");
//		payload.put("job", "leader");
//		System.out.println(payload.toJSONString());
//
//		given().body(payload.toJSONString()).when().post("https://reqres.in/api/users").then().statusCode(201).log()
//				.all();
//
//	}
//
//	@Test
//	public void putRequest() {
//
//		JSONObject payload = new JSONObject();
//		payload.put("name", "chinmay");
//		payload.put("job", "leader");
//		System.out.println(payload.toJSONString());
//
//		given().body(payload.toJSONString()).when().put("https://reqres.in/api/users/2").then().statusCode(200).log()
//				.all();
//
//	}
//
//	@Test
//	public void deleteRequest() {
//		given().delete("https://reqres.in/api/users/2").then().statusCode(204);
//
//	}
	
	@Test(enabled = true)
	public void goRestCreateUser() {
		
		JSONObject payload = new JSONObject();
		payload.put("name", "chinmay deshpande");
		payload.put("gender", "male");
		payload.put("email", "chinmaydeshpandej010@gmail.com");
		payload.put("status", "active");
		
		given()
		.header("Authorization","Bearer cd2ac6be51d3e141feb492b0cc0ddd8d3eb8d0bc7da80d1a1ef57ecdd74bf517")
		.accept(ContentType.JSON)
		.contentType("application/json")
		.body(payload.toString())
		.post("https://gorest.co.in/public/v2/users").then()
		.statusCode(201).log().all();
		
		
		// TDD vs BDD
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
