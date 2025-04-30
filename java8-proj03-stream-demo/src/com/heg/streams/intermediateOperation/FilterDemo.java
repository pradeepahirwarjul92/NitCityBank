package com.heg.streams.intermediateOperation;

import java.util.Arrays;
import java.util.List;

public class FilterDemo {
	
	public static void main(String[] args) {
		
		//creating an object of list class by declaring a list of integers
		
		List<Integer> intList=Arrays.asList(15,20,48,63,49,27,56,32,9);
		
		//Caling the function to print the list of Even numbers 
		
		printEvenNumber(intList);
		
		
	}

	private static void printEvenNumber(List<Integer> intList) {
		
		//Display message
		
		System.out.println("\nEven numbers are :: \n");
		
		//Illustrating filter method usage
		
		intList.stream()
				.filter(e -> e%2==0)
				.forEach(e->System.out.println(e));
		
	}
	
	
	

}
