package com.heg.methods;

import java.util.Arrays;
import java.util.List;

public class DistinctDemo {
	
	public static void main(String[] args) {
		
		
		// Creating a list of integers 
        List<Integer> list = Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5); 
        
        System.out.println("================ The distinct elements are ========= "); 
        
        list.stream().distinct()
        			.forEach(System.out::println);
        
        System.out.println();
     // Creating a list of strings 
        List<String> strList = Arrays.asList("Geeks", "for", "Geeks", 
                                          "GeeksQuiz", "for", "GeeksforGeeks"); 
  
        System.out.println("============ The distinct elements are ============="); 
        
        strList.stream()
        		.distinct()
        		.forEach(System.out::println);
		
	}

}
