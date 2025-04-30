package com.heg;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example01 {
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();

        // Inserting elements to ArrayList class object
        // Custom input integer numbers
        al.add(2);
        al.add(6);
        al.add(9);
        al.add(4);
        al.add(20);
        
        //First lets print the collections
        
        System.out.println("Printing the collection :: " +al);
        
        System.out.println();
        
        List<Integer> ls=al.stream().filter(i -> i%2==0).collect(Collectors.toList());
        
        System.out.println("Printing list after operation perfomance " +ls);

	}

}
