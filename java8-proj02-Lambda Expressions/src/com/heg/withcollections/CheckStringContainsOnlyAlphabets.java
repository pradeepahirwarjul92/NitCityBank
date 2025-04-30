package com.heg.withcollections;

public class CheckStringContainsOnlyAlphabets {
	
	//Method 1
	//to check String for only Alphabets
	
	public static boolean isStringOnlyAlphabets(String str) {
		return ( 
				(str !=null) && (!str.equals(""))
				&& (str.chars().allMatch(Character :: isLetter))
				);
	}
	
	
	//Method 2
	//Main driver method
	
	public static void main(String[] args) {
		
		//Display Message 
		String str1="PradeepAhirwar";
		System.out.println("Test case 1 :: " +str1);		
		System.out.println("Output :: " +isStringOnlyAlphabets(str1));
		
		System.out.println();		
		String str2="Pradee4pAhirwar";
		System.out.println("Test case 2 :: " +str2);		
		System.out.println("Output :: " +isStringOnlyAlphabets(str2));
		
	}

}
