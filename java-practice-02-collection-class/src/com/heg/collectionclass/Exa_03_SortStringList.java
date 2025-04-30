package com.heg.collectionclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exa_03_SortStringList {
	
	public static void main(String[] args) {
		List<String> names=new ArrayList<String>(Arrays.asList("Pradeep","Amit","Dhanlaxmi","Gucci","Bhaiyo"));
		
		Collections.sort(names);
		
		System.out.println("SortStringList.main()" +names);
		
		Collections.sort(names,Collections.reverseOrder());
		
		System.out.println(" reverse order of list " +names);
	}

}
