package com.heg.withcollections;

import java.util.TreeMap;

public class SortingTreeMapDemo {
	
	public static void main(String[] args) {
		TreeMap<Integer,String> map=new TreeMap<Integer,String>( (o1,o2) ->  (o1 > o2) ? 
																		-1 : (o1 < o2) ? 1 : 0 );
		
		map.put(1, "Apple");
		map.put(4, "Mango");
		map.put(5, "Orange");
		map.put(2, "Banana");
		map.put(3, "Graphes");
		
		System.out.println("Elemetns of the TreeMap after the sorting :: " +map);
	}

}
