package com.heg.methodReferenceDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo02 {

	// static method to compare with name

	public static int compareByName(Person a, Person b) {
		return a.getName().compareTo(b.getName());
	}

	public static int compareByAge(Person a, Person b) {
		return a.getAge().compareTo(b.getAge());
	}

	public static void main(String[] args) {

		List<Person> personList = new ArrayList<Person>();

		personList.add(new Person("Vicky", 24));
		personList.add(new Person("Poonam", 25));
		personList.add(new Person("Sachin", 19));

		Collections.sort(personList, Demo02::compareByName);

		// Display message only

		System.out.println("Sort by Name :: ");

		// using stream over above object of person type

		personList.stream().map(x -> x.getName()).forEach(System.out::println);

		System.out.println();

		Collections.sort(personList, Demo02::compareByAge);

		//// Display message only
		System.out.println("Sort by age :: ");

		personList.stream().map(x -> x.getName()).forEach(System.out::println);

	}

}