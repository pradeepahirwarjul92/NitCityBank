package com.heg.collectionclass;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exa_13_RemoveDuplicate {

	public static void main(String[] args) {
		List<String> listWithDuplicates = Arrays.asList("apple", "banana", "apple", "cherry", "banana");
		Set<String> uniqueSet = new HashSet(listWithDuplicates);
		System.out.println(":: unique element :: " + uniqueSet);

	}
}
