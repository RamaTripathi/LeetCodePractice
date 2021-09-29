/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package design.patterns.singleton;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class SingletonMain {
	public static void main(String args[]) {

		//testThreadSafeSingletonUsingStaticMethod();
		testThreadSafeSingletonUsingDoubleLockingMethod();

	}

	private static void testThreadSafeSingletonUsingDoubleLockingMethod() {
		ThreadPoolExecutor tp = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
		for (int i = 1; i <= 5; i++)
		{
			Task task = new Task("Task " + i);
		//	System.out.println("Created : " + task.getName());
			tp.submit(task);
		}

	}

	private static void testThreadSafeSingletonUsingStaticMethod() {
		Thread t1 =new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(" Hello from T1");
				ThreadSafeSingletonUsingStaticMethod tsf = ThreadSafeSingletonUsingStaticMethod.getInstance();
				System.out.println(tsf);
			}
		});

		t1.setName("T1 ");
		Thread t2 =new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(" Hello from T2");
				ThreadSafeSingletonUsingStaticMethod tsf = ThreadSafeSingletonUsingStaticMethod.getInstance();
				System.out.println(tsf);
			}
		});

		t2.setName("T2");
		t1.start();
		t2.start();
	}
}
