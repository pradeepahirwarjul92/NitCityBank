package com.heg.methodReferenceDemo;

import java.util.ArrayList;
import java.util.List;

public class Demo03 {

	public static void main(String[] args) {


		List<Person> personList = new ArrayList<Person>();
		
		// Adding elements to above object using add() method
        personList.add(new Person("Vicky", 24));
        personList.add(new Person("Poonam", 25));
        personList.add(new Person("Sachin", 19));
        
        ComparisonProvider comparator=new ComparisonProvider();
        
        System.out.println("Sort by Name :: ");
        
        //Using streams 
        
        personList.stream()
        			.map(x->x.getName())
        			.forEach(System.out::println);
        
        System.out.println();
        
        
        //Using instance method reference to sort array by age
        
        System.out.println("Sort by Age :: ");
        
        personList.stream()
        .map(x -> x.getName())
        .forEach(System.out::println);
		
		
	}

}
