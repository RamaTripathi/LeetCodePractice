/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package ProdConUsingBlockingQueue;

public class Driver {

	public static void main(String args[]) {
		CustomBlockingQueue cbq = new CustomBlockingQueue(10);
		Thread p =new Thread( new Producer(cbq));
		Thread q = new Thread( new Consumer(cbq));

		p.start();
		q.start();
	}
}