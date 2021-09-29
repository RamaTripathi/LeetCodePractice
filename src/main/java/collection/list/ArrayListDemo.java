/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package collection.list;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();
		myList.add("AWS");
		myList.add("Java");
		myList.add("Python");
		myList .add("Blockchain");
		System.out.println("Before Reversing");
		System.out.println(myList.toString());
		Collections.reverse(myList);
		System.out.println("After Reversing");
		System.out.println(myList);
		ListIterator<String> stringListIterator = myList.listIterator();
		while(stringListIterator.hasNext())
		{
			System.out.println(stringListIterator.next());
		}

		while(stringListIterator.hasPrevious())
		{
			System.out.println(stringListIterator.previous());
		}

		for( String a : myList)
			System.out.println(a);


	}
}
