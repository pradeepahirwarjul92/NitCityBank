package com.heg.predicate;

import java.util.function.Predicate;

public class PredicateExample04 {

	public static void main(String[] args) {
		predicate_or();
	}

	public static void predicate_or() {
		Predicate<String> containsLetterA = p -> p.contains("A");
		String containsA = "And";
		boolean outcome = hasLengthOf10.or(containsLetterA).test(containsA);
		System.out.println(outcome);
	}

	public static Predicate<String> hasLengthOf10 = new Predicate<String>() {

		@Override
		public boolean test(String t) {
			// TODO Auto-generated method stub
			return t.length() > 10;
		}
	};
}
