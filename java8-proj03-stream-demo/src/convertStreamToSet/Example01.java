package convertStreamToSet;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example01 {
	
	public static void main(String[] args) {
		
		//creating a stream of Integers 
		
		Stream<Integer> stream= Stream.of(-2,-1,0,1,2);
		
		//Using stream.collect() to collect the elements of stream in a container
		
		Set<Integer> streamSet= stream.collect(Collectors.toSet());
		
		//Displaying the elements 
		
		streamSet.forEach(num -> System.out.println(num));
		
	}
}
