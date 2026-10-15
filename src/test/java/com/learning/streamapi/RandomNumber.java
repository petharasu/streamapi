package com.learning.streamapi;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		generatingRandomNumber();

	}

	private static void generatingRandomNumber() {
		int inputValueRange = 50;
		Random object = new Random();
		IO.println(object.nextInt(inputValueRange));
	}

}
