package com.heg.collectionclass;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exa_11_KthSmallest {

	public static int findKthSmallest(List<Integer> numbers, int k) {
		Collections.sort(numbers);
		return numbers.get(k - 1);
	}

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12, 3, 5, 7, 19);
		int k = 3;
		System.out.println(k + "Exa_11_KthSmallest.main() :: " + findKthSmallest(numbers, k));

	}

}
