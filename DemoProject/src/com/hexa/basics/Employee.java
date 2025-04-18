package com.hexa.basics;

public class Employee {
	String employeeName;
	double salary;

	public Employee(String employeeName, double salary) {
		super();
		this.employeeName = employeeName;
		this.salary = salary;
	}
	
	void printDetails() {
		System.out.println("Employee Name: "+employeeName);
		System.out.println("Salary: "+salary);
	}
}


