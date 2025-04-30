package com.heg.streams;

import java.util.Arrays;
import java.util.List;

public class SequenceVsParallel {
	
	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("Hello","P","R","A","D","E","E","P");
		
		//Example of STream
		
		System.out.println("========= Example of stream ========");
		
		list.stream().forEach(System.out::print);
		
		System.out.println();
		System.out.println();
		System.out.println("=======Example of Parallel STream========== ");
		
		list.parallelStream().forEach(System.out::print);
		
		System.out.println();
		System.out.println();
		System.out.println("=======Example of Parallel STream with forEachOrdered========== ");
		list.parallelStream().forEachOrdered(System.out::print);
		
		
	}

}
