package com.heg.map;

import java.util.Hashtable;
import java.util.Map;

public class HashtableDemo {
	public static void main(String[] args) {
		Map<Integer,String> map=new Hashtable();
		map.put(1, "A");		
		map.put(2, null);
		System.out.println(map);
		
	}

}
