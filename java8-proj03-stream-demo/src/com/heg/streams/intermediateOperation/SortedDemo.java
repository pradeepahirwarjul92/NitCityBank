package com.heg.streams.intermediateOperation;

import java.util.Arrays;
import java.util.List;

public class SortedDemo {
	
	public static void main(String[] args) {
		//creating an object of list class by declaring a list of integers
		
		List<Integer> intList=Arrays.asList(15,20,48,63,49,27,56,32,9);
		
		 // Display message only
        System.out.println("Elements of Sorted List are as follows : ");
        
        //Calling the method to print the sorted list
        
        printSortedList(intList);
	}

	private static void printSortedList(List<Integer> intList) {
		
		intList.stream()
				.sorted()
				.forEach(e-> System.out.println(e));
		
	}

}
