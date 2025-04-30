package com.heg.functionDemo;

import java.util.function.Function;

public class FunctionExample02 {
	
	public static void main(String[] args) {
		
		//Function which takes in a number and returns half of it
		Function<Integer, Double> half= a->a/2.0;
		
		//Now triple the output of half function
		half=half.andThen(a -> 3*a);
		
		//Apply the function to get the result and printing on console
		
		System.out.println(half.apply(10));
	}

}
