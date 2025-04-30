package com.heg.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example01 {
	
	public static void main(String[] args) {
		
		List<String> words=Arrays.asList("Java","stream");
		
		//filter() (Intermediate) and collect (Terminal)
		
		List<String> letters =	words.stream()
				.map(word -> word.split(""))
				.flatMap(Arrays::stream)
				.collect(Collectors.toList());
		
		System.out.println(letters);
		
	}

}
