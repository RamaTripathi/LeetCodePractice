/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package multithreading.producerconsumer;

public class Producer<T> implements  Runnable {
	private PCUsingBlockingQueue pcb;

	public  Producer(PCUsingBlockingQueue pcb)
	{
		this.pcb= pcb;
		System.out.println(" Producer Object is "+ this.pcb);
	}
	@Override
	public void run() {
		for( int i =0 ; i< 10 ; i++)
		{

			pcb.put(i*100);
			System.out.println( " Produced " + i);

		}

	}
}
