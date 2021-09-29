/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package multithreading.join;

public class JoinDriverMethod {

	public static void main( String args[]) {
		MyThread t1= new MyThread("T1");
		MyThread t2= new MyThread("T2");
		MyThread t3= new MyThread("T3");

		t1.start();
		t2.start();
		try {
			t2.join();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		t3.start();


	}
}
