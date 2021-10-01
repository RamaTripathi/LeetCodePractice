/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package dynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class DecodeWays {
	public static void main(String args[]) {
		String s="226";


		System.out.println(numDecodings(s));
	}
	public static int numDecodings(String s) {
		int res=0;
		int[] dp = new int[s.length()+1];
		dp[0]=1;
		dp[1]=s.charAt(0) == '0' ? 0:1;
		for(int i=2;i <=s.length() ; i++) {
			int integerOne= Integer.parseInt(s.substring(i-1,i));
			int integerTwo= Integer.parseInt(s.substring(i-2,i));

			if(integerOne>=0 && integerOne<=9 )
				dp[i]=dp[i-1]+dp[i];
			if(integerTwo>=10 && integerTwo<=26 )
				dp[i]=dp[i-2]+dp[i];


		}
		return dp[s.length()];
  	}
}


