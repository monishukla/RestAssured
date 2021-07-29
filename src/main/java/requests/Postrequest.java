package requests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Postrequest {
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
		RestAssured.basePath = "/users";
	}
	
	@Test
	public void testPost()
	{
		Response response =  given()
		 .body(map)
		 .contentType("application/json; charset=utf-8")
		.when()
		  .post()
		.then()
		  .statusCode(201)
		  //.and()
		  //.body("[2].name", equalTo("Manisha"));
		  .log().all()
		  .extract().response();
		  
		
	}

}
