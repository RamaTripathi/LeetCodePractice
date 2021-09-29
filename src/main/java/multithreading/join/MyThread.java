/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package multithreading.join;

public class MyThread extends Thread {

	String name;

	public MyThread (String name) {
		this.name=name;
	}
	public void run() {
		if(this.name=="T1") {
			try {
				System.out.println(this.name + "is sleeping");
				Thread.sleep(2000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(this.name+" thread is running " );
	}
}
