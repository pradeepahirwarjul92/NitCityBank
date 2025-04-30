package com.heg.methodReferenceDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo04 {

	public static void main(String[] args) {

		// Creating an empty ArrayList of user defined type
		// List of person
		List<String> personList = new ArrayList<>();

		// Adding elements to above object of List
		// using add() method
		personList.add("Vicky");
		personList.add("Poonam");
		personList.add("Sachin");

		// Method reference to string type

		Collections.sort(personList, String::compareToIgnoreCase);

		// printing the elements (names) on console

		personList.forEach(System.out::println);
	}

}
