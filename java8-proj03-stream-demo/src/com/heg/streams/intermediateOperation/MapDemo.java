package com.heg.streams.intermediateOperation;

import java.util.Arrays;
import java.util.List;

public class MapDemo {
	
	public static void finCubeofList(List<Integer> intList) {
		System.out.println(" find the cube of elements :: ");
		intList.stream()
				.map(e->e*e*e)
				.forEach(e->System.out.print(e + ", "));
		
		//Display message only 
		
		System.out.println("\n\nOutput after distinct() implementation :: ");
		
		//Applying distinct() on this
		
		intList.stream()
				.distinct()
				.map(e-> e*e*e)
				.forEach(e->System.out.print(e + ", "));
		
		System.out.println("\n\nOutput after sorted() implementation :: ");
		
		intList.stream()
				.distinct()
				.sorted()
				.map(e->e*e*e)
				.forEach(e->System.out.print(e + ", "));
		
		System.out.println("\n\nOutput after filter() implementation :: ");
		
		intList.stream()
				.distinct()
				.sorted()
				.map(e->e*e*e)
				.filter(e->e<1000)
				.forEach(e->System.out.print(e + ", "));
	}
	
	public static void main(String[] args) {
		List<Integer> intList=Arrays.asList(5,8,2,6,70,25,5,8,2,6,70,25);
		finCubeofList(intList);
	}

}
