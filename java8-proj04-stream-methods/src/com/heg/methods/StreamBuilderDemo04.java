package com.heg.methods;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBuilderDemo04 {
	
	public static void main(String[] args) {
		// Using Stream builder()
		Stream.Builder<String> builder = Stream.builder();

		// Adding elements in the stream of Strings
		Stream<String> stream = builder.add("GEEKS")
										.add("for")
										.add("Geeks")
										.add("GeEKSQuiz")
										.build();

		// Converting elements to Lower Case
		// and storing them in List list
		
		List<String> list=stream
							.map(String::toLowerCase)
							.collect(Collectors.toList());
		
		System.out.println(list);
	}
	
	
}
