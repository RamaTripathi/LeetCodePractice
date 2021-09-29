/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package ProdConUsingBlockingQueue;

public class Consumer implements  Runnable{
	CustomBlockingQueue cbq;

	public Consumer(CustomBlockingQueue cbq ) {
		this.cbq=cbq;
	}
	@Override
	public void run() {
		for(int i= 0;i <= 15; i++) {
		System.out.println(	" consumed " +cbq.take());
		}

	}
}
