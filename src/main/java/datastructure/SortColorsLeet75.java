/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package datastructure;

public class SortColorsLeet75 {
	public static void
	main(String args[]) {
		int[] arr ={2,0,2,1,1,0};
		arr= new int[] { 1, 2, 0 };
		sortColors1(arr);
		for(int i : arr)
		System.out.print(i);
	}
	public static void sortColors(int[] nums) {
	int low=0, mid= 0 , end =nums.length-1;

		while(mid <end)
		{
 			if(nums[mid]==0) {
				 swap(nums,mid,low);
				 low++;
				 mid++;
			}
			 else if(nums[mid]==1)
				  mid++;
			 else {
				swap(nums, mid, end);
				end--;
			}
		}

	}
	public static void swap( int[] nums , int i, int j) {
		int t= nums[i];
		nums[i]=nums[j];
		nums[j]=t;
	}

	public static void sortColors1(int[] nums) {
		int redSt=0, bluSt=nums.length-1;
		int i=0;
		while(i<bluSt+1){
			if(nums[i]==0){
				int tmp = nums[i];
				nums[i] = nums[redSt];
				nums[redSt] = tmp;
				redSt++;
				i++;
				continue;
			}
			if(nums[i] ==2){
				int tmp = nums[i];
				nums[i] = nums[bluSt];
				nums[bluSt] = tmp;
				bluSt--;
				continue;
			}
			i++;
		}
	}
}
