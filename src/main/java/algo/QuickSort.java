/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package algo;

import java.io.*;
public class QuickSort {
	// A utility function to swap two elements
	static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	/* This function takes last element as pivot, places
	the pivot element at its correct position in sorted
	array, and places all smaller (smaller than pivot)
	to left of pivot and all greater elements to right
	of pivot */

	static void quickSort(int[] arr,int low,int high){

	if(low<high){
		int partitionIndex=partitionArray(arr,low,high);
		quickSort(arr,low,partitionIndex-1);
		quickSort(arr,partitionIndex+1,high);

		}
	}

	static int partitionArray(int[] arr, int low, int high) {

		int pivot=arr[high];
		// Index of smaller element and indicates the right position of pivot found so far
		int i=low-1;
		/*
		10, 7, 8, 9, 1, 5
		1,7,8,9,10,5
		1,5,7,8,9,10
		 */


		for(int j = low ; j<high ; j++)
			{
				if(arr[j]<pivot)
				{
					i++;
					swap(arr,i,j);
				}
			}
		swap(arr, i + 1, high);
		return i+1;

	}

	// Function to print an array
	static void printArray(int[] arr, int size)
	{
		for(int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	// Driver Code
	public static void main(String[] args)
	{
		int[] arr = { 10, 7, 8, 9, 1, 5 };
		int n = arr.length;

		quickSort(arr, 0, n - 1);
		System.out.println("Sorted array: ");
		printArray(arr, n);
	}
}


