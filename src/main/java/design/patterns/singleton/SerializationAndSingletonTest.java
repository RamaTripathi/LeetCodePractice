/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package design.patterns.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializationAndSingletonTest {

	public static void main (String args[]) throws IOException, ClassNotFoundException {
		SerializationAndSingleton instanceOne= SerializationAndSingleton.getInstance();
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
		out.writeObject(instanceOne);

		ObjectInput objectInput= new ObjectInputStream(new FileInputStream("filename.ser"));
		SerializationAndSingleton instanceTwo = (SerializationAndSingleton) objectInput.readObject();
		objectInput.close();

		System.out.println("instanceOne hashCode="+instanceOne.hashCode());
		System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());

	}
}
