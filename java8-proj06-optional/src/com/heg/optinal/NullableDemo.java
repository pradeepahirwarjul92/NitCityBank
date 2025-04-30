package com.heg.optinal;

import java.util.Optional;

public class NullableDemo {

	public static void main(String[] args) {

		// Create a Optional
		Optional<Integer> op1 = Optional.ofNullable(9455);

		// print value

		System.out.println("Optional 1 :: " + op1);

		// create a optional

		Optional<String> op2 = Optional.ofNullable(null);

		// print value

		System.out.println("Optional 2 :: " + op2);

	}

}
