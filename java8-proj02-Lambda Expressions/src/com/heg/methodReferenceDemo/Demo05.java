package com.heg.methodReferenceDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

class Person1{
	private String name;
	private Integer age;
	
	//constructor
	public Person1() {
		
		Random ran=new Random();
		
		//Assigning a random value to name 
		
		this.name=ran.ints(97, 122+1)
					.limit(7)
					.collect(StringBuilder ::new,
							 StringBuilder::appendCodePoint, 
							 StringBuilder::append)
					.toString();
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	
	
}

public class Demo05 {
	
	//Get List of objects of given length and supplier
	
	public static<T> List<T> getObjectList(int length,Supplier<T> objectSupply)
	{
		List<T> list=new ArrayList<T>();
		for(int i=0; i<length;i++)
			list.add(objectSupply.get());
		return list;
	}
	
	public static void main(String[] args) {
		List<Person1> personList=getObjectList(5, Person1::new);
		
		//print names of personList
		personList.stream()
				.map(x -> x.getName())
				.forEach(System.out::println);
	}

}
