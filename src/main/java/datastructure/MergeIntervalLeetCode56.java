/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervalLeetCode56 {
	public static void main(String args[]) {
		int[] [] nums= {{1,3},{2,6},{8,10},{15,18}} ;
		//int [] [] nums = {{1,4},{5,6}};
		int[][] intervals = merge(nums);
		for( int i= 0 ; i <intervals.length ; i++) {
			System.out.println( "  " );
			for( int j =0 ; j < intervals[i].length ; j++)
				System.out.print( "  " + intervals[i][j]);
		}


	}

	public static int[][] merge(int[][] intervals) {
		if(intervals.length==1) return intervals;

		Arrays.sort(intervals, ( a1, a2)-> Integer.compare( a1[0],a2[0] )) ;
		List<int[]> outPuArr= new ArrayList<int[]>();
		int[] currentInterval=intervals[0];
		outPuArr.add(currentInterval);

		for(int i =1 ; i< intervals.length ; i++ ) {

			int[] nextInterval=intervals[i];
			int cBegin=currentInterval[0];
			int cEnD=currentInterval[1];
			int nextBegin=nextInterval[0];
			int nextEnd=nextInterval[1];

			if(cEnD >= nextBegin) {
				currentInterval[1]=  Math.max(cEnD, nextEnd) ;
			}else {
				currentInterval=intervals[i];
				outPuArr.add(currentInterval);
			}

		}

		return  outPuArr.toArray(new int [outPuArr.size()][]);
	}
}
