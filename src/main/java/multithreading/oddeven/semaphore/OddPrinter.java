/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package multithreading.oddeven.semaphore;

public class OddPrinter implements  Runnable{
	public OddPrinter(SemaphorePrinterClass sep) {
		this.sep = sep;
	}

	SemaphorePrinterClass sep;
	@Override
	public void run() {
		for(int i=1 ;i <10 ;i=i+2)
			sep.printOdd(i);
	}
}
