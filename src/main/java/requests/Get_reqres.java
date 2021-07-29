package requests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Get_reqres {
	@Test
	public void request()
	{
		Response response = given()
		.when()
		   .get("https://reqres.in/api/users/2")
		.then()
		   .statusCode(200)
		   .body("data.first_name",equalTo("Janet"))
		   .assertThat().body("data.first_name", equalTo("Janet"))
		   .header("Content-Type","application/json; charset=utf-8")
		  .log().all() //it will extract the data and print in the console
		  .extract().response();
		  
		//String json = response.asString();
		//Assert.assertEquals(json.contains("Ritvick"), true);
		
	}

}
