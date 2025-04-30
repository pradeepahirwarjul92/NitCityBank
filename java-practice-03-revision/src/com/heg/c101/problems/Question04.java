package com.heg.c101.problems;

public class Question04 {

	enum colorType {red, orange, yellow,green,blue,violet};
	
	public static void main(String[] args) {
		colorType shirt,pants;
		shirt=colorType.red;
		pants=colorType.blue;
		System.out.println("==SHIRT== " +shirt + "\n==PAINT== " +pants);
	}
}
