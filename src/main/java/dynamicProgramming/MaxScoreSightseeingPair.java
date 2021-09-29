/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package dynamicProgramming;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxScoreSightseeingPair {
	public static void main (String args[]) {
		int[] values = {8,1,5,2,6};
		System.out.println(maxScoreSightseeingPair1(values));
	}
	public static int maxScoreSightseeingPair(int[] values) {

		PriorityQueue<Integer> P=new PriorityQueue<>(Collections.reverseOrder());
		int max=0;
		for(int i=0;i<values.length;++i){
			if(i>0){
				System.out.println(" Peek Item is " + P.peek());
				max=Math.max(P.peek()+values[i]-i,max);
			}
			P.add(values[i]+i);
			System.out.println( " Priority queue is " +P);
		}
		return max;

	}
	public static int maxScoreSightseeingPair1(int[] A) {
		int ans = 0, currBest = 0;
		for (int num : A) {
			ans = Math.max(ans, currBest + num);
			currBest = Math.max(currBest, num) - 1;
		}
		return ans;
	}
	}
