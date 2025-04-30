package com.heg.collectionclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Exa_04_ShuffleExample2 {

	public static void main(String[] args) {
		List<String> colors = new ArrayList<String>(Arrays.asList("RED", "YELLOW", "GREEN", "ORANGE", "BLUE", "WHITE"));
		Collections.shuffle(colors); // shuffle the list

		System.out.println("Suffled Colors :: " + colors);

		// pick a random color

		String randomColor = colors.get(new Random().nextInt(colors.size()));
		System.out.println("Randomly Picked Color :: " + randomColor);
	}

}
