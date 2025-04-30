package com.heg.functionDemo;

import java.util.function.Function;

public class FunctionExample01 {
	
	public static void main(String[] args) {
		
		// Function which takes in a number
        // and returns half of it
		Function<Integer, Double> half = a -> a / 2.0;
		
		//Apply the function AND get the result
		
		System.out.println(half.apply(10));
		
	}

}
