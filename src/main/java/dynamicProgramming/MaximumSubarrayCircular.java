/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package dynamicProgramming;

public class MaximumSubarrayCircular {
	public static void main(String args[]) {
		int[] nums = { 1, -2, 3, -2 };
	}
	public static  int maxSubarraySumCircular(int[] nums) {

		int curr_max=nums[0], max_so_far=nums[0],sum=nums[0],
				curr_min=nums[0], min_so_far=nums[0];
		for(int i =0; i <nums.length ; i++ ) {

			curr_max= Math.max( curr_max+ nums[i], nums[i]);
			max_so_far = Math.max(curr_max,max_so_far);

			curr_min = Math.min(curr_min + nums[i], nums[i]);
			min_so_far = Math.min(min_so_far, curr_min);

		sum=sum+ nums[i];
		}
		if (min_so_far == sum) {
			return max_so_far;
		}

		// returning the maximum value
		return Math.max(max_so_far, sum - min_so_far);
	}
}
