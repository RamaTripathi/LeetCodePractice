/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package dynamicProgramming;

// 1st and last house are adjacent
public class HouseRobber2 {
	public static void main(String args[]) {
		int[] nums= {1,2,3};
		System.out.println(rob(nums));
	}

	public static int rob(int[] nums) {
		if(nums.length==1) return nums[0];
		if(nums.length==2) return Math.max(nums[0],nums[1]);
		int max1 = robHelper(nums, 0, nums.length-2);
		int max2 = robHelper(nums, 1, nums.length-1);

		return Math.max(max1,max2);
	}

	public static int robHelper(int[] nums,int lo, int hi) {
		int rob = 0, notrob = 0;
		for (int i = lo; i <= hi; i++) {
			int temp = notrob;
			notrob = Math.max(notrob, rob);
			rob = temp + nums[i];
		}

		return Math.max(rob, notrob);
	}


}
