package com.learning.streamapi;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

record Transaction(String id, String type, double amount) {}
record Book(String title, String author, int pages, double rating) {}

public class Testclass_08082026 {
//	record Transaction(String id, String type, double amount) {}
	public static void main(String[] args) {
//		String result=method1().orElse("no values");
//		System.out.println(result.toLowerCase());
//		method2();
	}
	private static void method2() {
		String name="████  █████ █████ █   █  ███  ████   ███   ████ █   █ \r\n"
				+ "█   █ █       █   █   █ █   █ █   █ █   █ █     █   █ \r\n"
				+ "████  ████    █   █████ █████ ████  █████  ███  █   █ \r\n"
				+ "█     █       █   █   █ █   █ █  █  █   █     █ █   █ \r\n"
				+ "█     █████   █   █   █ █   █ █   █ █   █ ████   ███  ";
	System.out.println(name);	
	
	String name2="""
			████  █████ █████ █   █  ███  ████   ███   ████ █   █ 
█   █ █       █   █   █ █   █ █   █ █   █ █     █   █ 
████  ████    █   █████ █████ ████  █████  ███  █   █ 
█     █       █   █   █ █   █ █  █  █   █     █ █   █ 
█     █████   █   █   █ █   █ █   █ █   █ ████   ███  			
			""";
	
	System.out.println("mutli line  "+name2);
			
	}
	public static Optional<String> method1() {
		String actualResult="value";
//		return Optional.of(actualResult);
		return Optional.empty();
//		return null;
	}
	
	public static void method3(List<Transaction> datas) {
		System.out.println(
		datas.stream()
		.filter(items->(items.type().equals("CREDIT"))&&(items.amount()>100.0d))
		.collect(Collectors.toList()));
		
//		return 0;
	}
	
	public static OptionalDouble method4(List<Book> books) {
		
		OptionalDouble result=books.stream()
		.mapToDouble(items->items.pages())
		.average();
		
		return result;
		
	}

}
