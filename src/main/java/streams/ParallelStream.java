/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package streams;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
In case of Parallel stream,4 threads are spawned simultaneously and it internally using Fork and Join pool
 to create and manage threads.Parallel streams create ForkJoinPool instance via static ForkJoinPool.commonPool() method.

Parallel Stream takes the benefits of all available CPU cores and processes the tasks in parallel.
If number of tasks exceeds the number of cores, then remaining tasks wait for currently running task to complete.
 */
public class ParallelStream {

	public static void main(String[] args) {

		System.out.println("=================================");
		System.out.println("Using Sequential Stream");
		System.out.println("=================================");
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		IntStream intArrStream = Arrays.stream(array);
		intArrStream.forEach(s ->
				{
					System.out.println(s + " " + Thread.currentThread().getName());
				}
		);

		IntStream ins= Arrays.stream(array).parallel();
				ins.forEach(S -> System.out.println( S + "    "+Thread.currentThread().getName()));


	}
}
