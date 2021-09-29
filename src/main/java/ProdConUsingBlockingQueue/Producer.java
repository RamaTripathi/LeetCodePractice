/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package ProdConUsingBlockingQueue;

public class Producer implements  Runnable{
	CustomBlockingQueue cbq;

	public Producer(CustomBlockingQueue cbq) {
		this.cbq =cbq;

	}

	@Override
	public void run() {
		for(int i=0 ;i <=15 ;i ++) {
			cbq.put(i);
		}
	}
}
