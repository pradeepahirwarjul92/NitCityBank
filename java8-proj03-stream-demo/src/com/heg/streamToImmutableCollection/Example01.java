package com.heg.streamToImmutableCollection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example01 {
	
	public static void main(String[] args) {
		List<Integer> unmodifiableList=Collections
										.unmodifiableList(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
		System.out.println(unmodifiableList);
		
		//This operation will throw an UnsupportedOperationException
		unmodifiableList.add(12);
		
	}

}
