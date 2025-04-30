package com.heg.program;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import java.util.stream.Stream;

public class ConvertMapToStream {

	public static <K, V> Stream<Map.Entry<K, V>> convertMapToStream(Map<K, V> map) {
		return map.entrySet().stream();
	}

	
	public static <K, V> Stream<K> convertKeySetToStream(Map<K, V> map) {
		return map.keySet().stream();
	}
	
	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		// Add entries to the Map
		map.put(1, "Geeks");
		map.put(2, "forGeeks");
		map.put(3, "A computer Portal");

		// print the Map
		System.out.println("Map :: " + map);

		// Convert the Map to stream

		Stream<Map.Entry<Integer, String>> stream = convertMapToStream(map);
		Stream<Integer> streamKeySet=convertKeySetToStream(map);
		
		//System.out.println(Arrays.toString(stream.toArray()));
		
		System.out.println(Arrays.toString(stream.toArray()));		
		
		System.out.println(Arrays.toString(stream.toArray()));
	}

}
