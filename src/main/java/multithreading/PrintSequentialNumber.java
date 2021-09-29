/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package multithreading;

import static java.lang.Thread.sleep;

public class PrintSequentialNumber implements  Runnable{

	public int PRINT_NUMBERS_UPTO=10;
	static int number=1;
	static Object lockOb=new Object();
	int remainder;

	public   PrintSequentialNumber (int remainder) {
		this.remainder=remainder;
	}
	@Override
	public void run() {
		while (number<PRINT_NUMBERS_UPTO) {
			synchronized (lockOb) {
				while ( number %3 != remainder) {
					try {
						lockOb.wait();
					}
					catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + " "  +number);
				number++;
				lockOb.notifyAll();
			}
		}

	}
}
