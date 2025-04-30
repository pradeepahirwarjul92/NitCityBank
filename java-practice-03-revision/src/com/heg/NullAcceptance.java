package com.heg;

public class NullAcceptance {
	
	public static void main(String[] args) {
		foo(null);
	}
	
	public static void foo(Object obj) {
		System.out.println("Object argumant class");
	}

	public static void foo(String str) {
		System.out.println("String argumant class");
	}

}
