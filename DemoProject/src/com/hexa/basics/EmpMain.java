package com.hexa.basics;

public class EmpMain {
	public static void main(String[] args) {
		Employee employee=new Employee("Arjun", 15000);
		employee.printDetails();
		Employee employee1=new Employee("Arun", 9000);
		employee1.printDetails();
		
		System.out.println();
		Manager manager=new Manager("Nithim",400,"Sri");
		manager.printDetails();
	}

}

