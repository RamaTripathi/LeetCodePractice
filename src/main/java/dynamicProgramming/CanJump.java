/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package dynamicProgramming;


//  BACKTRACKING and Dynamic Programming

public class CanJump {

	public static void main(String args[]) {
		int[] nums = {0,2,3};

		System.out.println(canJump(nums));
	}

		public static boolean canJump(int[] nums) {
			int lastGoodPosition=nums.length-1;
			for(int i= nums.length-1; i >=0 ;i --) {
				if(i + nums[i] >= lastGoodPosition)
					lastGoodPosition=i;
			}
			return lastGoodPosition==0;
		}

}
