package com.learning.streamapi;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



public class Testclass_23082026 {
	record Book(String title, String author, int pages, double rating) {}

	public static void main(String args[]) {
//		method1();//Sort Strings Alphabetically Ignoring Case
//		method2();//Sort Employees by Salary Ascending
//		method3();//Sort Books by Rating Descending
//		method4();//Sort Employees by Age then Name
		method5();//Partition Even and Odd Numbers
	}

	private static void method5() {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
		Map<Boolean,List<Integer>> result=numbers.stream()
		.collect(Collectors.partitioningBy(items->items%2==0));
		
		System.out.println(result);
		
		
	}

	private static void method4() {
		List<Employee> employees = List.of(
			    new Employee("Charlie", "IT", 60000, 30),
			    new Employee("Alice", "HR", 50000, 25),
			    new Employee("Bob", "IT", 70000, 30)
			);
		System.out.println(
		employees.stream()
		.sorted(Comparator.comparing(Employee::name))
		.sorted(Comparator.comparing(Employee::age))
		.toList());
	}

	private static void method3() {
		List<Book> books = List.of(
			    new Book("Book A", "Author 1", 200, 4.2),
			    new Book("Book B", "Author 2", 150, 4.9),
			    new Book("Book C", "Author 3", 300, 4.7)
			);
		System.out.println(
		books.stream()
//		.map()
		.sorted(Comparator.comparing(Book::rating).reversed())
		.toList());
		
	}

	private static void method2() {
		List<Employee> employees = List.of(
			    new Employee("Alice", "IT", 75000, 28),
			    new Employee("Bob", "IT", 50000, 35),
			    new Employee("Charlie", "IT", 62000, 30)
			);
		System.out.println(employees.stream()
		.sorted(Comparator.comparing(Employee::salary))
		.toList());
	}

	private static void method1() {
		List<String> cities = List.of("Paris", "london", "tokyo", "Amsterdam");
		cities.stream()
//		.map(eachitems->eachitems)
		
		.sorted(String.CASE_INSENSITIVE_ORDER)
		.forEach(System.out::println);
	}

}
