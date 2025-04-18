package com.hexa.basics;


public class Employee {
    String empName;
    double salary;

  
    public Employee(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
    }

    
    void printDetails() {
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
    }
}
