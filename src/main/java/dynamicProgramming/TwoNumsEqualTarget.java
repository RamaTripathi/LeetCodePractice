/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TwoNumsEqualTarget {
	public static void main (String args[]) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		System.out.println(twoSum(nums,target).toString());
	}



		public static int[] twoSum ( int[] nums, int target){
	    if(target==0 || nums == null) return new int [] {0,0};
		HashMap<Integer,Integer> hm =new HashMap<Integer,Integer>();
		for(int i=0; i < nums.length ;i++) {
			if(hm.containsKey(nums[i]))
				return new int [] { hm.get(nums[i]),i };
			else
				hm.put(target-nums[i],i);
		}

			return new int [] {0,0};
	}
}
