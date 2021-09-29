/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package String;

public class PrintFirstCharacterOfEveryWord {
	public static void main(String args[]) {
		String s="       Hello User!!! welcome";
		char[] stringArray=s.toCharArray();

		for(int i=0;i<stringArray.length; i++) {
			if ((stringArray[i] != ' ') && (i == 0 || stringArray[i-1] == ' '))
			{
				System.out.println(stringArray[i]);
			}
		}
 	}
}
