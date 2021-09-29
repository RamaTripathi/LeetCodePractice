/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package dynamicProgramming;

public class MaxProdArray {
	public static void main(String args[]){

		int[] nums= {-2,3,-4};
		System.out.println(maxProduct(nums));
	}
	public  static int maxProduct(int[] nums) {
		if(nums.length == 0)return 0;
		int maxSub=nums[0];
		int minSub=nums[0];
		int maxProdSub=nums[0];

		for(int i=1; i<nums.length; i++){
			if(nums[i]<0){
				int temp=maxSub;
				maxSub=minSub;
				minSub=temp;
			}

			maxSub=Math.max(maxSub*nums[i], nums[i]);
			minSub=Math.min(minSub*nums[i], nums[i]);

			maxProdSub=Math.max(maxProdSub, maxSub);
		}
		return maxProdSub;

	}
}

