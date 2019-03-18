package leetCode;

import java.util.Arrays;

public class Leet113_A {
	
	public static void main(String[] args) {
//		String ans = "00:00";
//		System.out.println(compare(time1, ""));
		int[] A = new int[]{1,2,3,4};
//		System.out.println("" + A[0] + A[1] + A[2] + A[3]);
//		swap(A, 0, 1);
//		System.out.println("" + A[0] + A[1] + A[2] + A[3]);
//		
//	    int intArr[] = {1, 2, 3, 4};
		System.out.println(largestTimeFromDigits(A));
	}
	/*
Example 1:
Input: [1,2,3,4]
Output: "23:41"

Example 2:
Input: [5,5,5,5]
Output: ""
	 */
	public static boolean valid(int h1, int h2, int m1, int m2) {
		return (h1*10 + h2) <= 23 && m1*10 + m2 <= 59;
	}
	public static int compare(int[] A, int[] B) {
		int h1 = A[0]*10 + A[1];
		int m1 = A[2]*10 + A[3];
		
		int h2 = B[0]*10 + B[1];
		int m2 = B[2]*10 + B[3];
		
		if (h1 > h2) {
			return 1;
		} else if (h1 < h2) {
			return -1;
		} else {
			if (m1 > m2) {
				return 1;
			} else if (m1 < m2) {
				return -1;
			} else {
				return 0;
			}
		}
	}
	public static int compare(String time1, String time2) {
		int h1 = Integer.parseInt(time1.substring(0, 2));
		int m1 = Integer.parseInt(time1.substring(3, 5));
		
		int h2 = Integer.parseInt(time2.substring(0, 2));
		int m2 = Integer.parseInt(time2.substring(3, 5));
		
		if (h1 > h2) {
			return 1;
		} else if (h1 < h2) {
			return -1;
		} else {
			if (m1 > m2) {
				return 1;
			} else if (m1 < m2) {
				return -1;
			} else {
				return 0;
			}
		}
	}
	public static void swap(int[] A, int index1, int index2) {
		int temp = A[index1];
		A[index1] = A[index2];
		A[index2] = temp;
	}
	public static void getTime(int[] A, String ans) {
		if (valid(A[0], A[1], A[2], A[3])) {
    		String time = A[0] + A[1] + ":" + A[2] + A[3];
    		if (compare(time, ans) == 1)
    			ans = time; 
    	}
	}
	
	public static void permute(int[] A, int start) {
//		String ans = "00:00";
	    for(int i = start; i < A.length; i++){
	        int temp = A[start];
	        A[start] = A[i];
	        A[i] = temp;
	        permute(A, start + 1);
	        A[i] = A[start];
	        A[start] = temp;
	    }
	    if (start == A.length - 1) {
	        System.out.println(Arrays.toString(A));
//			if (valid(A[0], A[1], A[2], A[3])) {
//	    		String time = "" + A[0] + A[1] + ":" + A[2] + A[3];
//	    		if (compare(A, cache) == 1)
//	    			cache = Arrays.copyOf(A, 4); 
//	    	}
	    }
	}
	
    public static String largestTimeFromDigits(int[] A) {
    	int[] ans = new int[4];
    	permute(A, 0);
        return "" + ans[0] + ans[1] + ":" + ans[2] + ans[3];
    }
}
