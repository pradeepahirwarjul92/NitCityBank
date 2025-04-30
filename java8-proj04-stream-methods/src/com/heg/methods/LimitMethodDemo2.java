package com.heg.methods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LimitMethodDemo2 {

	public static Stream<String> limitingFunction(Stream<String> ss, int range){
		return ss.limit(range);
	}
	
	public static void main(String[] args) {
		 // list to save stream of strings
        List<String> arr = new ArrayList<>();
        
        arr.add("geeks");
        arr.add("for");
        arr.add("geeks");
        arr.add("computer");
        arr.add("science");
        
        Stream<String> str=arr.stream();
        
        //calling function to limit the stream to range 
        
        Stream<String> lm=limitingFunction(str, 3);
        lm.forEach(System.out::println);
        
        
	}
}
