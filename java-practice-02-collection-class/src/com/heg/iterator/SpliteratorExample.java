package com.heg.iterator;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorExample {
	
	public static void main(String[] args) {
		
		List<String> names=Arrays.asList("ALICE","BOB","CHERRY");
		
		Spliterator<String> spl= names.spliterator();
		spl.forEachRemaining(System.out::println);
	}

}
