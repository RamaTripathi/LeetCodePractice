/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package datastructure.queue;

import java.util.HashMap;
import java.util.Stack;

public class MinRemoveToMakeValidParentheses {
	public static void main(String args[]) {
	String s ="lee(t(c)o)de)";
	System.out.print(minRemoveToMakeValid(s));
	}
	public static String minRemoveToMakeValid(String s) {
		Stack<Integer> st = new Stack<>();
		StringBuilder sb = new StringBuilder(s);
		for(int i =0;i<s.length();i++)
		{
			if(s.charAt(i) == '(')st.push(i);
			else if(s.charAt(i) == ')')
			{
				if(!st.isEmpty() && s.charAt(st.peek()) == '(')st.pop();
				else st.push(i);
			}
		}
		// removing the redundant brackets
		while(st.size()!=0)
		{
			sb = sb.deleteCharAt(st.pop());
		}
		return sb.toString();
	}
	public static String minRemoveToMakeValid1(String s) {
		Stack<Integer> indexOfBracketsStack= new Stack<Integer>();
		StringBuilder resString= new StringBuilder(s);
		for(int i=0; i < s.length() ;i++) {
			if(s.charAt(i) == '(') indexOfBracketsStack.push(i);
			if(s.charAt(i) == ')') {
				if (!indexOfBracketsStack.isEmpty() && s.charAt(indexOfBracketsStack.peek()) == '(')
					indexOfBracketsStack.pop(); // remove from stack if there was matching opening bracket
				else
					indexOfBracketsStack.push(i); // push the index of bracket which are unbalanced
				}
			}
    while( !indexOfBracketsStack.isEmpty()) {
		resString =resString.deleteCharAt(indexOfBracketsStack.pop());
	}
	return resString.toString();
	}
}
