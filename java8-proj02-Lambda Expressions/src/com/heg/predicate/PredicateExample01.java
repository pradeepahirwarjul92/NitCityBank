package com.heg.predicate;

import java.util.function.Predicate;

public class PredicateExample01 {
	
	public static void main(String[] args) {
		//Creating predicate
		
		Predicate<Integer> lesserThan=i -> (i <18);
		
		//calling Predicate method 
		
		System.out.println(lesserThan.test(52));
	}

}
