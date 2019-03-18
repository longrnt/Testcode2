package leetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Leet77_MorseWords {
	public static void main(String[] args) {
		String[] words = new String[]{"gin", "zen", "gig", "msg"};
		System.out.println(uniqueMorseRepresentations(words));
		
	}
	
    public static int uniqueMorseRepresentations(String[] words) {
    	String[] morses = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    	Map<Character, String> map = new HashMap<Character, String>();
    	for (int i = 0; i < morses.length; ++i) {
    		map.put((char)('a' + i), morses[i]);
    	}
    	Set<String> set = new TreeSet<String>();
    	for (int i = 0; i < words.length; ++i) {
    		StringBuilder sb = new StringBuilder();
    		for (int j = 0; j < words[i].length(); ++j) {
    			sb.append(map.get(words[i].charAt(j)));
    		}
    		set.add(sb.toString());
    	}
    	return set.size();
    }
}
