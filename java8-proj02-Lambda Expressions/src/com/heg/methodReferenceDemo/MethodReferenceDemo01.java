package com.heg.methodReferenceDemo;

import java.util.Arrays;

public class MethodReferenceDemo01 {

	// Method

	public static void print(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		String names[] = { "ALICE", "BOB", "CHARLIE" };

		// Using method reference to print each name

		Arrays.stream(names).forEach(MethodReferenceDemo01::print);
	}

}
