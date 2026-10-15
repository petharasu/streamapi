package com.learning.streamapi;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class InterviewPractice {

	public static void main(String[] args) {
//		findDuplicateChar();
		findMissingNum();
	}

	private static void findMissingNum() {
		
		
	}

	private static void findDuplicateChar() {
		String input = "Welcome to interview";
			
	    	input.chars()
	        
	        .mapToObj(item -> (char) item)
	        .filter(item -> item != ' ')
	        .collect(Collectors.groupingBy(
	            item -> Character.toUpperCase(item),
	            LinkedHashMap::new,
	            Collectors.counting()
	        ))
	        .entrySet()
	        .stream()
	        .filter(item -> item.getValue() ==1)
	        .map(item -> item.getKey())
	        .findFirst();
//	        .forEach(System.out::println);
	    
		
	}

}
