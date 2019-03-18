package leetCode;

import java.util.Set;
import java.util.TreeSet;

public class Leet112_A {
/*	Input: [3,2,1,2,1,7]
	Output: 6
	Explanation:  After 6 moves, the array could be [3, 4, 1, 2, 5, 7].
	It can be shown with 5 or less moves that it is impossible for the array to have all unique values.

*/	
    public static int minIncrementForUnique(int[] A) {
    	int result = 0;
    	Set<Integer> set = new TreeSet<Integer>();
    	Set<Integer> duplicatedSet = new TreeSet<Integer>();
    	
    	for (int i = 0; i < A.length; ++i) {
    		if (set.contains(A[i])) {
    			duplicatedSet.add(i);
    		} else {
    			set.add(A[i]);
    		}
    	}
    	
    	for (Integer dupIndex : duplicatedSet) {
    		while (set.contains(A[dupIndex])) {
    			++A[dupIndex];
    			++result;
    		}
    		set.add(A[dupIndex]);
    	}
        return result;
    }
    public static void main(String[] args) {
		int[] A = new int[]{3,2,1,2,1,7};
		System.out.println(minIncrementForUnique(A));
	}
}
