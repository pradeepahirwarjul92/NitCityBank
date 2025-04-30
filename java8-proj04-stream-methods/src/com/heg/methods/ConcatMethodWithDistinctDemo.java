package com.heg.methods;

import java.util.stream.Stream;

public class ConcatMethodWithDistinctDemo {

	public static void main(String[] args) {
		 // Creating two Streams 
        Stream<String> stream1 = Stream.of("Geeks", "for", "GeeksforGeeks"); 
        Stream<String> stream2 = Stream.of("GeeksQuiz", "GeeksforGeeks", "for"); 
        
        Stream.concat(stream1,stream2)
        		.distinct()
        		.forEach(e -> System.out.println(e + " "));
	}
}
