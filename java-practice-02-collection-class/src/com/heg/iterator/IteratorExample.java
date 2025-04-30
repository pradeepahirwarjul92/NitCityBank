package com.heg.iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorExample {

	//boolean hasNext() – Returns true if the iteration has more elements.
	//E next() – Returns the next element.
	//void remove() – Removes the last element returned by next().
	
	public static void main(String[] args) {
		List<String> names=new ArrayList();
		names.add("RAJU");
		names.add("BAN");
		names.add("ZIYA");
		names.add("ALICE");
		
		Iterator itr= names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println();
		//WHY NEED ITERATOR
		
		Set<String> setNames=new HashSet<String>(names);
		
		// ❌ Cannot use for loop because Set has no indexes
		for(int i=0; i<setNames.size(); i++) {
			//System.out.println(setNames.get(i)); // Error! No get() method in Set
		}
		
		//BY USING ITERATOR
		
		Iterator<String> setItr = setNames.iterator();
		while(setItr.hasNext()) {
			System.out.println(setItr.next());
		}
		
		
	}
}
