/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class PowerFunctions {


	public static Integer power(int a) {
		return a*a;
	}

	public static List<Integer> calculatePowOf2ForList( List<Integer> list, Function<Integer,Integer> function) {
		List<Integer> powerNumbers =new ArrayList<>();
		for(Integer num : list) {
			Integer pow2 = function.apply(num);
			powerNumbers.add(pow2);
		}
		return powerNumbers;
	}
}
