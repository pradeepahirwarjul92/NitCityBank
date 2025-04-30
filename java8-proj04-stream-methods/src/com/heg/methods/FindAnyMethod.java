package com.heg.methods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

//Systax 
// Optinal<T> findAny()
public class FindAnyMethod {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);

		Optional<Integer> answer = list.stream().findAny();

		if (answer.isPresent()) {
			System.out.println(answer.get());
		} else {
			System.out.println("no value");
		}
		
		
		
		System.out.println("============FindAny Method With String =============");
		
		List<String> strList=Arrays.asList("Pradeep","Ahirwar","Pramod","Vittu","Amisha","Gucci");
		
		Optional<String> anyValue= strList.stream().findAny();
		
		if(anyValue.isPresent()) {
			System.out.println(anyValue.get());
		}else {
			System.out.println("No Value ");
		}
		
		
	
		
		

	}

}
