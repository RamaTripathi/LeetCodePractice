/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.UIDefaults.LazyInputMap;

public class StreamAPIs {

	public static void main(String args[]) {
		List<String> stringList = Arrays.asList("John", "Martin", "Mary", "Steve");

		//mapAPIExample(stringList);
		//LazyEvaluationMap();
	//	orderOfOperations();
		flatMapAPI();
		
		reduceApiExample();
	}

	/*
	The reduce operation combines all elements of Stream and produces single result.
	Java 8 has three overloaded version of reduce method.


	 */
	private static void reduceApiExample() {
		Employee e1= new Employee("Ram", 31, Arrays.asList("NewYork","NewDelhi"));
		Employee e2 =new Employee("Shyam", 32, Arrays.asList("NewYork","NewDelhi"));
		Employee e3 =new Employee("Alphs", 29,Arrays.asList("NewYork","NewDelhi"));
		List<Employee> els= new ArrayList<Employee>();
		els.add(e1);
		els.add(e2);
		els.add(e3);

		Optional<Employee> e13=els.stream().reduce((e11,e22 ) -> (e11.getAge() > e22.getAge()) ? e22:e11);
		System.out.println(" Young Employees " + e13);

		int sumAge = els.stream()
				.mapToInt(Employee::getAge)
				.reduce(0, (age1,age2)-> (age1 + age2));

		System.out.println("Sum of ages of all Employees: "+sumAge);


		long empCountStartJ = els.stream()
				.map(Employee::getName)
				.filter(s -> s.startsWith("J"))
				.count();
		System.out.println(empCountStartJ);

		boolean allMatch = els.stream()
				.allMatch(e ->e.getAge()>18);

		System.out.println("Are all the employess adult: " +allMatch);
	}

	private static void flatMapAPI() {
		Employee e1= new Employee("Ram", 31, Arrays.asList("NewYork","NewDelhi"));
		Employee e2 =new Employee("Shyam", 32, Arrays.asList("NewYork","NewDelhi"));
		Employee e3 =new Employee("Alphs", 29,Arrays.asList("NewYork","NewDelhi"));

		List<Employee> els= new ArrayList<Employee>();
		els.add(e1);
		els.add(e2);
		els.add(e3);

		List<String> listOFcITIES=els.stream().flatMap(e -> e.getCities().stream()).collect(Collectors.toList());
		System.out.println("listOFcITIES " + listOFcITIES);
	}

	private static void orderOfOperations() {
		Stream<String> nameStream = Stream.of("mohan","john","vaibhav","amit");
		Stream<String> nameStartJ = nameStream.map(
				(s) ->
				{
					System.out.println("Map: "+s);
					return s.toUpperCase();

				})
				.filter(
						(s) ->
						{
							System.out.println("Filter: "+s);
							return s.startsWith("J");
						}
				);

		Optional<String> findAny = nameStartJ.findAny();
		System.out.println("Final output: "+findAny.get());

	}

	private static void mapAPIExample(List<String> stringList) {
	stringList.stream().map((s) -> s.toUpperCase(Locale.ROOT)).forEach(System.out::println);

	//usingStreamGenerate();
	//usingStreamIterate();

	}

	private static void LazyEvaluationMap() {
		Stream<String> nameStream = Stream.of("mohan","john","vaibhav","amit");
		Stream<String> nameStartJ = nameStream.map(String::toUpperCase)
				.peek( e -> System.out.println("** "+e))
				.filter(s -> s.startsWith("J"));

		System.out.println("Calling terminal operation: count");
		long count = nameStartJ.count();
		System.out.println("Count: "+ count);
	}

	private static void usingStreamIterate() {
		Stream<Integer> intStream= Stream.iterate(100 , n -> n+1).limit(10);
		intStream.forEach(System.out::println);
	}

	private static void usingStreamGenerate() {
		Stream<Integer> intStream=Stream.generate(() -> 1).limit(5);
		intStream.forEach(System.out::println);
	}

}

