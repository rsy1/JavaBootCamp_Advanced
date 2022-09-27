package bk4_04UsingLInkedLists;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodsAndVarargs {

	public static void main(String[] args) {
		List<Integer> ints = GenericMethodsAndVarargs.toList(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 });
		System.out.println(ints);
		List<String> words = GenericMethodsAndVarargs.toList(new String[] { "hello", "world" });
		System.out.println(words);
	}

	/*
	 * The static method toList accepts an array of type T[] and returns a list of
	 * type List<T>, and does so for any type T. This is indicated by writing <T> at
	 * the beginning of the method signature, which declares T as a new type
	 * variable. A method which declares a type variable in this way is called a
	 * generic method. The scope of the type variable T is local to the method
	 * itself; it may appear in the method signature and the method body, but not
	 * outside the method.
	 */
	public static <T> List<T> toList(T... arr) {
		List<T> list = new ArrayList<T>();
		for (T elt : arr)
			list.add(elt);
		return list;
	}

}
