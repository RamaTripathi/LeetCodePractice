/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package misc;

import java.util.Stack;

public class BalancedParenthesis {

	public static void main(String args[]) {
		char[] arr = {  '[' , '{' , '(', ')', '}', ']' };


	//	checkBalancedparentheses(arr);
		//arr = new char[] { '[', '{', '(', '}', '}', '}' };

		String s= "(])";
		System.out.println(checkBalancedparentheses(s));
	}

	private static boolean checkBalancedparentheses(String s) {
		char[] arr = s.toCharArray();
		Stack<Character> st = new Stack<Character>();
		for(Character c: arr){
			if( c == '(' || c== '{' || c== '[')
				st.push(c);
			else
			{
				if( ! st.isEmpty() ) {
					char c1 = st.peek();
					if ((c == ')' && c1 == '(') || (c == '}' && c1 == '{') || (c == ']' && c1 == '['))
					{	st.pop();
					}else
						return false;
				}else
					return false;
			}
		}
		return st.isEmpty();



		/*
	    for( char c : arr) {
	    	if( c== '['  || c == '{' || c == '(')
					{
						s.push(c);
					}
			if( c== ']'  || c == '}' || c == ')')
			{
					if(s.isEmpty())
						System.out.println(" not balanced");
					else{
						char top= s.peek();
						if((c==']' && top == '[' ) || (c=='}' && top == '{' )|| (c==')' && top=='(' ))
							s.pop();
						else
							System.out.println(" not balanced");
					}
			}

		}
		System.out.println( s.isEmpty()?"Balanced":"Not Balanced");

		 */

	}

}
