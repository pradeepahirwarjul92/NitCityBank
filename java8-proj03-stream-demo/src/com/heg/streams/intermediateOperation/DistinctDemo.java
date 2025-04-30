package com.heg.streams.intermediateOperation;

import java.util.Arrays;
import java.util.List;

public class DistinctDemo {

	public static void findDistinctElements(List<Integer> intList) {
		// Display message only
		System.out.println("\n\nDistinct List is ");

		intList.stream().distinct().forEach(e->System.out.println(e));
	}

	public static void main(String[] args) {
		// creating an object of list class by declaring a list of integers

		List<Integer> intList = Arrays.asList(1,5,1,6,6);

		
		// Calling the method to print the sorted list

		findDistinctElements(intList);
	}
}
