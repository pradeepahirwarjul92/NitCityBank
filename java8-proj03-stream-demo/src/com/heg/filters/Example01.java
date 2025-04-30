package com.heg.filters;

import java.util.stream.Stream;

public class Example01 {
	
	public static void main(String[] args) {

		//filters a stream by even elements
		filterByEvenElements();
		System.out.println("================");
	}
	
	
	public static void filterByEvenElements() {
		
		//create integer array 
		Integer[] myArray=new Integer[] {1,4,5,7,9,10};
		
		//create a stream and filter by even numbers predicate 
		
		Stream.of(myArray)
				.filter(x -> x%2==0)
				.forEach(System.out::println);
	}

}
