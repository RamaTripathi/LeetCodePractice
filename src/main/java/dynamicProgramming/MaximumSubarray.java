/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package dynamicProgramming;
public class MaximumSubarray {
		public static void main(String args[]) {
			int[] nums = { 1, -2, 3, -2 };
		}
	public int maxProduct(int[] nums) {
			int cSum=0;
			int maxSum=nums[0];
			for(int i=0 ;i < nums.length; i++) {
				cSum= Math.max(nums[i],nums[i]+cSum);
				if(maxSum<cSum)
					maxSum=cSum;
			}
			return maxSum;

	}
}
