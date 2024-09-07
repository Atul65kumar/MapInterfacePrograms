package Map_Interface;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class Program6 {

	public static void main(String[] args)
	{
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		m1.put("Mohan", 93);
		m1.put("Sham", 85);
		m1.put("Vinod", 74);
		m1.put("Hari", 90);
		System.out.println(m1);
		
		Set<String> s1 = m1.keySet();
		System.out.println(s1);
		
		for(String s2 : m1.keySet())
		{
			System.out.println(s2);
		}
		//m1.values();
		for(Integer i1 : m1.values())
		{
			System.out.println(i1);
		}
		for(Entry<String, Integer> e1 :m1.entrySet())
		{
			System.out.println(e1);
		}
		System.out.println("---------------");
		Iterator<Entry<String, Integer>> i2 = m1.entrySet().iterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}	
	}
}
