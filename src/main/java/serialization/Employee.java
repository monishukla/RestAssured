package serialization;

import java.io.Serializable;
import java.util.List;

public class Employee implements Serializable {
	public String name;
	public String location;
    public String email;
    List<String> courses;
    
    public String getname() {
    	return name;
    }
    
    public String getlocation()
    {
    	return location;
    }
    
    public String getemail() {
    	return email;
    }
    
    public List<String> getcourses()
    {
    	return courses;
    }
    
    public void setCourses(List<String> courses) {
    	this.courses = courses;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public void setLocation(String location) {
    	this.location = location;
    }
    
    public void setEmail(String email) {
    	this.email = email;
    }
 
}
