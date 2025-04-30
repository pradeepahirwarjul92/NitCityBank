package com.heg.program;

import java.util.Arrays;
import java.util.stream.IntStream;


public class PrimitiveArrayTOStream {
	
	public static IntStream convertArrayToStream(int array[]) {
		return Arrays.stream(array);
	}
	
	
	public static void main(String[] args) {
		int[] array=new int[] {3,2,5,4,8,1};
		
		//Print the array
		System.out.println(Arrays.toString(array));
		
		//convert the array to stream
		IntStream stream= convertArrayToStream(array);
		
		System.out.println(Arrays.toString(stream.toArray()));
		
	}

}
