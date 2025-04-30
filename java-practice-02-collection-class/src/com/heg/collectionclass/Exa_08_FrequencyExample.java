package com.heg.collectionclass;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exa_08_FrequencyExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Apple", "Banana", "Apple", "Cherry", "Apple");
		
		int freq=Collections.frequency(list,"Apple");
		System.out.println("FrequencyExample.main()  " +freq);
	}
	
}
