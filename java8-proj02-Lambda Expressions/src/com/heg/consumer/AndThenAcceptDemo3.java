package com.heg.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class AndThenAcceptDemo3 {
	
	public static void main(String[] args) {
		
		Consumer<List<Integer>> modify=list->{
			for(int i=0;i<list.size();i++)
				list.set(i, 2* list.get(i) );
		};
		
		Consumer<List<Integer>> displayList=list -> list.stream().forEach(a -> System.out.println(a + " "));
		 System.out.println();
		 
		List<Integer> list=Arrays.asList(2,3,6);
		
		try {
			displayList.andThen(modify).accept(list);
			;
			
		}catch (Exception e) {
			System.out.println(" Exception e " +e);

		}
		
		
	}

}
