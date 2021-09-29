/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package multithreading.oddeven.semaphore;

import java.util.concurrent.Semaphore;

public class SemaphorePrinterClass {

	private Semaphore semEven = new Semaphore(0);
	private Semaphore semOdd = new Semaphore(1);


	void printEven(int num) {
		try {
			semEven.acquire();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(Thread.currentThread().getName() + num);
		semEven.release();
	}

	void printOdd( int num) {

		try {
			semOdd.acquire();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + num);
		semOdd.release();
	}
}
