package com.learning.streamapi;



import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
public class StreamTest_05082026 {
	
	@Test
	void testCase1() {
		List<Product> testData = List.of(
			    new Product("Shirt", "Apparel", 20.0, 50),
			    new Product("Pants", "Apparel", 40.0, 30),
			    new Product("Jacket", "Apparel", 100.0, 10)
			);
		int expectedResult=90;
		int actualResult=Testclass_05082026.totalStackCount(testData);
		assertThat(actualResult)
		.isNotNull()
		.isPositive()
		.isEqualTo(expectedResult);
	}
	

}
