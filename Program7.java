package Map_Interface;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class Program7 {

	public static void main(String[] args)
	{
		Map<Integer, Double> m1 = new HashMap<Integer, Double>();
		m1.put(786, 90000.54);
		m1.put(453, 876854.544);
		m1.put(986, 123454.454);
		m1.put(765, 76854.544);
		
		for(Integer i1:m1.keySet())
		{
			System.out.println("Employee Id:" +i1);
		}
		System.out.println("-------------");
		for( Double i2:m1.values())
		{
			System.out.println("Salaries:" +i2);
		}
		System.out.println("-------------");
		//Set<Entry<Integer, Double>> e1 = m1.entrySet();
		for(Entry<Integer, Double> e1 : m1.entrySet() )
		{
			System.out.println("Employee Id and Salary:" +e1);
		}
		System.out.println("-------------");
		Iterator<Entry<Integer, Double>> i1 = m1.entrySet().iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
	}

}
