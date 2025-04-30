package com.heg.withcollections;

import java.util.TreeSet;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		
		
		TreeSet<String> ts=new TreeSet<String>( (aStr,bStr) -> bStr.compareTo(aStr) );
		// Add elements to the Treeset
		  ts.add("A");
		  ts.add("B");
		  ts.add("C");
		  ts.add("D");
		  ts.add("E");
		  ts.add("F");
		  ts.add("G");
		  
		  for(String element : ts) {
			  System.out.println(element + " ");
		  }
		  System.out.println();
	}

}
