/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveListItems {

	public static void main(String[] args){
		List<String> list = new ArrayList<>(List.of("john", "doe", "mary", "public"));
		List<String> list1 = new ArrayList<>(List.of("john", "doe", "mary", "public"));
		List<String> list2 = new ArrayList<>(List.of("john", "doe", "mary", "public"));
		//removeItems(list);
		removeUsingIterator(list1);
		System.out.println(list1);
	}

	public static void removeItems(List<String> names){
		for(String name : names) {
			if(name.equalsIgnoreCase("john"))
				names.remove("john");
		}
	}

	public static void removeUsingIterator(List<String> names){
		Iterator<String> it = names.iterator();
		List<String> list3 = new ArrayList<>();
	 	while(it.hasNext()) {
			 if(it.next().equals("john"))
				 it.remove();
		}
		ListIterator<String> stringListIterator = names.listIterator();
		  stringListIterator.forEachRemaining(list3::add);
		String s1=   list3.stream().collect(Collectors.joining("["));
		System.out.println(s1);

		Stream<String> aPublic = list3.stream().filter(s -> s.equals("public"));
		//ßnames.remove(aPublic);

		int[] a = new int[10];


	}


}
