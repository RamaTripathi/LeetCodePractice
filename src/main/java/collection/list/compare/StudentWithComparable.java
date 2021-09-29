/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package collection.list.compare;

public class StudentWithComparable implements Comparable<StudentWithComparable>{

	String name;
	int age;

	public StudentWithComparable(String name, int age) {
		this.name = name;
		this.age = age;
	}


	@Override
	public String toString() {
		return "StudentWithComparable{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	public int compareTo(StudentWithComparable st) {
		return this.age- st.age;
	}

}
