package com.heg;

public class FibonacciSeries {
	
	
	public static void main(String[] args) {
		printFibbonacciSeq(10);
	}
	public static void printFibbonacciSeq(int count) {
		int a=0;
		int b=1;
		int c=1;
		
		for(int i=1;i<=count; i++) {
			System.out.print(a + ", ");
			a=b;
			b=c;
			c=a+b;
		}
	}

}
