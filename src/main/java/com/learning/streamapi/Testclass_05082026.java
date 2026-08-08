package com.learning.streamapi;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Testclass_05082026 {
	record Book(String title, String author, int pages, double rating) {}
	record Student(String name, int gradeLevel, double gpa, List<String> subjects) {}
	public static void main(String agrs[]) {
//	method1();//cheap in stock product
//		method2();//Return a list of book titles written by "George Orwell"
		method3();
		
	}

	private static void method3() {
		List<Student> students = List.of(
			    new Student("John", 10, 3.8, List.of("Math", "Physics")),
			    new Student("Sarah", 11, 3.2, List.of("English", "History")),
			    new Student("Emma", 10, 3.9, List.of("Math", "Chemistry"))
			);
		List<String> result=students.stream()
		.filter(items->items.gpa>3.5)
		.map(items->items.name())
		.toList();
		System.out.println("student name "+result);
		
	}

	private static void method2() {
		List<Book> books = List.of(
			    new Book("1984", "George Orwell", 328, 4.7),
			    new Book("Animal Farm", "George Orwell", 112, 4.5),
			    new Book("Brave New World", "Aldous Huxley", 288, 4.6)
			);
		books.stream()
		.filter(items->items.author().equals("George Orwell"))
		.map(items->items.title())
		.collect(Collectors.toList());
	}

	private static void method1() {
		List<Product> products = List.of(
			    new Product("Mouse", "Electronics", 25.0, 15),
			    new Product("Keyboard", "Electronics", 45.0, 0),
			    new Product("Monitor", "Electronics", 200.0, 8),
			    new Product("Mousepad", "Electronics", 15.0, 50)
			);
		products.stream()
		.filter(items->(items.price()<=50.0) &&(items.stock()!=0))
		.forEach(System.out::println);
		
		
	}

	public static int totalStackCount(List<Product> products) {
		
		return 0;
	}
}
