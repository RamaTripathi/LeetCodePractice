/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package dynamicProgramming;

public class UglyNumber {
	public static void main(String args[]) {
		System.out.println(nthUglyNumber(20));
	}
	public static int nthUglyNumber(int n) {
		int dp[] = new int[n];
		// this array only contains the prodcut of 2,3,5 hence the multiplication of other numbers can not exist
		// and every next number in the series will be the miminum prodcut of current number with 2,3 or 5
		dp[0] = 1;
		int index2 = 0,index3 = 0,index5 = 0;
		// here calculating the prodcut of 2 or 3 or 5 and taking minimum of the products and
		// then incrementing the counter for that particular index, in begining
		// 2 ,3 ,5 all will multiplied with 1 hence dp[0] is assigned 1
		//for each next calculation take the minimumn of 2 ,3 or 5 's product with their index which will
		// be only incrmeneted if its product will be minimum
		for(int i=1; i < n ; i++) {
			int product2 = 2 * dp[index2];
			int product3 = 3 * dp[index3];
			int product5 = 5 * dp[index5];

			int min = Math.min(product2,Math.min(product3,product5));
			dp[i] = min;

			index2 = product2 == min ? index2+1 : index2;
			index3 = product3 == min ? index3+1 : index3;
			index5 = product5 == min ? index5+1 : index5;
		}

		return dp[n-1];
		}

}
