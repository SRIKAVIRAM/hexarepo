package com.training.emp;

public class Employee {
	private String employeeName;
	private int employeeId;
	private String city;
	private int salary;
	
	public Employee() {
	}
	public Employee(String employeeName,int employeeId,String city,int salary) {
		this.employeeName=employeeName;
		this.employeeId=employeeId;
		this.city=city;
		this.salary=salary;
		
	}
	public String getemployeeName() {
		return employeeName;
	}
	public void setemployeeName() {
		this.employeeName=employeeName;
	}
	public int getemployeeId() {
		return employeeId;
	}
	public void setemployeeId() {
		this.employeeId=employeeId;
	}
	public String getCity() {
        return city;
    }

    public void setCity() {
        this.city = city;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary() {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee [Name = " + employeeName + ", ID = " + employeeId +
               ", City = " + city + ", Salary = " + salary + "]";
    }
}

   