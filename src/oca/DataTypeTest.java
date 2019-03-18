package oca;

import java.util.ArrayList;
import java.util.List;

public class DataTypeTest {
	public static void main(String[] args) {
//		Boolean b = new Boolean(null);
//		System.out.println(b);
		
		List<String> names = new ArrayList<>();
		names.add("Bob");
		names.add("bran");
		names.add("nick");
		names.add("bran");
		
		if (names.remove("bran")) {
			names.remove("abc");
		}
		System.out.println(names);
	}
}
