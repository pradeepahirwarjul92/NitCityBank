package com.heg.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
	
	public static void main(String[] args) {
		Map<String,Integer> map=new LinkedHashMap<>();
		map.put("AA",1);
		System.out.println(map);
		map.put("ZZ", 3);
		System.out.println(map);
		map.put("BB", 3);
		System.out.println(map);
		map.put("CC", 3);
		System.out.println(map);
		
	}

}
