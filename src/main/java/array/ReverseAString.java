/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package array;

import java.util.Arrays;

public class ReverseAString {

	public static void main(String args[]) {
		int[] arr = { 12, 9, 5, 78, 3 };
		int[] ta = new int[arr.length];
		int n= arr.length;
		int i = 0;
		int e = n - 1;
		for (int a : arr) {
			if (a < 0) {
				ta[i] = a;
				i++;
			}
			if(a > 0) {
				ta[e] = a;
				e--;
			}

		}
		arr=ta.clone();


	}
}

