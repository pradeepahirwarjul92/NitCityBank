package com.heg.program;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class ConvertSetToStream {

	public static <T> Stream<T> convertSetToStream(Set<T> set) {
		return set.stream();
	}

	public static void main(String[] args) {

		// Create a set of String
		Set<Integer> setOfInteger = new HashSet<>(Arrays.asList(2, 4, 6, 8, 10));

		// Print the set of Integer

		System.out.println("Set of Integer :: " + setOfInteger);

		// Convert Set of stream
		Stream<Integer> streamOfInteger=	convertSetToStream(setOfInteger);
		System.out.println("Stream of Integer :: " +Arrays.toString(streamOfInteger.toArray()));
	}

}
