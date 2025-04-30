package com.heg.functionDemo;

import java.util.function.Function;

public class FunctionExample03 {
	
	public static void main(String[] args) {
		Function<Integer, Double> half=a -> a/2.0;
		
		//try block to check for exceptions
		
		try {
			half=half.andThen(null);
			
		}catch(Exception e) {
			System.out.println("Exception thrown while passing null :: " +e);
		}
	}

}
