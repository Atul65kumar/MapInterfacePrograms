package Map_Interface;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
public class Program5 {

	public static void main(String[] args)
	{
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		m1.put("Mohan", 93);
		m1.put("Sham", 85);
		m1.put("Vinod", 74);
		m1.put("Hari", 90);
		System.out.println(m1);
		
		/*m1.remove("Vinod");
		System.out.println(m1);
		
		m1.remove("Hari", 90);
		System.out.println(m1); */
		
		m1.replace("Hari", 84);
		System.out.println(m1);
		
		m1.replace("Vinod", 74, 79);
		System.out.println(m1);
		
		Map<String, Integer> m2 = new HashMap<String, Integer>();
		m2.put("Swati", 88);
		m2.put("Pradeep", 85);
		m2.put("Priya", 87);
		m2.put("Anusha", 95);
				
		
		
	}

}
