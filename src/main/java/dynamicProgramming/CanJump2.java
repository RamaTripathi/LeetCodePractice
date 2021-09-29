/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package dynamicProgramming;

public class CanJump2 {
	public static void main(String args[]) {
		int[] nums = { 2,3,1,1,4};

		System.out.println(canJump(nums));
	}

	public static int canJump(int[] nums) {
		int end = 0, farthest = 0;
		int jump = 0;


		for (int i = 0; i < nums.length - 1; i++) {
			farthest = Math.max(farthest, i + nums[i]);
			if (i == end) {
				jump++;
				end = farthest;
			}
		}
		return jump;
	}
}

