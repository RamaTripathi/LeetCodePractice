/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package dynamicProgramming;

public class MinimumCostClimbingStairs {
	public static void main(String args[])
	{
		int[] cost = {10,15,20};
	}
	public int minCostClimbingStairs(int[] cost) {
		int n=cost.length;
		int[] res =new int[n];
		if(n==1) return cost[0];

		res[0]= cost[0];
		res[1]= cost[1];

		for(int i=2;i<=n;i++)
		{
			res[i]= min(res[i-1],
					res[i-2] )

					+cost[i] ;
		}
		return res[n];

	}

	public int min(int n1, int n2) {
		if(n1<n2)
			return n1;
		else
			return n2;
	}
}
