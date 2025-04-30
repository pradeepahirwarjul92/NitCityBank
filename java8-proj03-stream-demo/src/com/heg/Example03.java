package com.heg;

import java.util.ArrayList;
import java.util.List;

public class Example03 {
	
	public static void main(String[] args) {
		
		List<String> companyList=new ArrayList<String>();
		// Adding elements to above ArrayList
        companyList.add("Google");
        companyList.add("Apple");
        companyList.add("Microsoft");
        
        companyList.stream().sorted().forEach(System.out::println);
		
	}

}
