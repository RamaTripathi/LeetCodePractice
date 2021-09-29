/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package dynamicProgramming;

public class SingleNumber {
	public static void main(String args[]) {
		int[] nums = {2,2,1};

		System.out.println(singleNumber(nums));
	}

	public static int singleNumber(int[] nums) {
		int ans = 0;
		for (int n: nums) {
			ans ^= n;
		}
		return ans;
	}
}
