package requests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

public class Getrequest {
	
  
	@Test
	public void request()
	{
		Response response = given()
		.when()
		   .get("http://localhost:3000/users")
		.then()
		   .statusCode(200)
		   .body("[0].name",equalTo("John"))
		   .assertThat().body("name[0]", equalTo("John"))
		   .header("Content-Type","application/json; charset=utf-8")
		   .log().all() //it will extract the data and print in the console
		   .extract().response();
		  
		String json = response.asString();
		Assert.assertEquals(json.contains("Ritvick"), true);
		
	}
}
