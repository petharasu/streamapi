package com.learning.streamapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.junit.Test;

import com.learning.streamapi.Testclass_05082026.Student;

public class LearningStream_07092026 {

	public static List<String> sortingInput(List<String> data) {

		List<String> result = data.stream()
				.sorted(Comparator.comparing(eachitems -> eachitems))
//				.sorted(String.CASE_INSENSITIVE_ORDER)
				.collect(Collectors.toList());

		return result;

	}

	public static void sortEmployeeSalary(List<Employee> data) {
		IO.println(data.stream()
				// .map(Employee::salary)
				.sorted(Comparator.comparing(Employee::salary))
				.collect(Collectors.toList()));

	}

	public static void sortingBookRate(List<Book> Inputdata) {
		System.out.println(
		Inputdata.stream()
		.sorted(Comparator.comparing(Book::rating))
		.collect(Collectors.toList()));
	}
	
	public static void groupBywordslength(List<String> inputdata) {
		Map<Integer, List<String>> outputvalue=inputdata.stream()
		.collect(Collectors.groupingBy(String::length));
		
		IO.println("output list "+outputvalue);
		
	}
	
	public static void groupEmployeeByDepartment(List<Employee> inputData) {
		IO.println(
		inputData.stream()
		.collect(Collectors.groupingBy(Employee::department)));
	}
	
	public static void coutEmployeeDepartment(List<Employee> inputData) {
		IO.println(
		inputData.stream()
		.collect(Collectors.groupingBy(Employee::department,Collectors.counting())));
	}
	
	public static void averageSalaryByDepartment(List<Employee> inputData) {
		IO.println(
		inputData.stream()
		.collect(Collectors.groupingBy(Employee::department,
				Collectors.averagingDouble(Employee::salary))));
	}
	
	public static void collectUnigueCategory(List<Product> products) {
		IO.println(
		products.stream()
		.map(items->items.category())
		.collect(Collectors.toSet()));
		
	}
	
	public static void mapProductNametoPrice(List<Product> products) {
		Map<String,Double> result=products.stream()
		.collect(Collectors.toMap(item->item.name(), item->item.price(),(eone,newone)->newone));
		IO.println("final result "+result);
	}
	
	public static void countingBookBasedonAuthor(List<Book> books) {
		System.out.println(
		books.stream()
		.collect(Collectors.groupingBy(items->items.author(),LinkedHashMap::new,Collectors.counting())));
		
	}
	public static void nestedString(List<List<String>> nested) {
		List<String> result=
		nested.stream()
		.flatMap(item -> item.stream())
		.collect(Collectors.toList());
		System.out.println("Nested list "+result);
	}
	
	public static void extractUniqueSubjects(List<Student> students) {
		System.out.println(
		students.stream()
		.flatMap(items->items.subjects().stream())
		.distinct()
		.collect(Collectors.toList()));
		
	}
	
	public static void spliteachWord(List<String> sentences) {
		System.out.println(
		sentences.stream()
		.map(item->item.split(" "))
		.flatMap(items->Arrays.stream(items))
		.collect(Collectors.toList()));
		
		
	}
	public static void extractDigits(List<String> numberStrings) {
		System.out.println(
		numberStrings.stream()
		.flatMap(items->items.chars()
				.mapToObj(item-> (char) item))
		.distinct()
		.collect(Collectors.toList()));
	}
	
	public static void findExpensiveProductbasedCategory(List<Product> products) {
		System.out.println(
		products.stream()
		.collect(Collectors.groupingBy(items->items.category()
				,Collectors.maxBy(Comparator.comparing(item->item.price()))
				
				)));
	}
	
	public static void findTop3HigestSalary(List<Employee> employees) {
		System.out.println(
		employees.stream()
		.map(item->item.salary())
		.sorted(Comparator.reverseOrder())
		.limit(3)
		.collect(Collectors.toList()));
	}
	
	public static void characterFrequency(String input) {
		System.out.println(
		input.chars()
		.mapToObj(item-> (char) item)
		.filter(item->item !=' ')
		.collect(Collectors.groupingBy(items->items,LinkedHashMap::new,Collectors.counting())));
	}
	
	public static void method() {
		String input="i love india";
		System.out.println(
		input.chars()
		.mapToObj(eachchar->(char)eachchar)
		.filter(eachchar->(eachchar!='a' && eachchar!='e'
				&& eachchar!='i'&& eachchar!='o'&& eachchar!='u'))
		.map(String::valueOf)
		.collect(Collectors.joining("")));
		
	
	}

}
