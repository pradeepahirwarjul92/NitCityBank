package com.heg.methods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AllMatchMethodDemo {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3, 4, 6, 12, 15);

		boolean answer = list.stream().allMatch(n -> n % 3 == 0);

		System.out.println(answer);
		
		
	}
}
