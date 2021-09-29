/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package design.patterns.singleton;

public class Task implements Runnable{

	String name;
	public Task(String name) {
		this.name=name;
		Thread.currentThread().setName(name);
	}
	@Override
	public void run() {
		ThreadSafeSingletonUsingStaticMethod tsf = ThreadSafeSingletonUsingStaticMethod.getInstance();
		System.out.println(" Thread "+ name  + " === " + tsf);

	}

	public String getName() {
		return name;
	}
}
