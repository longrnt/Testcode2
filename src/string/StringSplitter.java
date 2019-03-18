package string;

import java.text.DecimalFormat;
import java.text.Format;

public class StringSplitter {
	public static void main(String[] args) {
		String before = "S-HT-0000001752 (Cloned)";
		int i = 0;
		while (before.charAt(i) != '(') {
			++i;
		}
		String clone = before.substring(i+1, i + 7);
		System.out.println(clone);

	}
	
	public static String splitString() {
		Format df = new DecimalFormat("0000000000");
		
		String before = "S-NI-0000001720";
		String[] strArray = before.split("-");
		
		long num = Long.parseLong(strArray[strArray.length - 1]);
//		System.out.println(strArray[strArray.length - 1]);
//		System.out.println(num);
//		System.out.println(df.format(num + 1));
		System.out.println(before);
		
		System.out.println(before.replace(strArray[strArray.length - 1], df.format(num + 1)));
		return null;
	}
}
