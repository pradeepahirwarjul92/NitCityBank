package com.heg.exception;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream8 {
	
	public static void main(String[] args) {
		
		List<Integer> listInt=Arrays.asList(5,6,8,1,6,8,2,6,9,7,2,6,9);
		
		List<Integer> filterDemoList=listInt.stream().filter(n->n>5).collect(Collectors.toList());
		
		
		
		System.out.println(filterDemoList);
		
		
		System.out.println();
		System.out.println("================TRANSFORMAING DATA=============");
		
		List<Integer> squreRootList= listInt.stream().map(n->n*n).collect(Collectors.toList());
		System.out.println(squreRootList);
		
		
		System.out.println();
		System.out.println("================SORTING DATA=============");
		
		List<Integer> sortedList= listInt.stream().sorted().collect(Collectors.toList());
		
		System.out.println(sortedList);
		
		
		
		
		
		
	}

}
