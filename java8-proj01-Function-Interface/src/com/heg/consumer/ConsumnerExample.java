package com.heg.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumnerExample {

	public static void main(String[] args) {

	
		// Consumer to multiply 2 to every integer of a list

		Consumer<List<Integer>> modify = list -> {
			for (int i = 0; i < list.size(); i++)
				list.set(i, 2 * list.get(i));

		};

		// Consumer to display a list of numbers

		Consumer<List<Integer>> dispList = list -> list.stream().forEach(a -> System.out.println(a));

		List<Integer> list = new ArrayList<Integer>();

		list.add(1);
		list.add(4);
		list.add(5);

		// Implement modify using accept

		modify.accept(list);

		dispList.accept(list);

	}

}
