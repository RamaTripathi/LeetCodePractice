/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
//Without Generics, we can store any type of objects.
	public static void main(String args[]) {
		List list = new ArrayList();
		list.add(10);
		list.add("10");
		System.out.println(list);
		//Before Generics, we need to type cast.
		int s = (int) list.get(1);
		//Compile-Time Checking: It is checked at compile time so problem will not occur at runtime.
		// The good programming strategy says it is far better to handle the problem at compile time than runtime.

		List<Integer> m=new ArrayList<Integer>();
		m.add(2);
	//	m.add("rama");//Compile time error

		Integer[] intArray = { 10, 20, 30, 40, 50 };
		Character[] charArray = { 'J', 'A', 'V', 'A', 'T','P','O','I','N','T' };

		System.out.println( "Printing Integer Array" );
		printArray( intArray  );

		System.out.println( "Printing Character Array" );
		printArray( charArray );
	}
/*
ike the generic class, we can create a generic method that can accept any type of arguments.
Here, the scope of arguments is limited to the method where it is declared.
It allows static as well as non-static methods.
 */
	public static < E > void printArray(E[] elements) {
		for ( E element : elements){
			System.out.println(element );
		}
		System.out.println();
	}
}

/*
Unbounded Wildcards
The unbounded wildcard type represents the list of an unknown type such as List<?>.
This approach can be useful in the following scenarios: -
When the given method is implemented by using the functionality provided in the Object class.
When the generic class contains the methods that don't depend on the type parameter.

lower bounder
The purpose of lower bounded wildcards is to restrict the unknown type to be a specific type or a supertype of that type.
 It is used by declaring wildcard character ("?") followed by the super keyword, followed by its lower bound.

Syntax
List<? super Integer>
Here,


Suppose, we want to write the method for the list of Integer and its supertype (like Number, Object).
Using List<? super Integer> is suitable for a list of type Integer or any of its
superclasses whereas List<Integer> works with the list of type Integer only.
So, List<? super Integer> is less restrictive than List<Integer>.

 */
/*
The type parameters naming conventions are important to learn generics thoroughly.
 The common type parameters are as follows:

T - Type
E - Element
K - Key
N - Number
V - Value


 */