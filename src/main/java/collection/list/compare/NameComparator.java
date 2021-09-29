/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package collection.list.compare;

import java.util.Comparator;

public class NameComparator implements Comparator<StudentWithComparable> {

	@Override
	public int compare(StudentWithComparable o1, StudentWithComparable o2) {
		return  o1.name.compareTo(o2.name);
	}
}
