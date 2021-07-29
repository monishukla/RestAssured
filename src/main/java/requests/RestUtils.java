package requests;

import java.util.ArrayList;
import java.util.List;

public class RestUtils {
	public static String getname()
	{
		String name = "Ritvick";
		return name;
	}
	
	public static String getLocation()
	{
		String location = "Kanpur";
		return location;
	}
	
	public static String getemail()
	{
		String email = "abef@gmail.com";
		return email;
	}
	
	public static List<String> getCourse()
	{
		List<String> list = new ArrayList<String>();
		list.add("Chemistry");
		list.add("Physics");
		return list;
	}

}
