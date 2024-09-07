package Map_Interface;

import java.util.HashMap;
import java.util.Map;

public class Program4 {

	public static void main(String[] args) {
		Map<String, Integer> m1 = new HashMap<String, Integer>(); 
		m1.put("Rice", 50);
		m1.put("Sugar", 5);
		m1.put("old", 5);
		m1.put("Salt", 1);
		m1.put("Jeggary", 2);
		System.out.println(m1);
		m1.clear();
		System.out.println(m1);
		boolean b1 = m1.isEmpty();
		System.out.println(b1);
	}
}
