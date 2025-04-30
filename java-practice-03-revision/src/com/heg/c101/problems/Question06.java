package com.heg.c101.problems;

public class Question06 {
	
	public static void main(String[] args) {
		int found =0 , count = 5; 
		
		if(!found || --count ==0) //  the operator ! undefined argument type int 
			System.out.println( "danger");
		
		System.out.println( "count = " +count );
	}

}
