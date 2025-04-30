package com.heg.methods;

import java.util.Arrays;
import java.util.List;

public class AnyMatchMethod {

	public static void main(String[] args) {

		// Creating a list of Integer

		List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 8);

        boolean hasEven = numbers.stream().anyMatch(n -> n % 2 == 0);

        System.out.println("Contains even number ? \n\n" + hasEven);
	}

}
