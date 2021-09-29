/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package sort.heap;

/*
1. Build a max heap from the input data.
2. At this point, the largest item is stored at the root of the heap.
Replace it with the last item of the heap followed by reducing the size of heap by1.
Finally, heapify the root of the tree.
3. Repeat step 2 while the size of the heap is greater than 1.

*/
public class HeapSort {
	// Driver code
	public static void main(String args[])
	{
		int arr[] = { 12, 11, 13, 5, 6, 7 };
		int n = arr.length;

		HeapSort ob = new HeapSort();
		ob.sort(arr);

		System.out.println("Sorted array is");
		printArray(arr);
		System.out.println(" ********");
	}

	/* A utility function to print array of size n */
	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public void sort(int arr[])
	{
		int n= arr.length;
		for(int i= (n/2)-1 ; i >=0; i--) {
			heapify(arr,n,i);
		}
		System.out.println(" ***heapify*****");
		printArray(arr);
		for( int i = n-1 ;i >0 ;i--)
		{
			int tem=arr[0];
			arr[0]=arr[i];
			arr[i]=tem;

			heapify(arr,i,0);
		}

	}

	// To heapify a subtree rooted with node i which is
	// an index in arr[]. n is size of heap
	void heapify(int arr[], int n, int i)
	{
		int largest=i;
		int leftchild= i*2+1;
		int rightchild=2*i+2;

		if(leftchild<n && arr[leftchild] > arr[largest])
			largest=leftchild;
		if(rightchild <n && arr[rightchild] >arr[largest])
			largest=rightchild;

		if(largest!=i)
		{
			int t= arr[i];
			arr[i]=arr[largest];
			arr[largest]=t;

			heapify(arr,n,largest);
		}





		}
}
