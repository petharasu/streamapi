package com.learning.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LearningStream_07102026 {
	
	public static void getWordslength(List<String> inputData) {
		System.out.println(
		inputData.stream()
		.filter(data-> data.toUpperCase().startsWith("A"))
		.map(data->data.length())
		.collect(Collectors.toList()));
	}
	
	public static void squareofNum(List<Integer> numbers) {
		System.out.println(
		numbers.stream()
		.map(data->Math.powExact(data, 2))
		.collect(Collectors.toList()));
	}
	
	public static void extractEmailDomain(List<String> emails) {
//		System.out.println(
//		emails.stream()
//		.map(data->data.split("@")[1])
//		.collect(Collectors.toList()));
		List<String[]> result = emails.stream()
		        .map(email -> email.split("@"))
		        .toList();
		for(String[] output:result) {
		System.out.println("emails "+Arrays.toString(output));
		}
		
	}
	
	public static void reverseString(List<String> words) {
		System.out.println(
		words.stream()
		.map(item->new StringBuilder(item).reverse().toString())
		.collect(Collectors.toList()));
	}
	
	public static void findMinlength(List<String> words) {
		System.out.println(
		words.stream()
		.collect(Collectors.minBy(Comparator.comparing(item->item.length()))));
		
	}
	
	public static void findAvg(List<Double> prices) {
		System.out.println(
		prices.stream()
		.collect(Collectors.averagingDouble(item->item)));
		
	}
	
	public static void sortByEmp(List<Employee> employees) {
		System.out.println(
		employees.stream()
		.sorted(Comparator.comparing(Employee::salary))
		.collect(Collectors.toList()));
	}

}
