package com.heg.collectionclass;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exa_02_DisjointExample {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("A", "B", "C");
		List<String> list2 = Arrays.asList("D", "E", "F");

		boolean noCommonElements = Collections.disjoint(list1, list2); // Returns true if no elements are common
		System.out.println("Are lists disjoint ? " + noCommonElements);
	}

}
