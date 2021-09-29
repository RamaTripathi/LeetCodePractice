/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package String;

import java.util.HashMap;
import java.util.Map;

public class FindKlongestSubstring {

	public static void main(String args[]) {
	String s = "bccbabbd";
	int k = 2;
	lognestSubstringlengthwithKdistinctCharacter(s,2);
}

	 static void lognestSubstringlengthwithKdistinctCharacter(String str,int k) {
		Map<Character,Integer> map =new HashMap<>();
		int endIndex=0,startIndex=0;
		if(k==0 || k >str.length() || str==null || str.length() ==0 )
			return;
		else {
		   while(endIndex<str.length()) {
			map.put(str.charAt(endIndex), map.getOrDefault(endIndex,0));
			while(map.size()>k) {
				char charFromFront= str.charAt(startIndex);
				map.put(charFromFront, map.get(charFromFront)-1);
				if(map.get(charFromFront)==0) {
					map.remove(charFromFront);
				}
				startIndex++;
			}
		   }

			}
		}

}
