package streamOfVsArrayStream;

import java.util.stream.Stream;

public class StreamOfDemo {
	
	public static void main(String[] args) {
		
		//creating an stream
		Stream stream=	Stream.of("Geeks","of","Geeks");
		
		//Displaying the sequential ordered stream
		
		stream.forEach(str -> System.out.print(str + " "));
	}

}
