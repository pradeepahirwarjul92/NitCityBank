package com.heg;

@FunctionalInterface
interface Functional{
	int operation(int a, int b);
}

public class LambdaMultiParameter {
	
	public static void main(String[] args) {
		//Using lambda expression to define the operation
		Functional add=(a,b)->a+b;
		Functional multiPly=(a,b)->a*b;
		
		//Using the operation
		
		System.out.println(add.operation(6, 3));
		System.out.println();
		System.out.println(multiPly.operation(6, 3));
	}

}
