/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package dynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class WordBreak {
	public static void main (String args[]) {
		String s= "leetcode";
		List<String> wordDict= new ArrayList<String>();
		wordDict.add("leet");
		wordDict.add("code");
		System.out.println(wordBreak(s,wordDict));
		//wordBreak(s,wordDict)

	}

	public static boolean wordBreak(String s, List<String> wordDict) {
		boolean[] dp = new boolean [ s.length()+1];
		dp[0]=true;
		for( int i=1 ; i<= s.length() ; i++ ){
			  for( int j= 0 ;j< i ;j ++) {
				String   sub= s.substring(j,i);
				    if(dp[j]&& wordDict.contains(sub)) {
						dp[i] = true;
						break;
					}
			  }
		}
		  return dp[s.length()];
	}
}
