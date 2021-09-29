/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package dynamicProgramming;

public class BuyAndSellStock {
	public static void main(String args[]){

		int[] nums= {1,2,3,0,2};
		System.out.println(maxProfit(nums));
	}
	public static int maxProfit(int[] prices) {

		int leastValue=prices[0];
		int maxProfitSoFar=0;

		for(int i =1 ; i < prices.length;i ++) {

			if(prices[i]<leastValue)
				leastValue=prices[i];

			maxProfitSoFar= Math.max( maxProfitSoFar, prices[i]-leastValue);


		}
		return  maxProfitSoFar;
	}
}
