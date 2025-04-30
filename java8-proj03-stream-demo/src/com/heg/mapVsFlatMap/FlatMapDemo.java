package com.heg.mapVsFlatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {
	
	public static void main(String[] args) {
		
		//making the arrayList object of list of Integer
		
		List<List<String>> number=new ArrayList();
		
		//adding the elements to number arraylist
		number.add(Arrays.asList("Pradeep","Ahirwar"));
		number.add(Arrays.asList("Sachin","Chutiya"));
		number.add(Arrays.asList("Pankaj","Jain"));
		number.add(Arrays.asList("Afzal","Ali"));
		
		System.out.println("List of list :: "+number);
		
		//using flatMap() to flatten this list
		
		List<String> flatList=number.stream()
									.flatMap(list -> list.stream())
									.filter(name->name.startsWith("Sa")||name.startsWith("C") )
									.map(name->name.toUpperCase())
									.collect(Collectors.toList());
		
		//
		
		
		
		//printing the list
		
		System.out.println("List generate by flatMap :: " +flatList);
	}

}
