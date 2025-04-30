package com.heg.collectionclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exa_01_CollectionExample {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(5, 2, 9, 1, 7));

		System.out.println("CollectionExample.main()" + numbers);

		// sorting the list in natural order

		Collections.sort(numbers);

		System.out.println("Sorted List :: " + numbers);

		// Sorting in reverse order

		Collections.sort(numbers, Collections.reverseOrder());

		System.out.println("Reverse Sorted List :: " + numbers);

	}

}
