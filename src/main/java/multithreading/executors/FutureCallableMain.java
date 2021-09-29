/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package multithreading.executors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureCallableMain {

	public static void main(String args[]) {
		ExecutorService es = Executors.newFixedThreadPool(4);
		System.out.println("Start : ");
		Future powerFuture20;

		powerFuture20=es.submit(new FactorialCalc(20));
		Future factorialFuture20;
		Future powerFuture25;
		Future factorialFuture25;

		factorialFuture25=es.submit(new FactorialCalc(25));
		factorialFuture20=es.submit(new FactorialCalc(20));

		powerFuture25=es.submit(new FactorialCalc(25));
		try {
			System.out.println("Square of "+25+" : "+powerFuture25.get());
			System.out.println("Square of "+20+" : "+powerFuture20.get());
			System.out.println("Factorial of "+20+" : "+factorialFuture20.get());

			es.shutdown();
			System.out.println("Factorial of "+25+" : "+factorialFuture25.get());
		} catch (InterruptedException | ExecutionException e) {

			e.printStackTrace();
		}
		System.out.println("Done");
	}

}
