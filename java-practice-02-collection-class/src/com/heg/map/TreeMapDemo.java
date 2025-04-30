package com.heg.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		Map<Integer,String> map=new TreeMap();
		map.put(6, "F");
		System.out.println(map);
		map.put(3, "C");
		System.out.println(map);
		map.put(1, "A");
		System.out.println(map);
	}

}
