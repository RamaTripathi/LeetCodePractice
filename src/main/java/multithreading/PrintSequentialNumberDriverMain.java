/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package multithreading;

public class PrintSequentialNumberDriverMain {

	public static void main(String[] args) throws InterruptedException {

		Thread t1 =new Thread(new PrintSequentialNumber(1));
		Thread t2 =new Thread(new PrintSequentialNumber(2));
		Thread t3 =new Thread(new PrintSequentialNumber(0));

		t1.start();
		t2.join();
		t2.start();
		t3.join();
		t3.start();
	}
	}
