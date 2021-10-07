/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package dynamicProgramming;

public class LongestIncreasingSubsequenceLength {
	public static void main(String args[]) {
		int[] nums = {10,9,2,5,3,7,101,18};
		System.out.print(lengthOfLIS(nums));
	}


	public static int lengthOfLIS(int[] nums) {
		int start=0,end=0;
		boolean reset=false;
		end=nums.length-1;

		for(int i= nums.length-1; i >=0; i--) {
				if( nums[i]< nums[i-1]) {
					end--;
				}	else{

				}
		}
		return start-end;
	}
}
