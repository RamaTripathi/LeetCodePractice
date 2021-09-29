/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package multithreading.oddeven;

public class PrintEvenOddMain {

	public static void main(String args) {
		PrintOddEven pOe= new PrintOddEven();
		Thread  oDDt = new Thread(new Runnable() {
			@Override
			public void run() {
				pOe.printOdd();
			}
		});

		Thread evenT = new Thread(new Runnable() {
			@Override
			public void run() {
				pOe.printEven();
			}
		});

		oDDt.start();
		evenT.start();
	}
}
