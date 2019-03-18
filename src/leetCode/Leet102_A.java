package leetCode;

//https://leetcode.com/contest/weekly-contest-102/problems/sort-array-by-parity/

public class Leet102_A {
	public static void main(String[] args) {
		int[] A = new int[]{3,1,2,4,5,6,7};
		int[] result = sortArrayByParity(A);
		
		for (int i = 0; i < result.length; ++i) {
			System.out.print(result[i] + " ");
		}
	}
    public static int[] sortArrayByParity(int[] A) {
        int[] odd = new int[A.length];
        int[] result = new int[A.length];

        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < A.length; ++i) {
        	if (A[i] % 2 == 0) {
        		result[evenCount++] = A[i];
        	} else {
        		odd[oddCount++] = A[i];
        	}
        }
        int count = 0;
        for (int i = evenCount; i < A.length; ++i) {
        	result[i] = odd[count++];
        }
        return result;
        
    }
}
