package com.heg.program;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PrimitiveArrayTOStream2 {

	public static IntStream convertArrayToStream(int array[]) {
		return IntStream.of(array);
	}

	public static void main(String[] args) {

		// Create an Array

		int[] array = new int[] { 3, 2, 1, 5, 4 };

		// print the array

		System.out.println(Arrays.toString(array));

		// convert the array to stream

		IntStream stream = convertArrayToStream(array);
		System.out.println(Arrays.toString(stream.toArray()));
	}
}
