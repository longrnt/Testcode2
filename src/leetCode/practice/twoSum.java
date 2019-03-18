package leetCode.practice;

//https://leetcode.com/problems/two-sum/description/
//accepted
public class twoSum {
	public static void main(String[] args) {
//		int[] nums = new int[]{0, 3, 4, 0};
//		int target = 0;
		
//		int[] nums = new int[]{-1,-2,-3,-4,-5};
//		int target = -8;
		
		int[] nums = new int[]{-3,4,3,90};
		int target = 0;
		
		int[] res = twoSum(nums, target);
		System.out.println(res[0] + " " + res[1]);
	}
	
    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length - 1; ++i) {
//        	if ((nums[i] >= 0 && nums[i] <= target)
//        			|| (nums[i] < 0 && nums[i] >= target)) {
        		for (int j = i + 1; j < nums.length; ++j) {
        			if (nums[i] + nums[j] == target) {
        				res[0] = i;
        				res[1] = j;
        			}
        		}
//        	}
        }
        return res;
    }
}
