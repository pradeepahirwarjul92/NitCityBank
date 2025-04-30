package com.heg.collectionclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exa_05_ShuffleExample {

	public static void main(String[] args) {
		List<String> items = new ArrayList<String>(Arrays.asList("Apple", "Banana", "Cherry", "Date"));

		Collections.shuffle(items);

		System.out.println("ShuffleExample.main()" + items);
	}

}
