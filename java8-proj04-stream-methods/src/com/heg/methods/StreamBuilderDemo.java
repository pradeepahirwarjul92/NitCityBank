package com.heg.methods;

import java.util.stream.Stream;

public class StreamBuilderDemo {

	public static void main(String[] args) {
		
		Stream.Builder<String> str_b=Stream.builder();
		//Inserting elements into the stream using Stream.Builder accept (T t)
		
		str_b.accept("Hello");
		str_b.accept("I am");
		str_b.accept("Java");
		str_b.accept("Developer");
		str_b.accept("Employee");
		
		//creating the String Stream 
		//The stream has now entered the built phase
		
		Stream<String> s=str_b.build();
		
		//printing the elemts 
		System.out.println("Stream successfully built :: \n");
		s.forEach(System.out::println);
	}
}
