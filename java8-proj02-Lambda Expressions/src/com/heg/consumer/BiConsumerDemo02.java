package com.heg.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerDemo02 {
	
	public static void main(String[] args) {
		 // Create first list
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(2);
        lista.add(1);
        lista.add(3);
 
        // Create second list
        List<Integer> listb = new ArrayList<Integer>();
        listb.add(2);
        listb.add(1);
        listb.add(2);
        
        
        //BiConsumer to compare 2 list of integer
        
        BiConsumer<List<Integer>, List<Integer>> equals=(list1,list2) ->{
        	if(list1.size() != list2.size()) {
        		System.out.println("False");
        	}else {
        		for(int i=0;i<list1.size();i++) {
        			if(list1.get(i) !=list2.size()) {
        				System.out.println("False");
        				return;
        			}
        			System.out.println("True");
        		}
        	}
        };
        
        //Biconsumer to println 2 lists 
        BiConsumer<List<Integer>,List<Integer>> disp=(list1,list2)->{
        	list1.stream().forEach(a->System.out.println(a + " " ));
        	System.out.println();
        	
        	list2.stream().forEach(a -> System.out.println(a + " "));
        	System.out.println();
        };
        
        equals.andThen(disp).accept(lista, listb);
        
	}

}
