package serialization;
import java.util.ArrayList;

import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EmployeeSerialization {
	@Test(priority = 1)
	public void Createemployee() {
		ArrayList<String> courseslist = new ArrayList<String>();
		courseslist.add("Maths");
		courseslist.add("biology");
		
		Employee emp = new Employee();
		emp.setName("Rachael");
		emp.setLocation("LA");
		emp.setEmail("rfc@gmail.com");
		emp.setCourses(courseslist);
		
		given().contentType("application/json; charset=utf-8").body(emp)
		.when().post("http://localhost:3000/users")
		.then().statusCode(201).assertThat();//body("name[1]", equalTo("Rachael"));
		
	}
	
	@Test(priority = 2)
	public void getEmployee()
	{
		//Employee[] emp  = Employee.get("http://localhost:3000/users", Employee[].class);
		Employee emp = get("http://localhost:3000/users").as(Employee.class);
		System.out.println(emp.getname()+" "+ emp.getlocation()+ " "+ emp.getemail() + " " + emp.getcourses());
		
	}

}
