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
public class Deleterequest {
	@Test
	public void Deletedata()
	{
		RestAssured.baseURI = "http://localhost:3000/";
		RestAssured.basePath = "/users/3";
		
		given().when().delete().then().statusCode(200);
	}

}
