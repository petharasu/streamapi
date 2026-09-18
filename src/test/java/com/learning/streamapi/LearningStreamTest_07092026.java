package com.learning.streamapi;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.Test;

import com.learning.streamapi.Testclass_05082026.Student;

public class LearningStreamTest_07092026 {

//	@Test
//	public void testcase1() { //Sort Strings Alphabetically Ignoring Case
//		List<String> cities = List.of("paris", "London", "tokyo", "Amsterdam");
//		List<String> actualList=LearningStream_07092026.sortingInput(cities);
//		List<String> expectedList=List.of("Amsterdam", "London", "paris", "tokyo");
//		IO.println("Actual List "+actualList);
//		
//		assertThat(actualList)
//		.isEqualTo(expectedList);
//	}
//	
//	@Test
//	public void testcase2() {//Sort Employees by Salary Ascending
//		
//		List<Employee> employees = List.of(
//			    new Employee("Alice", "IT", 75000, 28),
//			    new Employee("Bob", "IT", 50000, 35),
//			    new Employee("Charlie", "IT", 62000, 30)
//			);
//		LearningStream_07092026.sortEmployeeSalary(employees);
//	}
//	
//	@Test
//	public void testcase3() {//Sort Books by Rating Descending
//		List<Book> books = List.of(
//			    new Book("Book A", "Author 1", 200, 4.2),
//			    new Book("Book B", "Author 2", 150, 4.9),
//			    new Book("Book C", "Author 3", 300, 4.7)
//			);
//		LearningStream_07092026.sortingBookRate(books);
//	}
//	
//	@Test
//	public void testcase4() {
//		List<String> words = List.of("a", "bb", "ccc", "dd", "e", "ffff");
//		LearningStream_07092026.groupBywordslength(words);
//	}
//	
//	@Test
//	public void testcase5() {//Group Employees by Department
//		List<Employee> employees = List.of(
//			    new Employee("Alice", "IT", 70000, 28),
//			    new Employee("Bob", "HR", 50000, 35),
//			    new Employee("Charlie", "IT", 80000, 30)
//			);
//		LearningStream_07092026.groupEmployeeByDepartment(employees);
//	}
//	
//	@Test
//	public void testcase6() {//Count Employees per Department
//		List<Employee> employees = List.of(
//			    new Employee("Alice", "IT", 70000, 28),
//			    new Employee("Bob", "HR", 50000, 35),
//			    new Employee("Charlie", "IT", 80000, 30),
//			    new Employee("Diana", "IT", 90000, 32)
//			);
//		LearningStream_07092026.coutEmployeeDepartment(employees);
//	}
//	
//	@Test
//	public void testcase7() {
//		List<Employee> employees = List.of(
//			    new Employee("Alice", "IT", 70000, 28),
//			    new Employee("Bob", "HR", 50000, 35),
//			    new Employee("Charlie", "IT", 90000, 30)
//			);
//		LearningStream_07092026.averageSalaryByDepartment(employees);
//	}

//	@Test
//	public void testcase8() {
//		List<Product> products = List.of(
//			    new Product("TV", "Electronics", 500.0, 5),
//			    new Product("Sofa", "Furniture", 700.0, 2),
//			    new Product("Radio", "Electronics", 50.0, 20)
//			);
//		LearningStream_07092026.collectUnigueCategory(products);
//	}
	
//	@Test
//	public void testcase9() {
//		List<Product> products = List.of(
//			    new Product("Apple", "Fruit", 1.2, 100),
//			    new Product("Banana", "Fruit", 0.8, 150),
//			    new Product("Apple", "Fruit", 1.9, 100)
//			);
//		LearningStream_07092026.mapProductNametoPrice(products);
//	}

//	@Test
//	public void testcase10() {
//		List<Book> books = List.of(
//			    new Book("Book 1", "Author A", 100, 4.0),
//			    new Book("Book 2", "Author B", 200, 4.5),
//			    new Book("Book 3", "Author A", 150, 4.2)
//			);
//		LearningStream_07092026.countingBookBasedonAuthor(books);
//	}
	
//	@Test
//	public void testcase11() {
//		List<List<String>> nested = List.of(
//			    List.of("a", "b"),
//			    List.of("c", "d", "e"),
//			    List.of("f")
//			);
//		LearningStream_07092026.nestedString(nested);
//	}
//	
//	@Test
//	public void testcase12() {
//		List<Student> students = List.of(
//			    new Student("John", 10, 3.8, List.of("Math", "Physics")),
//			    new Student("Sarah", 11, 3.2, List.of("Physics", "Chemistry")),
//			    new Student("Emma", 10, 3.9, List.of("Math", "Biology"))
//			);
//		LearningStream_07092026.extractUniqueSubjects(students);
//	}
	
//	@Test
//	public void testcase13() {
//		List<String> sentences = List.of("Hello world", "Java stream api", "is powerful");
//		LearningStream_07092026.spliteachWord(sentences);
//	}
//	
//	@Test
//	public void testcase14() {
//		List<String> numberStrings = List.of("123", "345", "156");
//		LearningStream_07092026.extractDigits(numberStrings);
//	}
	
	@Test
	public void testcase15() {
		List<Product> products = List.of(
			    new Product("Phone", "Electronics", 800.0, 10),
			    new Product("Laptop", "Electronics", 1200.0, 5),
			    new Product("Chair", "Furniture", 150.0, 20),
			    new Product("Desk", "Furniture", 300.0, 8)
			);
		LearningStream_07092026.findExpensiveProductbasedCategory(products);
	}
	
	@Test
	public void testcase16() {
		List<Employee> employees = List.of(
			    new Employee("Alice", "IT", 70000, 28),
			    new Employee("Bob", "HR", 50000, 35),
			    new Employee("Charlie", "IT", 95000, 30),
			    new Employee("Diana", "Finance", 110000, 40),
			    new Employee("Eve", "IT", 85000, 26)
			);
		LearningStream_07092026.findTop3HigestSalary(employees);
	}
	
	@Test
	public void testcase17() {
		String input = "stream api";
		LearningStream_07092026.characterFrequency(input);
	}
}
