/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package design.patterns.singleton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {

	public static void main(String[] args) {
		ThreadSafeSingletonUsingDoubleLocking instanceOne = ThreadSafeSingletonUsingDoubleLocking.getInstance();
		ThreadSafeSingletonUsingDoubleLocking instanceTwo = null;
		try {
			Constructor[] constructors = ThreadSafeSingletonUsingDoubleLocking.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				//Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				instanceTwo = (ThreadSafeSingletonUsingDoubleLocking) constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
	}

}
