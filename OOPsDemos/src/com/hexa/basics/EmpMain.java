package com.hexa.basics;

public class EmpMain {
    public static void main(String[] args) {
        Employee employee = new Employee("kavi", 8000.0);
        System.out.println("Name " + employee.empName);
        System.out.println("Salary " + employee.salary);

        Employee employee2 = new Employee("sri", 9000.0);
        System.out.println("Name " + employee2.empName);
        System.out.println("Salary " + employee2.salary);
    }
}

