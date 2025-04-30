package com.heg;

import java.util.ArrayList;

public class LambdaOneParameter {

	public static void main(String[] args) {
		ArrayList<Integer> arrL=new ArrayList<Integer>();
		arrL.add(1);
		arrL.add(2);
		arrL.add(3);
		arrL.add(4);
		arrL.add(5);
		arrL.add(6);
		
		
		//using lambda print all elements of arrL
		
		System.out.println("Elements of the ArrayList :: ");
		
		arrL.forEach(n -> System.out.println(n) );
		
		//Using lambda print even number only 
		
		System.out.println("Even elements of the ArrayList");
		
		arrL.forEach(n-> {
			if(n % 2== 0)
				System.out.println(n);
		});
		
	}
	
}
