package com.heg.methods;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoiningMethodDemo {

	public static void main(String[] args) {
		char[] ch= {'G', 'e', 'e', 'k', 's', 'f', 'o',
                'r', 'G', 'e', 'e', 'k', 's' };
		
		//Converting character array into string 
		//using joining() method of collectors class
		
		String chString = Stream.of(ch)
								.map(arr -> new String(arr))
								.collect(Collectors.joining());
		
		System.out.println(chString);
	}
}
