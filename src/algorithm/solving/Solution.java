package algorithm.solving;

public class Solution {
	public static void main(String[] args) {
		int[] A = new int[6];
		A[0] = 1;
		A[1] = -2;
		A[2] = -5;
		A[3] = -1;
		A[4] = -1;
		A[5] = -2;
		System.out.println(solution(A));
	}

	public static int solution(int[] A) {
		int result = 0;
		result += A[0] + A[A.length - 1];

		int maxNegative = -Integer.MAX_VALUE;
		for (int i = 1; i < A.length - 1; ++i) {
			if (A[i] >= 0) {
				result += A[i];
			}
		}
		return result;
	}
}
