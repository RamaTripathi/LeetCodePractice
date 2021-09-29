/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package misc;

import java.math.BigInteger;

public class FactorialOfLargeNumber {

	// Driver method
	public static void main(String args[]) throws Exception
	{
		int N = 40000;
		System.out.println(factorial(N));
	}

	static BigInteger factorial( int N) {

		BigInteger res= new BigInteger("1");

		for(int i=2;i<=N;i++) {
			res=res.multiply(BigInteger.valueOf(i));
		}
	return  res;
	}
}
