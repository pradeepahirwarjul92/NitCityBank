package com.heg.streamToImmutableCollection;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;

public class Example02 {

	public static void main(String[] args) {

		// 1. Integer stream
		System.out.println("Integer stream :: ");
		IntStream.range(1, 10).forEach(e -> System.out.print(e + " "));

		// New line
		System.out.println();
		System.out.println();

		// 2. Integer Stream with skip

		System.out.println("Integer Stream with skip :: ");
		IntStream.range(1, 10).skip(5).forEach(e -> System.out.print(e + " "));

		// New line
		System.out.println();
		System.out.println();

		// 3. Integer Stream with sum
		System.out.println("Integer Stream with sum : ");
		System.out.println(IntStream.range(0, 5).sum());

		// New line
		System.out.println();

		// 4. Stream.of, sorted and findFirst

		System.out.println("Stream.of, sorted and findFirst : ");

		Arrays.asList("Java ", "Scala ", "Ruby ").stream().sorted().findFirst().ifPresent(System.out::println);

		// New line
		System.out.println();

		// 5. Stream from Array, sort, filter and print
		String[] names = { "AI", "Matlab", "Scikit", "TensorFlow", "OpenCV", "DeepLearning", "NLP", "NeuralNetworks",
				"Regression" };

		System.out.println("Stream from Array, sort, filter and print :: ");

		Arrays.stream(names).filter(x -> x.startsWith("S")).sorted().forEach(System.out::println);
		
		// New line
        System.out.println();
        // 6. average of squares of an int array
        System.out.println("Average of squares of an int array : ");
        
        Arrays.stream(new int[] {1,2,3})
        			.map(x -> x*x)
        			.average()
        			.ifPresent(System.out::println);
        
        // New line
        System.out.println();
        
        // Display message only
        System.out.println("Stream from List, filter and print : ");
        
        List<String> people=Arrays.asList("AI", "Matlab", "Scikit", "TensorFlow",
                			"OpenCV", "DeepLearning", "NLP","NeuralNetworks");
        
        people.stream()
        		.map(String::toLowerCase)
        		.filter(x -> x.startsWith("a"))
        		.forEach(System.out::println);
        
        // New line
        System.out.println();
        
        // 8. Reduction - sum
        // Display message only
        System.out.println("Reduction - sum : ");
        
        List<Double> numbers=Arrays.asList(7.3, 1.5, 4.8);
        double sum= numbers.stream().reduce(0.0,(Double a,Double b) -> a+b);
        System.out.println("SUM :: " +sum);
        
        System.out.println();
        //9. Reduction - summary statistics
        
        System.out.println("Reduction - summary statistics :: ");
        
        IntSummaryStatistics summary=	IntStream.of(7,2,19,88,73,4,10).summaryStatistics();
        
        System.out.println(summary);
        
        
        
        

	}
}
