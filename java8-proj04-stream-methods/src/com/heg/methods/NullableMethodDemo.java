package com.heg.methods;

import java.util.stream.Stream;

public class NullableMethodDemo {
	
	public static void main(String[] args) {
		 // Create a stream with null 
        Stream<String> value 
            = Stream.ofNullable(null); 
        
		System.out.println("Value of Stream :: ");
		
		value.forEach(System.out::println);
		
	}

}
