package com.heg.optinal;

import java.util.Optional;

public class OrElseMethodDemo {

	public static void main(String[] args) {
		
		//create a Optional 
		
		Optional<Integer> op=Optional.of(9455);
		
		//print value 
		
		System.out.println("Optional :: " +op);
		
		//orElse value 
		
		System.out.println(op.orElse(100));
	}
}
