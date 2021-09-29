/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package array;

import java.util.HashMap;

public class SubArraySum {

	public static void
	main(String args[]) {
		int[] arr = {10, 2, -2, -21, 10};

		//* hm( [ 10,0], [12,1], [ 10,2], [-10,
		int n = arr.length;
		int sum = -10;
		subArraySum(arr, n, sum);
	}

	private static void subArraySum(int[] arr, int n, int sum) {
		int cur_sum=0;

		int start = 0;
		int end=-1;

		HashMap<Integer,Integer> hashMap=new HashMap<>();
		for(int i=0; i< n ; i++ ) {
			cur_sum=cur_sum + arr[i];

			if(cur_sum-sum==0) {
				start=0;
				end=i;
				break;
			}

			//if hashMap already has the value, means we already
			// have subarray with the sum - so stop
			if(hashMap.containsKey(cur_sum-sum)) {
				start = hashMap.get(cur_sum - sum) + 1;
				end = i;
				break;
			}
			//if value is not present then add to hashmap
			hashMap.put(cur_sum, i);
		}

		// if end is -1 : means we have reached end without the sum
		if (end == -1) {
			System.out.println("No subarray with given sum exists");
		} else {
			System.out.println("Sum found between indexes "
					+ start + " to " + end);
		}

	}
}
