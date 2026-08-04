package com.learning.streamapi;

import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
    }
    public static Integer method10(List<Integer> numbers) {
//		List<Integer> numbers = List.of(14, 35, 9, 88, 42, 61);
		Integer result=numbers.stream()
		.sorted(Comparator.reverseOrder())
		.findFirst().orElse(0);
		System.out.println("Max Value  "+result);
		return result;
	}
    
}
