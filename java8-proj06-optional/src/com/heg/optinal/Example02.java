package com.heg.optinal;

import java.util.Optional;

public class Example02 {
	
	public static void main(String[] args) {
		
		//creating a string array 
		String[] str=new String[5];
		
		//strring value for 2nd index
		
		str[2]="Java classes are coming soon";
		
		//It return an empty instance of optinal class
		
		Optional<String> empty= Optional.empty();
		System.out.println(empty.empty());
		
		//It returns a non-empty Optional
		Optional<String> value= Optional.of(str[2]);
		
		System.out.println(value);
		
		
		
		
	}

}
