/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package dynamicProgramming;

public class LongestIncreasingSubsequence {

	public static void main(String args[])
	{
		int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
		int n = arr.length;
		System.out.println("Length of lis is " + lis(arr, n)
				+ "\n");
	}

	private static int lis(int[] arr, int n) {

		int[] sol=new int[arr.length];

		for(int i=0;i< arr.length; i++)
		{
			sol[i]=1;
		}
		for(int i=1;i <n;i++)
		{
			 for( int j =0;j<i; j++)
			 {
				if(arr[i] > arr[j] &&  sol[i]< sol[j]+1 )
					sol[i]=sol[i] +1;
			 }
		}
		int max=0;
		for(int i=0; i< sol.length ; i++) {
			if(max<sol[i])
				max=sol[i];
		}
		return  max;

	}
}

