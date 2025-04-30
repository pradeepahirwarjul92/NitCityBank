package com.heg.functionDemo;

import java.util.function.Function;

public class FunctionExample06 {
	
	public static void main(String[] args) {
		
		//Function which takes in a number and return it
		Function<Integer, Integer> i=Function.identity();
		
		//print statement
		
		System.out.println(i.apply(10));
				
	}

}
