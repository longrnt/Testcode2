package leetCode;

import java.util.Arrays;

public class leet93_B_reordered_power_of_2_reference {
	
	public static void main(String[] args) {
		int N = 46;
		System.out.println(reorderedPowerOf2(N));
	}
	
	public static boolean reorderedPowerOf2(int N) {
		int[] A = count(N);
		for (int i = 0; i < 31; ++i) {
			if (Arrays.equals(A, count(1 << i))) {
				return true;
			}
		}
		return false;
    }

    // Returns the count of digits of N
    // Eg. N = 112223334, returns [0,2,3,3,1,0,0,0,0,0]
    public static int[] count(int N) {
    	int[] ans = new int[10];
    	
    	while (N > 0) {
    		ans[N % 10]++;
    		N /= 10;
    	}
    	return ans;
    }
}
