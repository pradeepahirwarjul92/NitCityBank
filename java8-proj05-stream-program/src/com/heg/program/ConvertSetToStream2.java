package com.heg.program;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ConvertSetToStream2 {

	public static<T> Stream<T> convertSetToStream(Set<T> set, Predicate<T> predicate){
		return set.stream()
				.filter(predicate);
	}
	
	public static void main(String[] args) {
		Set<String> setOfString = new HashSet<>(Arrays.asList("GeeksForGeeks", "A computer portal", "for", "Geeks"));
		
		//print the set of string
		
		System.out.println(setOfString);
		
		//Create the predicate for item starting with G
		Predicate<String> predicate=new Predicate<String>() {
			
			@Override
			public boolean test(String t) {
				// TODO Auto-generated method stub
				return t.startsWith("G");
			}
		};
		
		
		//Convert set of stream
		
		Stream<String> streamOfString=convertSetToStream(setOfString,predicate);
		
		//print the filter stream of string
		
		System.out.println(Arrays.toString(streamOfString.toArray()));
		

	}

}
