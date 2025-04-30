package com.heg.map;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
	
	public static void main(String[] args) {
		Map<Object,String> map=new WeakHashMap();
		Object key=new Object();
		map.put(key,"value");
		key=null;
		System.gc();
	}

}
