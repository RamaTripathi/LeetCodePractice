/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package multithreading;

/*
he reason is that because start method creates a new thread and calls the code written
inside the run method on a new thread while calling the run method
executes that code on the same thread.
 Hello from  Thread-0
 Hello from  main

 */
public class StartAndRunDiff {

	public static void main(String args[]) {

		Thread startTh=new Thread(new MyThread());
		Thread runTh= new Thread(new MyThread());

		startTh.start();
		runTh.run();


	}
}
