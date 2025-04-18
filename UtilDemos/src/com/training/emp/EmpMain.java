package com.training.emp;
import java.util.ArrayList;
import java.util.List;


public class EmpMain {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Sri", 1, "Chennai", 30000));
        empList.add(new Employee("Pavi", 2, "Chennai", 2000));
        empList.add(new Employee("Priya", 3, "Chennai", 8000));
        empList.add(new Employee("Arjun", 104, "Bangalore", 5000));
        empList.add(new Employee("Kavi", 105, "Theni", 7000));
        
        for(Employee employee:empList) {
        	System.out.println(employee);
        }
       }

}