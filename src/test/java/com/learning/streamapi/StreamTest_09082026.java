package com.learning.streamapi;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;

public class StreamTest_09082026 {
	@Test
	public void testcase1() { //Check for Negative Numbers
		List<Integer> numbers = List.of(3, 7, 12, -4, 9);
		boolean expectedValue=true;
		var actualValue=Testclass_09082026.checkingForNegativeNum(numbers);
		assertThat(actualValue)
		.isNotNull()
		.isEqualTo(expectedValue);
	}
	
	@Test
	public void testcase2() {  //Check if All Strings are Non-Blank
		List<String> names = List.of("Alice", "Bob", "Charlie", "David");
		boolean ExpectedValue=true;
		boolean actualValue=Testclass_09082026.checkingNonblock(names);
		assertThat(actualValue)
		.isEqualTo(ExpectedValue);
		
	}
	
	@Test
	public void testcase3() { //Verify Out-of-Stock Items
		List<Product> products = List.of(
			    new Product("Pen", "Stationery", 1.5, 100),
			    new Product("Notebook", "Stationery", 3.0, 50),
			    new Product("Eraser", "Stationery", 0.5, 0)
			);
		boolean expectedValue=false;
		boolean actualValue=Testclass_09082026.checkingStock(products);
		assertThat(actualValue)
		.isEqualTo(expectedValue);
		
	}
	
	@Test
	public void testcase4() { //Find First Word Starting with Specific Letter 'Z'
		List<String> words = List.of("Apple", "Zebra", "Banana", "Zinc");
		String expectedValue="Zebra";
		String autualValue=Testclass_09082026.checkingChar(words);
		assertThat(autualValue)
		.isNotBlank()
		.isEqualTo(expectedValue);
	}

}
