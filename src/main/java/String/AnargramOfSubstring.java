/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package String;

import java.util.HashMap;

public class AnargramOfSubstring {

	public  static void main(String args[]) {

		String s1= "bcdcbdba";
		String s2="abc";

		System.out.println(checkForAnargram(s1,s2));
	}

	private static Boolean checkForAnargram(String s1, String s2) {

		int matchedElement=0;
		int start=0;
		int patternlength=s2.length();
		HashMap<Character,Integer> hm =new HashMap<Character, Integer>();
		for(int i=0; i<s2.length() ;i++) {
			hm.put(s2.charAt(i),1);

		}
		for(int i=0 ;i <s1.length() ;i++) {
            char currentChar= s1.charAt(i);
			if(hm.containsKey(currentChar)) {
				hm.put(currentChar, hm.get(currentChar)-1);

				if(hm.get(currentChar)==0)
					matchedElement++;
			}
			if(matchedElement==patternlength)
				return true;
			if(i>=patternlength) {
				char startChar= s1.charAt(start++);
				if(hm.containsKey(startChar)) {
					if(hm.get(startChar)==0)
						matchedElement--;

					hm.put(startChar,hm.get(startChar)+1);
				}
			}
			 }
		return false;
		}

}
