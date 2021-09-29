/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package multithreading.oddeven.semaphore;

public class EvenPrinter implements  Runnable{

	SemaphorePrinterClass sep;

	public EvenPrinter(SemaphorePrinterClass sep) {
		this.sep = sep;
	}

	@Override
	public void run() {
		for(int i=2 ;i <10 ;i=i+2)
			sep.printEven(i);
	}
}
