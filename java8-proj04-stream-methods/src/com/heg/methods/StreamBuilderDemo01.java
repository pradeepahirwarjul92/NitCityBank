package com.heg.methods;

import java.util.stream.Stream;

public class StreamBuilderDemo01 {
	
	public static void main(String[] args) {
		
		//Using Stream builder 
		Stream.Builder<String> builder=Stream.builder();
		
		//Adding elements in the stream of strings
		
		Stream<String> stream=builder.add("Geeks").build();
		
		//Displaying the elements in the stream
		
		stream.forEach(System.out::println);
		
	}

}
