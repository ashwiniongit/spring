package com.test;
import java.util.*;
import java.util.stream.Collectors;

public class Play11 {
	
	public static void main(String[] args) throws Exception{
		
		List<Employee> li = new ArrayList<>();
		li.add(new Employee(1, "A", 455656));
		li.add(new Employee(2, "B", 232334));
		li.add(new Employee(3, "C", 100000));
		li.add(new Employee(4, "D", 230004));
		li.add(new Employee(5, "E", 100000));
		li.add(new Employee(6, "F", 100000));
		
		li.stream()
			.sorted(Comparator.comparing(Employee::getSalary).reversed())
				.skip(1).limit(2).forEach(System.out::println);
		
	}
	    
}

    




