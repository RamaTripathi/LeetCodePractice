/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package dynamicProgramming;

import java.util.Arrays;

public class CoinChange {
	public static void main(String args[]) {
		int[] coins={1,2,5};
		System.out.println(coinChange(coins,11));

	}
	public static int coinChange(int[] coins, int amount) {

		if(amount==0) return 1;
	    if(amount<0) return 0;
		if(amount>0 && coins.length <0) return 0;

		int numberOfCoins = coins.length;
		int[][] dpSol= new int[numberOfCoins][amount+1];

		for(int i=0 ;i < numberOfCoins ; i++)
			 dpSol[i][0]=1;

		for(int i=0 ;i < coins.length ; i++)
		{
			for( int j=1 ;j <= amount ;j++) {
				int includingCurrentCoin = 0;
				int excludingCurrentCoin = 0;
				if(coins[i] <= j) {
					includingCurrentCoin = dpSol[i][j - coins[i]];
				}
				if(i > 0) {
					excludingCurrentCoin = dpSol[i - 1][j];
				}
				dpSol[i][j] =  includingCurrentCoin + excludingCurrentCoin;
			}
		}
		return  dpSol[coins.length-1][amount];
	}
}
