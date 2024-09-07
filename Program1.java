package Map_Interface;

import java.util.HashMap;
import java.util.Map;

public class Program1 {

	public static void main(String[] args) {
		 Map m1 = new HashMap(); //upcasting
		  m1.put("Student1", "Ram");
		  m1.put("Student2", "Priya");
		  m1.put("Student3", "Rohit");
		  m1.put("Student4", "Atul");
		  m1.put("Student5", "Harry");
		  System.out.println(m1);
	}
}
