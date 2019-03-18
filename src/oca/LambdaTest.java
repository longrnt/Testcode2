package oca;

import java.util.ArrayList;
import java.util.List;

public class LambdaTest {
	public static void main(String[] args) {
		List<String> bunnies = new ArrayList<String>();
		bunnies.add("abc");
		bunnies.add("def");
		bunnies.add("xyz");
		
		System.out.println(bunnies);
		bunnies.removeIf(s -> s.charAt(0) == 'a');
		System.out.println(bunnies);
	}
}
