package com.heg.map;

import java.util.HashMap;
import java.util.Map;

public class Map_01_Example01 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Cherry");
		map.put(4, "Mango");
		
		System.out.println("==before put method ==");
		System.out.println(map);
		
		map.put(2, "Blueberry");
		System.out.println();
		System.out.println("==After put method ==");
		System.out.println(map);
		
		System.out.println();
		System.out.println("==Fetch the value  ==");		
		System.out.println(map.get(3));
		
		System.out.println();
		System.out.println("==Removing the element   ==");
		map.remove(4); //remove key from 1 from the map
		
		
		System.out.println(map);
		
		
		System.out.println();
		System.out.println("== Checking for Key or Value   ==");
		
		System.out.println(map.containsKey(2)); //true
		
		System.out.println(map.containsValue("Apple")); //true
		
		
		System.out.println("======ITERATING THE HASHMAP======= ");
		
		for(Integer key : map.keySet()) {
			System.out.println(key + " -> " +map.get(key));
		}
		
		
		
	}
}
