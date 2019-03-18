package leetCode;

public class Leet84_A {
	public static void main(String[] args) {
		//Input: [[1,1,0],[1,0,1],[0,0,0]]
		//Output: [[1,0,0],[0,1,0],[1,1,1]]
//		int[][] A = new int[][]{{1,1,0},{1,0,1},{0,0,0}};
		
		/*
		 * Input: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
		 * Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
		 */
		int[][] A = new int[][]{{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
		int[][] result = flipAndInvertImage(A);
		print(result);
	}
	
    public static int[][] flipAndInvertImage(int[][] A) {
        int[][] result = new int[A.length][A[0].length];
        
        for (int i = 0; i < A.length; ++i) {
        	int rowlen = A[0].length;
        	for (int j = 0; j < A[0].length; ++j) {
        		result[i][j] = A[i][rowlen - 1 - j];
        		result[i][j] ^= 1; 
        	}
        }
        return result;
    }
    
    public static void print(int[][] A) {
    	for (int i = 0; i < A.length; ++i) {
        	for (int j = 0; j < A[0].length; ++j) {
        		System.out.print( A[i][j] + " ");
        	}
        	System.out.println();
    	}
    }
}
