package leetCode;
//https://leetcode.com/contest/weekly-contest-82/problems/goat-latin/

public class leet82_A {
	public static void main(String[] args) {
		//Input: "I speak Goat Latin"
		//Imaa peaksmaaa oatGmaaaa atinLmaaaaa
		//Imaa peaksmaaa oatGmaaaa atinLmaaaaa

		String S = "The quick brown fox jumped over the lazy dog";
		//Input: "The quick brown fox jumped over the lazy dog"
		//heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa
		//heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa

		System.out.println(toGoatLatin(S));
			
	}
	
    public static String toGoatLatin(String S) {
        StringBuilder sb = new StringBuilder();
        String[] words = S.split(" ");
        
        int index = 1;
        for (String str : words) {
        	if (isVowel(str.charAt(0))) {
        		sb.append(str + "ma");
        	} else {
        		char firstLetter = str.charAt(0);
        		sb.append(str.substring(1) + firstLetter + "ma");
        	}
        	for (int i = 0; i < index; ++i) {
        		sb.append('a');
        	}
        	++index;
        	sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
    
	public static boolean isVowel(char c) {
		if (c == 'a' || c == 'e' || c == 'u' || c == 'i' || c == 'o'
				|| c == 'A' || c == 'E' || c == 'U' || c == 'I' || c == 'O') {
			return true;
		}
		return false;
	}
}
