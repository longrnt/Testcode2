package leetCode.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
https://leetcode.com/problems/k-diff-pairs-in-an-array/description/
 */
public class DifferentK {
	public static void main(String[] args) {
		//[3, 1, 4, 1, 5], k = 0
		int[] nums = new int[]{1, 3, 1, 5, 4};
		int k = 0;//1
		
		//[1,1,1,1,1] k = 0
//		int[] nums = new int[]{1,1,1,1,1,2,2,2};
//		int k = 0;//2
		
		//1,2,3,4,5
//		int[] nums = new int[]{1,2,3,4,5};
//		int k = 2;//3
		
		//[3, 1, 4, 1, 5], k = 2
//		int[] nums = new int[]{3, 1, 4, 1, 5};
//		int k = 2;//2
		
//		[1,2,3,4,5] k = 1
//		int[] nums = new int[]{1,2,3,4,5};
//		int k = 1;//4
		
//		[6,3,5,7,2,3,3,8,2,4] k = 2
//		int[] nums = new int[]{6,3,5,7,2,3,3,8,2,4};
//		int k = 2;//5

		//[2,9,0,8,9,6,5,9,8,1,9,6,9,2,8,8,7,5,7,8,8,3,7,4,1,1,6,2,9,9,3,9,2,4,6,5,6,5,1,5,9,9,8,1,4,3,2,8,5,3,5,4,5,7,0,0,7,6,4,7,2,4,9,3,6,6,5,0,0,0,8,9,9,6,5,4,6,2,1,3,2,5,0,1,4,2,6,9,5,4,9,6,0,8,3,8,0,0,2,1]
			//k =	1
//		int[] nums = new int[]{2,9,0,8,9,6,5,9,8,1,9,6,9,2,8,8,7,5,7,8,8,3,7,4,1,1,6,2,9,9,3,9,2,4,6,5,6,5,1,5,9,9,8,1,4,3,2,8,5,3,5,4,5,7,0,0,7,6,4,7,2,4,9,3,6,6,5,0,0,0,8,9,9,6,5,4,6,2,1,3,2,5,0,1,4,2,6,9,5,4,9,6,0,8,3,8,0,0,2,1};
//		int k = 1;//9
		
		
//		[-1,-2,-3] k = 1
//		int[] nums = new int[]{-1,-2,-3};
//		int k = 1;//2
		
//		[1,2,3,4,5] k = -1
//		int[] nums = new int[]{1,2,3,4,5};
//		int k = -1;//0
		
		System.out.println(findPairs(nums, k));
		
	}
    public static int findPairs(int[] nums, int k) {
        int result = 0;
        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        

        if (k > 0) {
        	for (int i = 0; i < nums.length; ++i) {
        		map.put(nums[i], new ArrayList<Integer>());
        	}
        	for (int i = 0; i < nums.length; ++i) {
        		if (map.containsKey(nums[i] - k)) {
        			if (!map.get(nums[i] - k).contains(nums[i]) && !map.get(nums[i]).contains(nums[i] - k)) {
        				++result;
        				map.get(nums[i]).add(nums[i] - k);
        				map.get(nums[i] - k).add(nums[i]);
        			}
        		}
        	}
        } else if (k == 0){
        	for (int i = 0; i < nums.length; ++i) {
        		if (map.containsKey(nums[i])) {
        			if (map.get(nums[i]).isEmpty()) {
        				++result;
        				map.get(nums[i]).add(nums[i]);
        			}
        		} else {
        			map.put(nums[i], new ArrayList<Integer>());
        		}
        	}
        }
        
    	return result;
    }
}
