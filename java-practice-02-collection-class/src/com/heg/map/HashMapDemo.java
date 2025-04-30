package com.heg.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap();
		map.put(54, "PRADEEP");
		map.put(58, "DHANLAXMI");
		map.put(6, "GUCCI");
		map.put(104, "AARUL");
		map.put(12, "AMIT");
		map.put(65, "PRAMOD");
		//map.put(897, null);
		//map.put(null, "RAVI");
		
		
		
	//	System.out.println(map);
		
		//Using key set 
		
		/*
		for(Integer key : map.keySet()) {
			System.out.println(key + " =  " +map.get(key));
		}
		
		*/
		
		//USING ENTRY SET
		  // Iterating using entrySet() and for-each loop
	/*	for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("KEY :: " +entry.getKey() + " == VALUE :: " +entry.getValue() + " == CLASS NAME :: "+entry.getClass());
		}
		
	*/	
		
		// Iterator for entrySet
		
		Iterator<Map.Entry<Integer, String>> iterator= map.entrySet().iterator();
		
		//The Iterator approach is useful when you need to remove elements
		
		while(iterator.hasNext()) {
			Map.Entry<Integer,String> entry=	iterator.next();
			System.out.println("Key :: " +entry.getKey() + ", value :: "+entry.getValue());
			
			//Removing an entry conditionally
			if(entry.getKey()==2) {
				iterator.remove();
			}
		}
		System.out.println("UPDATED MAP :: " +map);

	}

}
