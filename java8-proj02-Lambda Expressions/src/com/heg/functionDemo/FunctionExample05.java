package com.heg.functionDemo;

import java.util.function.Function;

public class FunctionExample05 {
	
	public static void main(String[] args) {
		
		Function<Integer, Double> half=a -> a/2.0;
		
		try {
			half=half.compose(null);
			
		}catch(Exception e) {
			System.out.println("Exception throw while passing null :: " +e);
		}
	}

}
