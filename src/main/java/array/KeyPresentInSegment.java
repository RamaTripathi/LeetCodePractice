/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package array;

import java.util.Scanner;

public class KeyPresentInSegment {

	public static void main(String args[]) {
		int arr[] = { 3, 5, 2, 4, 9, 3,
				1, 7, 3, 11, 12, 3 };

		System.out.println(" length of the array is " + arr.length);
		System.out.println(" ENTER Size of segemnnt");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(" ENTER Key ");
		int k = sc.nextInt();
		System.out.println(findingXinWindowSize(arr, k, n));
	}

	static boolean findingXinWindowSize(int arr[], int key, int k) {
		int lengthOfArray = arr.length;
		int i;
		for (i = 0; i < lengthOfArray; i = i + k) {
			for (int j = 0; j < k; j++) {
				if (i + j < lengthOfArray && arr[i + j] == k)
					 break;

				if (j == k)
					return false;

				if (i + j >= lengthOfArray)
					return false;
			}
		}
		if (i >= lengthOfArray)
			return true;

		else
			return false;

	}

}