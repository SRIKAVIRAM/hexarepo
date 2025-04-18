package com.hexa.basics;

public class Student {
	String studName;
	String city;
	
	
	public static void main(String[] args) {
		Student student= new Student();
		student.studName="SRIKAVI";
		student.city="CHENNAI";
		System.out.println("Name "+student.studName);
		System.out.println("City "+student.city);
		
		Student student2= new Student();
		student2.studName="ANJANA";
		student2.city="BANGALORE";
		System.out.println("Name "+ student2.studName);
		System.out.println("City "+student2.city);
		
	}
}
