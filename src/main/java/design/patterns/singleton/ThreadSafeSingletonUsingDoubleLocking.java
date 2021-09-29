/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package design.patterns.singleton;

public class ThreadSafeSingletonUsingDoubleLocking {

	//Private static variable of the same class that is the only instance of the class.
	private static ThreadSafeSingletonUsingDoubleLocking instance;

	private ThreadSafeSingletonUsingDoubleLocking() {}

	public static ThreadSafeSingletonUsingDoubleLocking getInstance() {
		if(instance==null) {
			synchronized (ThreadSafeSingletonUsingDoubleLocking.class){
				instance=new ThreadSafeSingletonUsingDoubleLocking();
				System.out.println(" thread here " + Thread.currentThread().getName());
			}
		}
		return instance;

	}
}
