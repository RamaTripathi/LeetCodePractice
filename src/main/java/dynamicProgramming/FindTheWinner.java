/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
push all the elements in the queuee
run a loop until q.size() ==1
inside the loop run a nested loop for k-1 times
remove the starting element and push it in the end
after coming out of the loop remove the starting element
in the end return the only remaining element in the queue

 */
public class FindTheWinner {
//1 2 3 4 5

//3 4 5 1 //5 1 3 // 3 5 //
	public static void main(String args[]) {
	System.out.println(findTheWinner(5,2));
	}
	public static int findTheWinner(int n, int k) {
		Queue<Integer> q= new LinkedList<>();
		for(int i=1 ;i <= n ;i++)
			q.add(i);
		while(q.size()!=1) {

			for(int i=1;i<k; i++) {
				q.add(q.remove());
			}
			q.remove();
		}
		return q.poll();
	}
}
/*
Queue<Integer> q = new LinkedList<>();
		for(int i =1;i<=n;i++)q.add(i);
		while(q.size()!=1)
		{
			// int i =1;
			for(int i = 1;i<k;i++)
				q.add(q.remove());
			q.remove();
		}
		return q.remove();
 */
