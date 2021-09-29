/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package ProdConUsingBlockingQueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CustomBlockingQueue {

	private List<Integer> pcQueue;
	int max;

	public CustomBlockingQueue(int max) {
		this.max=max;
		this.pcQueue=new ArrayList<>();
	}

	public synchronized void put(int data) {
		while (pcQueue.size() == max) {
			System.out.println(" Put operation Reached max size");
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
		System.out.println(" Put Operation data " +data);
		pcQueue.add(data);
	}

	public synchronized int take() {
		while(pcQueue.size()==0) {
			System.out.println(" Take operation Reached 0 size");
			try {
				wait();
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if(pcQueue.size()==max){
			notifyAll();
		}
		return pcQueue.remove(0);
	}

}
