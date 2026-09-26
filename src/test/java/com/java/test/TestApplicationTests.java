package com.java.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

class TestApplicationTests {

	List<Employee> employees = List.of(
			new Employee(1, "Aryan", "IT", 70000, 25),
			new Employee(2, "Rahul", "HR", 50000, 28),
			new Employee(3, "Priya", "IT", 90000, 30),
			new Employee(4, "Amit", "Finance", 65000, 35),
			new Employee(5, "Neha", "IT", 80000, 27),
			new Employee(6, "Rohit", "HR", 55000, 24),
			new Employee(7, "Sneha", "Finance", 75000, 29),
			new Employee(8, "Vikas", "IT", 90000, 32),
			new Employee(9, "Anjali", "HR", 60000, 26),
			new Employee(10, "Karan", "Finance", 70000, 31)
	);


	@Test
	void printAllEMps() {
           this.employees.forEach(System.out::println);
	}

	@Test
	void empBySalary(){
		this.employees.stream().filter(employee -> employee.getSalary() > 70000).forEach(System.out::println);
	}

}