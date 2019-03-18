package Collections;

import java.util.HashMap;
import java.util.Map;

public class testHashMap {
	public static void main(String[] args) {
		Map<String,Double> map = new HashMap<String,Double>();
		map.put("FAST", 1.23);
		
		System.out.println(map.get("FAST"));
		System.out.println(map.get("SLOW_A"));
	}
}
