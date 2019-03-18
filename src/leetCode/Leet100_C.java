package leetCode;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/contest/weekly-contest-100/problems/bitwise-ors-of-subarrays/
public class Leet100_C {
	public static void main(String[] args) {
		int[] A = new int[]{1,2,5};
		System.out.println(subarrayBitwiseORs(A));
	}
	
    public static int subarrayBitwiseORs(int[] A) {
        Set<Integer> set = new HashSet<Integer>();
        int i = 1;
        
        int[] B = A.clone();
        while (i <= A.length) {
        	set.add(A[i-1]);
        	int index = 0;
        	for (int j = i; j < A.length; ++j) {
        		B[index] |= A[j];
        		set.add(B[index++]);
        	}
        	++i;
        }
        return set.size();
    }
}
