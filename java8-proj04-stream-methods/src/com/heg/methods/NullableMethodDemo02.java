package com.heg.methods;

import java.util.ArrayList;
import java.util.stream.Stream;

public class NullableMethodDemo02 {

	public static void main(String[] args) {
		// Create ArrayList containing names 
        ArrayList<String> list = new ArrayList<String>(); 
        list.add("Aman"); 
        list.add("Suraj"); 
        list.add("Zufaq"); 
        

        // create a stream with ArrayList 
        Stream<ArrayList<String> > value 
            = Stream.ofNullable(list); 
  
        // print values 
        System.out.println("Values of Stream:"); 
        value.forEach(System.out::println); 
        		
        		
	}
}
