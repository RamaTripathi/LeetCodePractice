/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package multithreading;

public class MyThread implements Runnable{

	@Override
	public void run() {
		System.out.println(" Hello from  " + Thread.currentThread().getName());
	}
}
