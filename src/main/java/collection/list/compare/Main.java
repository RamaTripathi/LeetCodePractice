/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package collection.list.compare;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String args[])
	{
		StudentWithComparable st =new StudentWithComparable("RAMA", 32);
		StudentWithComparable st1 = new StudentWithComparable("shyam", 34);
		ArrayList<StudentWithComparable> stList =new ArrayList<StudentWithComparable>();
		stList.add(st);
		stList.add(st1);
		if(st!=st1)
		System.out.println(st1.compareTo(st));
		Collections.sort(stList, new NameComparator());
		System.out.println(stList);

	}
}
