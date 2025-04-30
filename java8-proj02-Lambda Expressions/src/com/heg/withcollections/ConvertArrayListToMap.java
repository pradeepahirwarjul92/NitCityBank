package com.heg.withcollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ListItems {

	private Integer key;
	private String value;

	public Integer getKey() {
		return key;
	}

	public void setKey(Integer key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public ListItems(Integer key, String value) {
		super();
		this.key = key;
		this.value = value;
	}

	public ListItems() {
		super();
		// TODO Auto-generated constructor stub
	}

}

public class ConvertArrayListToMap {
	
	public static void main(String[] args) {
		
		List<ListItems> list=new ArrayList<ListItems>();
		
		//add the members of list
		
		list.add(new ListItems(1,"I"));
		list.add(new ListItems(2,"AM"));
		list.add(new ListItems(3,"PRADEEP"));
		list.add(new ListItems(4,"AHIRWAR"));
		list.add(new ListItems(5,"FROM"));
		list.add(new ListItems(6,"BHOPAL"));
		
		//Map which will store the list items
		
		Map<Integer,String> map=new HashMap<Integer,String>();
		
		//Old version
		
		for(ListItems n : list) {
			map.put(n.getKey(), n.getValue());
		}
		
		
		System.out.println(map);
		
		//USING THE JAVA 8 NEW VERSION
		
		list.forEach((n) -> {
			map.put(n.getKey(), n.getValue());
		});
		
		System.out.println("============USING NEW VERSION==========");
		System.out.println(map);
		
		
	}

}
