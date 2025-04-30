package com.heg.methods;

import java.util.stream.DoubleStream;

public class MapToObjectDemo {
	
	public static void main(String[] args) {
		
		//creating a DoubleStream
		DoubleStream stream= DoubleStream.of(1.0,2.0,3.0,4.0);
		
		stream.mapToObj(num ->{
			return  num*num*num;
		})
		.forEach(System.out::println);
	}

}
