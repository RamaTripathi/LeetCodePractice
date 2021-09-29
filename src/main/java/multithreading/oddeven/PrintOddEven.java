/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package multithreading.oddeven;

public class PrintOddEven {

	boolean odd=true;
	int count=1;
	int  max =20;


	public void printOdd(){
		synchronized (this) {
			while (count < 20) {
				System.out.println(" Inside Odd loop");

			while (!odd) {
				try {
					System.out.println("  Odd waiting Check Inside loop");
					wait();
					System.out.println("  Notifying Odd " + count);
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
				System.out.println(count);
				count++;
				odd = false;
				notify();
		}
		}
	}


	public void printEven() {

		synchronized (this) {
			while (count < 20) {
				System.out.println(" Inside even loop");
			while (odd) {
				try {
					System.out.println(" waiting for Even");
					wait();
					System.out.println("Notified even");
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
				System.out.println(count);
				count++;
				odd = true;
				notify();
			}
	}
	}

}
