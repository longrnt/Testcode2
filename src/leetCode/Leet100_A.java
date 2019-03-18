package leetCode;

//https://leetcode.com/contest/weekly-contest-100/problems/monotonic-Aay
public class Leet100_A {
	public static void main(String[] args) {
		int[] A = new int[]{1,1,2,0,-3,5,5};
		
		System.out.println(isMonotonic(A));
	}
	
    public static boolean isMonotonic(int[] A) {
        if(A.length <= 2){
            return true;
        }
        boolean increasing = true;
        boolean decreasing = true;
        for(int i=1;i<A.length;i++){
            if(A[i-1] > A[i]){
                increasing = false;
            }else if(A[i-1] < A[i]){
                decreasing = false;
            }
            if(!increasing && !decreasing){
                return false;
            }
        }
        return true;
    }
}
