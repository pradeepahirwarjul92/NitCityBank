package com.heg.methods;

import java.util.stream.Stream;

public class StreamBuilderDemo03 {

	public static void main(String[] args) {
		Stream.Builder<String> builder=Stream.builder();
		
		//Adding elements in the stream of string
		Stream<String> stream=builder.add("Pradeep")
										.add("Ahirwar")
										.add("Bhopal")
										.build();
		
		//Displaying the elements in the stream
		
		stream.forEach(System.out::println);
		
		
		
	}
}
