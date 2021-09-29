/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package streams;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	@Override
	public String toString() {
		return "Employee{" +
				"name='" + name + '\'' +
				", Age=" + Age +
				", cities=" + cities +
				'}';
	}

	public  String name;

	public int Age;
	List<String> cities;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public List<String> getCities() {
		return cities;
	}

	public void setCities(List<String> cities) {
		this.cities = cities;
	}



	public Employee(String name, int age, List<String> cities ){
		this.name = name;
		Age = age;
		this.cities= cities;
	}


}
