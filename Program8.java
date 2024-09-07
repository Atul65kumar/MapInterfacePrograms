package Map_Interface;
import java.util.HashMap;
import java.util.Map;
public class Program8 {

	public static void main(String[] args) {
		Map<Integer, Double> m1 = new HashMap<Integer, Double>();
		m1.put(786, 90000.54);
		m1.put(453, 876854.544);
		m1.put(986, 123454.454);
		m1.put(765, 76854.544);
		System.out.println(m1);
		
		m1.putIfAbsent(98787, 657654.87);
		System.out.println(m1);
	}
}
