package com.heg.collectionclass;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exa_09_ImmutableListExample {

	public static void main(String[] args) {

		List<String> fruits = Collections.unmodifiableList(Arrays.asList("Apple", "Banana", "Cherry"));
		System.out.println("ImmutableListExample.main()" + fruits);

		// fruits.add("Mango");

		System.out.println(fruits);
	}

}
