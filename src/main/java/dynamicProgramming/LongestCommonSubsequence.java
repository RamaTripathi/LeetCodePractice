/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package dynamicProgramming;

public class LongestCommonSubsequence {

	public static void main(String args[])
	{
		String s1 = "AGGTAB";
		String s2 = "GXTXAYB";

		System.out.println("Recursion Length of lis is " + lcsUsingRecursion(s1.toCharArray(), s2.toCharArray(),s1.length(),s2.length())
				+ "\n");
	}


	public static int lcsUsingRecursion( char[] s1, char[] s2,int m ,int n)
	{
		if(m==0 || n==0)
			 return 0;

        if(s1[m-1] == s2[n-1])
			return 1+lcsUsingRecursion(s1,s2,m-1,n-1);
        else
			return max(lcsUsingRecursion(s1,s2,m-1,n), lcsUsingRecursion(s1,s2,m,n-1));

	}
	static int max(int a, int b)
	{
		return (a > b)? a : b;
	}

	public static int lcsUsingMemorization( char[] s1, char[] s2,int m ,int n) {
		int sol[][] =new int[m+1][n+1];

		for(int i=0 ;i <m ;i++)
		{
			for(int j=0; j <n ;j++)
			{
				 if(i==0 || j==0)
				 	sol[i][j]=0;

				 else if( s1[i-1] == s2[j-1])
				 	 sol[i][j] =sol[i-1][j-1]+1;
				 else
				 	  max(sol[i-1][j],sol[i][j-1]);

			}
		}

		return sol[m][n];
	}
}
