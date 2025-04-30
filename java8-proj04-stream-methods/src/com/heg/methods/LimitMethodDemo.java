package com.heg.methods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LimitMethodDemo {

	public static void main(String[] args) {

		// Creating a list of integers
		List<Integer> list = new ArrayList<Integer>();

		// adding elements in the list
		list.add(-2);
		list.add(0);
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(8);
		list.add(10);
		list.add(12);
		list.add(14);
		list.add(16);

		System.out.println(list);
		
		System.out.println();
		
		int limit=4;
		int count=0;
		
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {
			it.next();
			count++;
			
			if(count>limit) {
				//if yes then remove all the remaining integers
				it.remove();
			}
		}
		
		System.out.println("New stream of length N after truncation is :: ");
		
		for(Integer number : list) {
			System.out.print(number + " ");
		}
	}

}
