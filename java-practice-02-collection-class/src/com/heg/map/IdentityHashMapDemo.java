package com.heg.map;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = new IdentityHashMap();
		String key1 = new String("A");
		String key2 = new String("A");

		map.put(key1, 1);
		map.put(key2, 2);

		System.out.println(map);

	}

}
