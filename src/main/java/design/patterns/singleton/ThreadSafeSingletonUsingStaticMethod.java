/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package design.patterns.singleton;

public class ThreadSafeSingletonUsingStaticMethod {

	//Private static variable of the same class that is the only instance of the class.
	private static ThreadSafeSingletonUsingStaticMethod instance;

	//Private constructor to restrict instantiation of the class from other classes.
	private ThreadSafeSingletonUsingStaticMethod() {}

	//Public static method that returns the instance of the class, this is the global access point
	// for outer world to get the instance of the singleton class.
	public static synchronized ThreadSafeSingletonUsingStaticMethod getInstance() {
		if(instance==null)
				return instance= new ThreadSafeSingletonUsingStaticMethod();
		else
			return instance;
	}

}
/*
Above implementation works fine and provides thread-safety but it reduces the performance
because of the cost associated with the synchronized method, although we need it only for
 the first few threads who might create the separate instances (Read: Java Synchronization).
  To avoid this extra overhead every time, double checked locking principle is used.
 */