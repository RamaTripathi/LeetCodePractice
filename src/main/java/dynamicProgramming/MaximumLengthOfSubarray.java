/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package dynamicProgramming;

public class MaximumLengthOfSubarray {
	public static void main (String args[]) {
		int[] nums = {0,1,2,-3,20};

		System.out.println(getMaxLen(nums));
	}

	public static int getMaxLen(int[] nums) {
		int positive = 0;
		int negative = 0;
		int res = 0;

		for(int i = 0;i< nums.length;i++){
			int temp = nums[i];

			if(temp == 0){
				positive = 0;
				negative = 0;
			}else if(temp > 0){
				positive++;
				negative = negative == 0 ? 0 : negative+1;
			}else{
				int x = positive;
				positive = negative == 0 ? 0 : negative + 1;
				negative = x + 1;
			}

			res = Math.max(res,positive);
		}

		return res;

	}
}
