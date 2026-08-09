package com.learning.streamapi;

import java.util.List;



public class Testclass_09082026 {
//	public static void main(String args[]) {
//		String input="Zebra";
//		System.out.println( "char "+input.charAt(0));
//		
//	}
	
	public static boolean checkingForNegativeNum(List<Integer> numbers) {
		if(numbers==null || numbers.isEmpty()) {
			return false;
		}
		boolean result=numbers.stream()
		.anyMatch(items->items<0);
		System.out.println("result Value "+ result);
		
		return result;
	}
	
	public static boolean checkingNonblock(List<String> names) {
		boolean result=names.stream()
		.allMatch(items->!items.isBlank());
		System.out.println("final Value "+ result);
		return result;
	}
	
	public static boolean checkingStock(List<Product> products) {
		boolean result=products.stream()
		.allMatch(items->items.stock()>0);
		return result;
	}
	
	public static String checkingChar(List<String> words) {
		if(words==null||words.isEmpty()) {
			return String.valueOf("");
		}
		String result=words.stream()
		.filter(items->items.startsWith("Z"))
		.map(items->items)
		.findFirst()
		.orElse("no elements is matching the condition");
		System.out.println("matching String "+ result);
		return result;
	}
	

}
