/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package dynamicProgramming;

public class MinimumCoinChnage {
	public static void main(String args[]) {
		int[] coins={1,2,3};
		System.out.println(minCoinChange(coins,5));

	}
	public static int minCoinChange(int[] coins, int amount) {

		if (amount == 0) return 1;
		if (amount < 0) return 0;

		if (amount > 0 && coins.length < 0)
			return 0;



		int numberOfCoins = coins.length;
		int[][] dpSol = new int[numberOfCoins][amount + 1];

		for(int i=0; i <coins.length ;i ++)
			dpSol[i][0]=0;
		for (int i = 0; i < coins.length; i++){
			for (int j = 1; j <= amount; j++) {
				int excludeCurrentCoin = Integer.MAX_VALUE;
				int includeCurrentCoin = Integer.MAX_VALUE;
				if (coins[i] < j) {
					includeCurrentCoin = dpSol[i][j - coins[i]];
				}
				if (i > 0) {
					excludeCurrentCoin = dpSol[i - 1][j];
				}

				dpSol[i][j] = Math.min(excludeCurrentCoin, includeCurrentCoin);

			}
	}

		return  dpSol[numberOfCoins-1][amount];

	}

	public static int minCoinsToMakeSum(int[] coins, int sum) {
		if(coins.length == 0 || sum <= 0) {
			return 0;
		}

		int numberOfCoins = coins.length;

		int[][] arr = new int[numberOfCoins][sum + 1];

		for(int i = 0; i < numberOfCoins; i++) {
			arr[i][0] = 0;
		}

		for(int i = 0; i < numberOfCoins; i++) {
			for(int j = 1; j <= sum; j++) {

				int includingCurrentCoin = Integer.MAX_VALUE;
				int excludingCurrentCoin = Integer.MAX_VALUE;

				if(coins[i] <= j) {
					includingCurrentCoin = 1 + arr[i][j - coins[i]];
				}

				if(i > 0) {
					excludingCurrentCoin = arr[i - 1][j];
				}

				arr[i][j] = Math.min(includingCurrentCoin, excludingCurrentCoin);
			}
		}

		return arr[numberOfCoins - 1][sum];
	}
}
