package com.heg.collectionclass;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exa_07_MostFrequentElement {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
		String mostFrequent = null;
		int maxCount = 0;

		for (String word : words) {

			int count = Collections.frequency(words, word);
			if (count > maxCount) {

				maxCount = count;
				mostFrequent = word;
			}

		}

		System.out.println("Most Frequent Element: " + mostFrequent + " (Count: " + maxCount + ")");

	}
}
