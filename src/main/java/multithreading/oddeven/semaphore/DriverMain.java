/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package multithreading.oddeven.semaphore;

public class DriverMain {

	public static void main(String[] args) {
		SemaphorePrinterClass sp = new SemaphorePrinterClass();
		Thread odd = new Thread(new OddPrinter(sp),"Odd");
		Thread even = new Thread(new EvenPrinter(sp),"Even");
		odd.start();
		even.start();
	}
}
