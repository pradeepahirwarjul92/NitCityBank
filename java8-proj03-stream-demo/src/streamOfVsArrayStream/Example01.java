package streamOfVsArrayStream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example01 {
	
	public static void main(String[] args) {
		//Creating an integer array
		int arr[]= {1,2,3,4,5};
		
		//----------using Arrays.stream() -------------
		//to convert int array into stream
		
		IntStream intStream= Arrays.stream(arr);
		
		//Displaying the each element of intStream
		
		
		intStream.forEach(str -> System.out.print(str + " "));
		
		// -----------Using Stream.of() ------------
		
		// to convert int array into stream
		
		Stream<int[]>  stream =Stream.of(arr);
		
		System.out.println();
		stream.forEach(str -> System.out.print(str + " "));
	}

}
