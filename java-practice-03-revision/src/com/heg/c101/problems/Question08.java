package com.heg.c101.problems;

public class Question08 {

	public static void printEvenNumber(int n) {
		if (n < 0)
			return; // Base condition
		System.out.println(n);
		printEvenNumber(n - 2);
	}

	public static void main(String[] args) {
		/*
		 * for (int i = 20; i >= 0; i = i-2) { 
		 * System.out.print(i + ", ") ;
		 *  }
		 */

		// Using stream

		printEvenNumber(20);
	}
}
