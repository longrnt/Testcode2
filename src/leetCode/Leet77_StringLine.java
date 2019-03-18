package leetCode;

import java.util.HashMap;
import java.util.Map;

public class Leet77_StringLine {
	public static void main(String[] args) {
//		String S = "abcdefghijklmnopqrstuvwxyz";
//		int[] widths = new int[]{10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10}; 
		
//		widths = [4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10]
//				S = "bbbcccdddaaa"
		
		String S = "bbbcccdddaaa";
		int[] widths = new int[]{4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10}; 

		int[] result = numberOfLines(widths, S);
		System.out.println(result[0] + " " + result[1]);
	}
	
    public static int[] numberOfLines(int[] widths, String S) {
    	int[] result = new int[2];
    	Map<Character, Integer> map = new HashMap<Character, Integer>();
    	for (int i = 0; i < widths.length; ++i) {
    		map.put((char)('a' + i), widths[i]);
    	}
    	int line = 0;
//    	int finalChars = 0;
    	int currentCharLine = 0; 
    	for (int i = 0; i < S.length(); ++i) {
    		currentCharLine += map.get(S.charAt(i));
//    		++finalChars;
    		
    		if (currentCharLine == 100) {
    			++line;
    			currentCharLine = 0;
    		} else if (currentCharLine > 100){
    			++line;
    			currentCharLine = map.get(S.charAt(i));
    		}
    	}
    	result[0] = line + 1;
    	result[1] = currentCharLine;
    	return result;
    }
}
