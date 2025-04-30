package com.heg.collectionclass;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exa_06_SecondLargest {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(5, 12, 8, 21, 17);

		Collections.sort(numbers, Collections.reverseOrder());

		System.out.println("Second Largest Number " + numbers.get(1));
	}

}
