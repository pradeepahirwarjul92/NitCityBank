package com.heg.predicate;

import java.util.Objects;
import java.util.function.Predicate;

public class PredicateExample05 {
	public static void main(String[] args) {
		predicate_and();
	}

	public static void predicate_and() {
		Predicate<String> nonNullPredicate = Objects::nonNull;

		String nullString = null;
		boolean outcome = nonNullPredicate.and(hasLengthOf10).test(nullString);
		System.out.println(outcome);

		String str = "Welcome to the machine";
		boolean outcome2 = nonNullPredicate.and(hasLengthOf10).test(str);
		System.out.println(outcome2);

	}

	public static Predicate<String> hasLengthOf10 = new Predicate<String>() {

		@Override
		public boolean test(String t) {
			// TODO Auto-generated method stub
			return t.length() > 10;
		}
	};

}
