package com.heg.optinal;

import java.util.Optional;

public class OrElseMethodDemo2 {
	
	public static void main(String[] args) {
		
		//create a Optional 
		
		Optional<Integer> op =Optional.empty();
		
		//print value 
		System.out.println("Optional : " +op);
		
		try {
			//orElse value 
			System.out.println(op.orElse(100));
			
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
