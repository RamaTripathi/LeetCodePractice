/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package dynamicProgramming;

public class ArithmeticSlices {
	public static void main(String args[]) {
		int [] nums = {1,2,3,4,5,6};
		System.out.println(numberOfArithmeticSlices(nums));
	}
	public static int numberOfArithmeticSlices(int[] nums) {
		int n=nums.length;
		if(n<=2) return 0;
		int res=0,dp=0;
		for( int i=2 ;i < n ; i++)
		{
			if((nums[i]-nums[i-1]) == (nums[i-1]-nums[i-2])) {
				dp=dp+1; // total no of slices till index i
				res= res+dp; // result will be the sum of previous res + dp on current index
			}else{
					dp=0;
			}
		}
		return res;
	}

}
