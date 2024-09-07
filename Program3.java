package Map_Interface;
import java.util.HashMap;
import java.util.Map;
public class Program3 {

	public static void main(String[] args) 
	{
		Map<String, Integer> m1 = new HashMap<String, Integer>(); 
		m1.put("Rice", 50);
		m1.put("Sugar", 5);
		m1.put("oil", 5);
		m1.put("Salt", 1);
		m1.put("Jeggary", 2);
		System.out.println(m1);
		boolean b1 = m1.containsKey("Rice");
		System.out.println(b1);
		boolean b2 = m1.containsValue(60.5);
		System.out.println(b2);
		
		Map<String, Integer> m2 = new HashMap<String, Integer>(); 
		m2.putAll(m1);
		m2.put("Toothpaste", 5);
		System.out.println(m2);
		
		boolean b3 = m1.equals(m2);
		System.out.println(b3);
		if(m1.size()==m2.size())
		{
			System.out.println("Size of both are same");
		}
		else
		{
			System.out.println("Size of both are not same");
		}	
	}
}
