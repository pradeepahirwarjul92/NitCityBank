package com.heg.filters;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class FilterByObjectIndex {
	
	public static void filterByIndexUsingAtomice() {
		String [] myArray=new String[] {"stream",   "is",  "a", 
                						"sequence", "of",  "elements", 
                						"like",     "list"};
		
		//create a stream on myArray
		
		Stream<String> myStream=Stream.of(myArray);
		
		//create an atomicInteger
		
		AtomicInteger i=new AtomicInteger(0);
		
		//increment the i value by 1 everytime if it is even, print the current elemetn
		
		myStream.filter(x -> i.getAndIncrement() %2 ==0 )
						.forEach(System.out::println);
		
	}
	
	public static void main(String[] args) {
		filterByIndexUsingAtomice();
	}

}
