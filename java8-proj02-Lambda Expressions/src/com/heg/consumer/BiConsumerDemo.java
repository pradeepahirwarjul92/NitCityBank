package com.heg.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerDemo {
	
	public static void main(String[] args) {
		
		List<Integer> listA=Arrays.asList(2,1,3);
		List<Integer> listB=Arrays.asList(2,1,2);
		
		//BiConsumer to compare both lists
		
		BiConsumer<List<Integer>,List<Integer>> equals =(list1,list2) ->{
			if(list1.size() !=list2.size()) {
				System.out.println("False");
			}else {
				for(int i=0; i<list1.size();i++) {
					if(list1.get(i) != list2.get(i)) {
						System.out.println("False");
						return;
					}
					System.out.println("True");
				}
			}
			
		};
		
		equals.accept(listA, listB);
		
	}

}
