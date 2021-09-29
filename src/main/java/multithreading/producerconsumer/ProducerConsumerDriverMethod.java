/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package multithreading.producerconsumer;

public class ProducerConsumerDriverMethod {

	public static void main( String args[]) {
		PCUsingBlockingQueue pcb= new PCUsingBlockingQueue();
		Thread producerThread = new Thread(new Producer(pcb));
		Thread consumerThread = new Thread(new Consumer(pcb));

		producerThread.start();
		consumerThread.start();
	}
}
