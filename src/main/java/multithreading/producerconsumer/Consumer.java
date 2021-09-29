/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package multithreading.producerconsumer;

public class Consumer<T> implements  Runnable{
	private PCUsingBlockingQueue pcb;
	public Consumer(PCUsingBlockingQueue pcb) {
		this.pcb=pcb;
		System.out.println(" Consumer Object is "+ this.pcb);
	}
	@Override
	public void run() {
		for(int i=0 ;i <10 ;i++)
		{
			Object t= pcb.take();
			System.out.println( " Consumed " + t);
		}
	}
}
