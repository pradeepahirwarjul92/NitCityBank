package com.heg.predicate;

import java.util.function.Predicate;

public class PredicateExample06 {

	public static Predicate<String> hasLengthOf10=new Predicate<String>() {
		
		@Override
		public boolean test(String t) {
			// TODO Auto-generated method stub
			return t.length()>10;
		}
	};
	
	
	public static void predicate_negate() {
		String str="Thunderstruck is a 2012 children's film starring Kevin Durant";
		
		boolean outCome=hasLengthOf10.negate().test(str);
		System.out.println(outCome);
	}
	
	public static void main(String[] args) {
		predicate_negate();
	}
}
