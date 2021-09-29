/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package multithreading.producerconsumer;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;

public class PCUsingBlockingQueue<T> {

	private List<Integer> pcQueue;
	int limit=10;

	public PCUsingBlockingQueue() {
		pcQueue= new LinkedList<Integer>();
		int limit=10;
	}
	public synchronized  void put(int item) {

		try {
			Thread.sleep(5000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		while(pcQueue.size()== limit)
		{
			try {
				wait();
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if(pcQueue.isEmpty()) {
			notifyAll();
		}
		pcQueue.add(item);
	}

	public synchronized int take() {
		while(pcQueue.isEmpty()) {
			try {
				wait();
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if(pcQueue.size()==limit){
			notifyAll();
		}
		return pcQueue.remove(0);
	}

}
