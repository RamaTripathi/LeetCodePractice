/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package dynamicProgramming;

public class HouseRobber {

	public static void main(String args[]) {
		int[] nums= {2,1,1,2};

	}

	public static int rob(int[] nums) {
		int[] res = new int[nums.length];
		if(nums.length ==1) return nums[0];
		if(nums.length==2 ) return Math.max(nums[0],nums[1]);
		res[0]= nums[0];
		res[1] =  Math.max(nums[0],nums[1]);
		for(int i=2 ;i < nums.length ; i++) {
			res[i]=Math.max(nums[i]+ res[i-2], res[i-1]);
		}

		return   res[nums.length-1];
	}



}
