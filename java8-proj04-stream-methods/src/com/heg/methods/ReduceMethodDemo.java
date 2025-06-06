package com.heg.methods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceMethodDemo {

	public static void main(String[] args) {
		// Creating a list of strings

		List<String> words = Arrays.asList("GFG", "Geeks", "for", "GeeksQuiz", "GeeksforGeeks");

		// Using reduce to find the longest string in the list

		// Using reduce to find the longest string in the list
		Optional<String> longestString = words.stream()
				.reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2);

		// Displaying the longest String
		longestString.ifPresent(System.out::println);
	}

}
