package com.heg.methods;

import java.util.stream.Stream;

public class ConcatMethodDemo {

	public static void main(String[] args) {
		Stream<String> stream1 = Stream.of("Geeks", "for");
		Stream<String> stream2 = Stream.of("GeeksQuiz", "GeeksforGeeks");
		Stream<String> stream3 = Stream.of("Pradeep", "Ahirwar");
		Stream<String> stream4 = Stream.of("Pramod", "Kumar");

		//Stream.concat(stream1, stream2).forEach(e -> System.out.print(e + " "));
		
		
		System.out.println(" =====FOUR STREAM ADD DEMO======== ");
		
		Stream.concat(Stream.concat(Stream.concat(stream1, stream2),stream3),stream4)
				.forEach(e->System.out.println(e));
		
		  
	}

}
