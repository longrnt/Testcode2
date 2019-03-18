package leetCode;

//https://leetcode.com/contest/weekly-contest-74/problems/number-of-subarrays-with-bounded-maximum/
//accepted
class Solution {
	public static void main(String[] args) {
		int[] A = new int[] { 2, 1, 4, 3 };
		int L = 2;
		int K = 3;
		System.out.println(numSubarrayBoundedMax(A, L, K));
	}

	public static int countSub(int n) {
		return n * (n + 1) / 2;
	}

	public static int numSubarrayBoundedMax(int[] A, int L, int R) {

		int result = 0, exc = 0, inc = 0;

		for (int i = 0; i < A.length; i++) {
			if (A[i] > R) {
				result += (countSub(inc) - countSub(exc));
				inc = 0;
				exc = 0;
			} else if (A[i] < L) {
				exc++;
				inc++;
			} else {
				result -= countSub(exc);
				exc = 0;
				inc++;
			}
		}
		result += (countSub(inc) - countSub(exc));

		return result;
	}
}