/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package algo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortAnArrayOfString {
	public static void main(String[] args)
	{
//returns a list view
		List<String> slist = Arrays.asList("Tanu", "Kamal", "Suman", "Lucky", "Bunty", "Amit");
		List<String> slist1 = Arrays.asList("TTanu", "KKamal", "SSuman", "Lucky", "Bunty", "Amit");
		List<String> sortedList = slist.stream().sorted().collect(Collectors.toList());
		sortedList.forEach(System.out::print);
		System.out.println("");
		System.out.println("==============");
		List<String> reverseSortedList = slist.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		reverseSortedList.forEach(System.out::print);
		System.out.println("");
		System.out.println("==============");
		System.out.println(reverseSortedList.get((reverseSortedList.size()-2)));


		List<String> list = Arrays.asList("NYC", "New Delhi");

		/*
		We can use the toArray(T[]) method to copy the list into a newly allocated string array.
		We can either pass a string array as an argument to the toArray() method or pass an empty string type array.
		If an empty array is passed, JVM will allocate memory for the string array.
		 Please note that if no argument is passed to toArray(), it will return an Object array.
		* */
		String[] array = list.toArray(new String[0]);
		System.out.println(" length of array is " + array.length);
		System.out.println(Arrays.toString(array));



	}
}

