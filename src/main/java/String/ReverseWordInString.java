/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package String;

import java.util.Stack;

public class ReverseWordInString {
	public static void main(String args[]) {
		String s = "Hello User!!! welcome";
		usingStack(s);
		usingStringBuilder(s);
	}

	private static void usingStack(String s) {
		System.out.print("\nUsingStack : ==   ");
		Stack<Character> st = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				while (!st.isEmpty()) {
					System.out.print(st.pop());
				}
				System.out.print(" ");
			}
			else {
				st.push(s.charAt(i));
			}
		}
		while (!st.isEmpty()) {
			System.out.print(st.pop());
		}
	}
	private static void usingStringBuilder(String s) {
		System.out.print("\nsingStringBuilder : ==   ");
		StringBuilder finalStr= new StringBuilder();
		StringBuilder tempStr= new StringBuilder();

		for( int i=0;i< s.length() ; i++) {
			if(s.charAt(i) == ' ') {
				finalStr=finalStr.append(tempStr).append(" ");
				tempStr.setLength(0);
			}
			else {
				tempStr.insert(0,s.charAt(i));
			}
		}
	finalStr.append(tempStr);
		System.out.println(finalStr);
	}
}
