package com.test;

public class Employee2 {
	
	private String name;
	private String department;
	private int salary;
	
	public Employee2(String name, String department, int salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDepartment() {
		return department;
	}
	
	@Override
	public String toString() {
		return "Employee2 [name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}

	public int getSalary() {
		return salary;
	}
}
