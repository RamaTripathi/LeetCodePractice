/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package design.patterns.singleton;

import java.io.Serializable;

public class SerializationAndSingleton implements Serializable {

	private static final long serialVersionUID = -7604766932017737115L;

	private SerializationAndSingleton(){}

	private static class SingletonHelper{
		private static final SerializationAndSingleton instance = new SerializationAndSingleton();
	}

	public static SerializationAndSingleton getInstance(){
		return SingletonHelper.instance;
	}


	protected Object readResolve() {
		return getInstance();
	}

}
