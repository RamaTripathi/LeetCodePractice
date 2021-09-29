/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertStreamsToList {

	public static void main(String args[]) {
		Stream<String> countriesStream = Stream.of("India", "China", "Australia", "Ireland", "Canada");
		Stream<String> countriesStream1 = Stream.of("India", "China", "Australia", "Ireland", "Canada");
		Stream<String> countriesStream2 = Stream.of("India", "China", "Australia", "Ireland", "Canada");
		Stream<String> countriesStream3 = Stream.of("India", "China", "Australia", "Ireland", "Canada");
		List<String> countryList= countriesStream.collect(Collectors.toList());
		System.out.println(countryList);
		usingCollectorsToCollection(countriesStream1);
		usingForEach(countriesStream2);
		streamFilterApiUsage(countriesStream3);
		Employee e1= new Employee("Ram", 31, Arrays.asList("NewYork","NewDelhi"));
		Employee e2 =new Employee("Shyam", 32, Arrays.asList("NewYork","NewDelhi"));
		Employee e3 =new Employee("Alphs", 29,Arrays.asList("NewYork","NewDelhi"));
		List<Employee> el= new ArrayList<>();
		el.add(e1);
		el.add(e2);
		el.add(e3);
		demoStreamSort(el);
		demoStreamSortUsingMethodRefrence(el);

	}

	/*
	Using Collectors.toCollection()
You can pass Collectors.toCollection() to Stream.collect() method to convert Stream to List in java.
This is similar to previous approach, but it gives you more control over type of collection you want.
	* */

	private static void usingCollectorsToCollection(Stream<String> countriesStream) {
		List<String> listOfCountiesName= countriesStream.collect(Collectors.toCollection(LinkedList::new));
		System.out.println(listOfCountiesName);
	}

	private static void usingForEach(Stream<String> countriesStream1) {
		List<String> listOfCountiesName =new ArrayList<>();
		countriesStream1.forEach(listOfCountiesName::add);
		System.out.println(listOfCountiesName);
	}

	private static void streamFilterApiUsage(Stream<String> countriesStream3) {
		LinkedList<String> listOfCountiesName= countriesStream3.filter(country ->  country.startsWith("I")).collect(Collectors.toCollection(LinkedList::new));
		System.out.println(listOfCountiesName);
	}

	private static void demoStreamSort(List<Employee> el) {
		List<Employee> sortedEl= el.stream().sorted((e1,e2) -> e1.getAge()-e2.getAge()).collect(Collectors.toList());
		System.out.println(sortedEl);
	}

	private static void demoStreamSortUsingMethodRefrence(List<Employee> el) {
		List<Employee> sortedEl= el.stream().sorted((Comparator.comparing(Employee::getAge))).collect(Collectors.toList());
		System.out.println(sortedEl);
	}

}
