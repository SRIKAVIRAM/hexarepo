package com.hexa.basics;

public class Manager extends Employee {
	String city;

	public Manager(String employeeName, double salary, String city) {
		super(employeeName,salary);
		this.city = city;
	}
	void showCity() {
	System.out.println (city);
	
}
}