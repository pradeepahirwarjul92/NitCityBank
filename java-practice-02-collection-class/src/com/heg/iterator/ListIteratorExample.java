package com.heg.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");
		
		List<String> colorList=Arrays.asList("PRADEEP","PRAMOD","AMIT","AMISHA","JIVIKA");
		
		ListIterator<String> listIterator= colorList.listIterator();
		
		//forward direction
		
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		//Backward iteration
		System.out.println();
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	}

}
