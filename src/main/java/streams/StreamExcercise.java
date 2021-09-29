/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamExcercise {
	public static void main(String args[]) {
		List<String> stringList = Arrays.asList("John", "Martin", "Mary", "Steve");
		List<Integer> integerList=Arrays.asList(100,30,200,4,999,45);
		Optional<Integer> reduce = integerList.stream().reduce((a1, a2) -> (a1 > a2 ? a1 : a2));
		System.out.println(reduce);

	}
}
