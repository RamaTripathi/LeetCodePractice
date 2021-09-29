/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package String;

import java.util.Stack;

public class ReverseString {
	public static void main(String args[]) {
		String s="Hello User!!! welcome";
		Stack<Character> st =new Stack<Character>();
		for(int i=0;i<s.length();i++)
		{
			st.push(s.charAt(i));
		}

		while (!st.isEmpty()) {
			System.out.println(st.pop() );
		}

		StringBuilder sb= new StringBuilder(s);
		System.out.print(sb.reverse());
	}
}
