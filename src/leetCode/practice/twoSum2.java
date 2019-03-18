package leetCode.practice;

import java.util.Arrays;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
//accepted
public class twoSum2 {
	public static void main(String[] args) {
//		int[] nums = new int[]{-1, 0};
//		int target = -1;
		
//		int[] nums = new int[]{-1,-2,-3,-4,-5};
//		int target = -8;
		
//		int[] nums = new int[]{-3,5,6,90};
//		int target = 0;
		
		int[] nums = new int[]{1,2,3,4,4,9,56,90};
		int target = 8;
		
		int[] res = twoSum(nums, target);
		System.out.println(res[0] + " " + res[1]);
	}
	
    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        
        if (target >= 0) {
        	for (int i = 0; i < nums.length - 1; ++i) {
        		if (nums[i] <= target) {
        			int j = Arrays.binarySearch(nums, i+1, nums.length, target - nums[i]);
        			if (j > -1) {
        				res[0] = i + 1;
    					res[1] = j + 1;
    					break;
        			}
        		} else {
        			break;
        		}
        	}
        } else {
        	for (int i = 0; i < nums.length - 1; ++i) {
        		if (nums[i] >= target) {
        			int j = Arrays.binarySearch(nums, i+1, nums.length, nums[i] - target);
        			if (j > -1) {
        				res[0] = i + 1;
    					res[1] = j + 1;
    					break;
        			}
        		} else {
        			break;
        		}
        	}

        }
        return res;
    }
}
