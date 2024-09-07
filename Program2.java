package Map_Interface;
import java.util.HashMap;
import java.util.Map;
public class Program2 {

	public static void main(String[] args)
	{
		 Map<String, String> m1 = new HashMap<String, String>(); //upcasting
		  m1.put("Student1", "Ram");
		  m1.put("Student2", "Priya");
		  m1.put("Student3", "Rohit");
		  m1.put("Student4", "Atul");
		  m1.put("Student5", "Harry");
		  System.out.println(m1);
	}
}
