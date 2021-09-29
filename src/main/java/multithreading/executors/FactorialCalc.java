/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package multithreading.executors;

import java.util.concurrent.Callable;

public class FactorialCalc implements Callable {

	private double number;

	FactorialCalc(double number) {
		this.number=number;
	}
		public Double call() throws Exception {

			this.number = number;
			System.out.println("Calculating factorial with "+Thread.currentThread().getName());
		Thread.sleep(5000);
		double fact = 1;
		for (int i = 2; i <= number; i++) {
			fact *= i;
		}
		return fact;
	}



}