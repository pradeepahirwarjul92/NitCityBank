package com.heg.iterator;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExample {
	
	public static void main(String[] args) {
	
		Vector<String> vector=new Vector<String>();
		vector.addElement("AARUL");
		vector.addElement("BANS");
		vector.addElement("CHAGAN");
		vector.addElement("DEEPAK");
		
		Enumeration<String> enume= vector.elements();
		while(enume.hasMoreElements()) {
			System.out.println(enume.nextElement());
		}
	}

}
