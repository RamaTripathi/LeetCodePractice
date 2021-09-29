/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package String;

public class AlienSortedDictionary {
	public static void main(String[] args)
	{
		String[]  words = {"hello","leetcode"} ;
		String order = "hlabcdefgijkmnopqrstuvwxyz";
		System.out.println(isAlienSorted(words,order));
	}
	public static boolean isAlienSorted(String[] words, String order) {
		int orderMap[] = new int [26];
		for(int i=0; i<26 ;i ++)
		{
			orderMap[order.charAt(i)-'a'] =i;
		}


		for(int i=0 ;i < words.length-1 ;i ++)
		{
			for(int j=0 ;j < words[i].length() ; j++)
			{
				if (j >= words[i + 1].length()) return false;

				if(words[i].charAt(j)!= words[i].charAt(j)) {
					int currentWordChar = words[i].charAt(j)-'a';
					int nextWordChar	= words[i+1].charAt(j)-'a';

					if (orderMap[currentWordChar] > orderMap[nextWordChar])
						return false;
					else
						break;
				}

			}
		}
		return  true;
	}
}
