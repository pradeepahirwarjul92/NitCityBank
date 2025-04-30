package com.heg.collectionclass;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exa_10_MinMaxExample {
	
	public static void main(String[] args) {
		List<Integer> numbers= Arrays.asList(10,30,20,50,44);
		
		int min=Collections.min(numbers);
		int max=Collections.max(numbers);
		
		System.out.println("==MIN== " +min);
		System.out.println("==MAX== " +max);
	}

}
