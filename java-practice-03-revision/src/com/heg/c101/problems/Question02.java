package com.heg.c101.problems;

public class Question02 {
	
	public static void main(String[] args) {
		int n=3;
		while(n>=0) {
			
			System.out.println(n + " " +n*n);
			--n;
		}
		System.out.println();
		System.out.println(n );
		System.out.println();
		
		while(n < 4)
			System.out.println( ++n);
		
		System.out.println( n );
		
		while(n >= 0)
			System.out.println(( n /=2));
		
	}

}
