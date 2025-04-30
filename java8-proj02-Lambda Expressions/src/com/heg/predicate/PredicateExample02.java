package com.heg.predicate;

import java.util.function.Predicate;

public class PredicateExample02 {
	
	public static void main(String[] args) {
		Predicate<Integer> greaterThanTen=(i) -> i>10;
		
		//Creting predicate
		Predicate<Integer> lowerThanTwenty=(i) -> i<20;
		
		boolean result=greaterThanTen.and(lowerThanTwenty).test(15);
		System.out.println(result);
		
		//Calling predicate method 
		boolean result2=greaterThanTen.and(lowerThanTwenty).negate().test(15);
		System.out.println(result2);
		
	}

}
