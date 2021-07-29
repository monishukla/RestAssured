package requests;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Putrequest {
	public static HashMap map = new HashMap();
	@BeforeClass
	public void postData()
	{
		map.put("name",RestUtils.getname());
		map.put("location",RestUtils.getLocation());
		map.put("email",RestUtils.getemail());
		map.put("email",RestUtils.getemail());
		map.put("courses",RestUtils.getCourse());
		
		RestAssured.baseURI = "http://localhost:3000/";
		RestAssured.basePath = "/users/2";
	}
	
	@Test
	public void testPut()
	{
		Response response = given()
		 .body(map)
		 .contentType("application/json; charset=utf-8")
		.when()
		  .put()
		.then()
		  .statusCode(200)
		  //.body(".name", hasItems("John", "Ritvick"))
		 // .body("name[0]",equalTo("John"))
		  		
		  .log().all()
		  .extract().response();
		
		String json = response.asString();
		Assert.assertEquals(json.contains("Ritvick"), true);
	}

}
