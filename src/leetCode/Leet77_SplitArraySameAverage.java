package leetCode;
//false
public class Leet77_SplitArraySameAverage {
	public static void main(String[] args) {
//		int[] A = new int[]{1,2,3,4,5,6,7,8};
//		int[] A = new int[]{3,1};
//		int[] A = new int[]{1,3,2,2};
		int[] A = new int[]{1,4,5,8,2,3,6,7};
		System.out.println(splitArraySameAverage(A));
	}

	public static boolean splitArraySameAverage(int[] A) {

		// Find Aay sum
		int sum = 0;
		for (int i = 0; i < A.length; i++)
			sum += A[i];

		boolean found = false;
		int lsum = 0;
		for (int i = 0; i < A.length - 1; i++) {
			lsum += A[i];
			int rsum = sum - lsum;

			// If averages of A[0...i] and A[i+1..n-1]
			// are same. To avoid floating point problems
			// we compare "lsum*(n-i+1)" and "rsum*(i+1)"
			// instead of "lsum/(i+1)" and "rsum/(n-i+1)"
			if (lsum * (A.length - i - 1) == rsum * (i + 1)) {
				found = true;
			}
		}
		return found;
		
//		int i;
//		int sum = 0;
//		float avg;
//
//		/* Calculate avg of entire arr */
//		for (i = 0; i < A.length; i++)
//		    sum += A[i];
//
//		avg = (float)sum / A.length;
//		sum = 0;
//		boolean found = false;
//		/* Compute moving average. (N - 1) is *not* a typo - we want to stop before putting in the last element */
//		for (i = 0; i < A.length - 1; i++) {
//		    sum += A[i];
//		    if (avg == (float)sum / (i+1)) {
//		    	found = true;
//		    }
//		}
//		return found;
	}
}
