package com.heg.methodReferenceDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo06 {
	public static void main(String[] args) {
		
		//Creating arraylist to add elements
		ArrayList<String> fruits=new ArrayList<String>();
		fruits.add("Banana");
		fruits.add("Guava");
		fruits.add("Pineapple");
		fruits.add("Apple");
		fruits.add("Graphes");
		
		//printing content of arraylist before conversion
		
		System.out.println("Elements in ArrayList are :: " +fruits);
		
		//create new hashmap and using method reference with necessary classes for the conversion
		
		HashMap<String, Integer> res = fruits.stream()
			    .collect(Collectors.toMap(
			        Function.identity(),     // Key: The fruit name itself
			        String::length,          // Value: Length of the fruit name
			        (e1, e2) -> e1,         // Merge function (not needed here)
			        HashMap::new             // Specify that the result should be a HashMap
			    ));
		
		System.out.println("Elements in HashMap are :: " +res);
	}

}
