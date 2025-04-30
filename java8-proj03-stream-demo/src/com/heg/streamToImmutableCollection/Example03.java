package com.heg.streamToImmutableCollection;

import java.util.ArrayList;
import java.util.List;

public class Example03 {

	public static void main(String[] args) {

		// creating an object of list class
		// Declaring object of user defined type

		List<Books> bookList = new ArrayList<Books>();

		// Adding element to the object class
		// Custom input entries

		bookList.add(new Books(1, "Java", 7000));
		bookList.add(new Books(2, "Rust", 2000));
		bookList.add(new Books(3, "Ruby", 1500));
		bookList.add(new Books(4, "Scala", 2500));
		bookList.add(new Books(5, "Groovy", 4000));

		List<Integer> valueList = new ArrayList<Integer>();

		for (Books book : bookList) {
			// Filtering data of list

			if (book.value < 3000) {

				// Adding prce to above elements
				valueList.add(book.value);

			}

		}

		// print and display all elements inside the object

		System.out.println(valueList);

	}

}
