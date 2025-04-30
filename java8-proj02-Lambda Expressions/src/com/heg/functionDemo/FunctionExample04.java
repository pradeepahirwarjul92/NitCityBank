package com.heg.functionDemo;

import java.util.function.Function;

public class FunctionExample04 {
	
	public static void main(String[] args) {
		
		//Function which takes in a number and return half of it 
		Function<Integer, Double> half=a -> a/2.0;
		
		//triple the value given to half function
		
		half=half.compose(a -> 3 *a);
		
		//Applying the function to gey the result
		
		System.out.println(half.apply(10));
		
	}

}
