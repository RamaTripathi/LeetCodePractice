/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package String;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithNoRepeatedCharacters {
	public static void main (String args[]) {
		String in="babccbcd";
		System.out.println(checkLongestSubstringWithNoRepeatedCharacters(in));
	}

	private static int checkLongestSubstringWithNoRepeatedCharacters(String in) {
		int start=0;
		int end=0;
		int max=0;

		Map<Character,Integer> hm =new HashMap<Character,Integer>();

		while(end<in.length()) {
			if(hm.containsKey(in.charAt(end)))
			{
				start=Math.max(start,hm.get(in.charAt(end))+1);
			}
			hm.put(in.charAt(end),end);
			max= Math.max(end-start+1, max);
			end++;
		}
		return max;
	}
}
