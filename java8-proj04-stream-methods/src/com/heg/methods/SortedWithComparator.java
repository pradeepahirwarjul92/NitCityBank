package com.heg.methods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedWithComparator {

	public static void main(String[] args) {

		// Creating a list of Integers
		List<Integer> list = Arrays.asList(5, -10, 7, -18, 23);

		System.out.println("==============Using only sorted===============");

		list.stream().sorted().forEach(System.out::println);

		System.out.println();
		System.out.println("==============Using only sorted with comparator reverse order===============");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

	}

}
