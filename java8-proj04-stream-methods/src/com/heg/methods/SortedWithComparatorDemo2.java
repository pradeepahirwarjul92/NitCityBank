package com.heg.methods;

import java.util.stream.Stream;

public class SortedWithComparatorDemo2 {

	public static void main(String[] args) {
		String[] array = { "AA", "ABA", "AAX", "AAT", "AAB" };

		System.out.println("The sorted stream is :: ");

		Stream.of(array).sorted(
				(str1, str2) -> Character.compare(str1.charAt(str1.length() - 1), 
													str2.charAt(str2.length() - 1)))
				.forEach(System.out::println);
	}

}
