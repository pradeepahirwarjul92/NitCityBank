package com.heg.map;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
	
	public static void main(String[] args) {
		
		Map<Integer,String> map=new ConcurrentHashMap();
		map.put(2, "B");
		System.out.println(map);
		
		map.put(1,null);
		System.out.println(map);
		
	}

}
