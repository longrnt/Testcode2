package leetCode;

/*
https://leetcode.com/contest/weekly-contest-76/problems/similar-rgb-color/
 */
public class Leet76_RGB_Similarity {
	public static void main(String[] args) {
		String color = "#09f166";
		System.out.println(similarRGB(color));
	}
	
    public static String similarRGB(String color) {
    	StringBuilder sb = new StringBuilder();
    	sb.append('#');
    	
    	String subColor = color.substring(1, 3);
    	sb.append(findNextHexa(Integer.parseInt(subColor, 16)));

    	subColor = color.substring(3, 5);
    	sb.append(findNextHexa(Integer.parseInt(subColor, 16)));

    	subColor = color.substring(5, 7);
    	sb.append(findNextHexa(Integer.parseInt(subColor, 16)));

		return sb.toString();
    }
    
    public static String findNextHexa(int n) {
    	String[] group = new String[]{"00", "11", "22", "33", "44", "55", "66", "77", "88", "99", "aa", "bb", "cc", "dd", "ee", "ff"};
    	String maxHex = "";
    	int minInt = Integer.MAX_VALUE;
    	
    	for (int i = 0; i < group.length; ++i) {
    		int hexInt = Math.abs(n - Integer.parseInt(group[i], 16));
    		if (minInt > hexInt) {
    			minInt = hexInt;
    			maxHex = group[i];
    		}
    	}
    	return maxHex;
    }
}
