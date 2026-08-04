package com.learning.streamapi;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;

public class StreamTest {
	@Test
	void dotest() {
		assertThat("")
		.isEmpty();
	}
	
	@Test
	void test1() {
		List<Integer> ls=List.of(1,20);
		int ExpectedValue=20;
		int actualValue=App.method10(ls);
		assertThat(actualValue)
		.isPositive()
		.isEqualTo(ExpectedValue);
	}

}
