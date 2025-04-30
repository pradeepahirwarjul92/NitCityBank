package com.heg.collectionclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exa_12_MergeAndSort {
	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(3, 8, 12);
		List<Integer> list2 = Arrays.asList(5, 9, 15);

		List<Integer> mergedList = new ArrayList<Integer>(list1);
		mergedList.addAll(list2);

		Collections.sort(mergedList);
		System.out.println("Exa_12_MergeAndSort.main()" + mergedList);
	}

}
