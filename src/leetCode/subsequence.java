package leetCode;

//result: TLE

public class subsequence {
	public static void main(String[] args) {
		String S = "abcde";
		String[] words = new String[]{"a", "bb", "acd", "ace"};
		System.out.println(numMatchingSubseq(S, words));
	}

    public static int numMatchingSubseq(String S, String[] words) {
        int res = 0;
        for (int i = 0; i < words.length; ++i) {
        	if (isSubSequence(words[i], S, words[i].length(), S.length())) {
        		++res;
        	}
        }
        return res;
    }
	
	static boolean isSubSequence(String str1, String str2, int m, int n) {
        int j = 0;
    
        if (m > n) {
        	return false;
        }
        // Traverse str2 and str1, and compare current character 
        // of str2 with first unmatched char of str1, if matched 
        // then move ahead in str1
        for (int i=0; i<n&&j<m; i++)
            if (str1.charAt(j) == str2.charAt(i))
                j++;
 
        // If all characters of str1 were found in str2
        return (j==m); 
	}
}
