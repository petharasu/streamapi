package com.learning.streamapi;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.OptionalDouble;

import org.junit.jupiter.api.Test;

//record Transaction(String id, String type, double amount) {}
public class StreamTest_08082026 {
	
	@Test
	public void Testcase1() {
		List<Transaction> data = List.of(
			    new Transaction("T1", "CREDIT", 150.0),
			    new Transaction("T2", "DEBIT", 50.0),
			    new Transaction("T3", "CREDIT", 80.0),
			    new Transaction("T4", "CREDIT", 500.0)
			);
		var actualResult=Testclass_08082026.method3(data);
		List<Transaction> expectedResult=List.of(
			    new Transaction("T1", "CREDIT", 150.0),
			    new Transaction("T4", "CREDIT", 500.0)
			);
		assertThat(actualResult)
		.isNotEmpty()
		.isEqualTo(expectedResult);
	}
	
	@Test
	public void testcase2() {
		List<Book> books = List.of(
			    new Book("Book A", "Author 1", 100, 4.0),
			    new Book("Book B", "Author 2", 200, 4.2),
			    new Book("Book C", "Author 3", 300, 4.5)
			);
		double expectedValue=200.0d;
		OptionalDouble actualValue=Testclass_08082026.method4(books);
		System.out.println("Page No "+actualValue.getAsDouble());
		double b=actualValue.getAsDouble();
		assertThat(b)
		.isPositive()
		.isEqualTo(expectedValue);
	}

}
