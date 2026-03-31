package com.test;
import java.util.*;
import java.util.stream.Collectors;

public class Play2  {

	public static void main(String[] args) {
		
		// empId, name, salary
		// give emp with ascending order of salary
		
		List<Employee> li = new ArrayList<>();
		li.add(new Employee(1, "A", 455656));
		li.add(new Employee(2, "B", 232334));
		li.add(new Employee(3, "C", 100000));
		li.add(new Employee(4, "D", 232334));
		li.add(new Employee(5, "E", 100000));
		li.add(new Employee(6, "F", 100000));
		
		List<Employee> sortedList = li.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
		              
		Set<Integer> hs = new HashSet<>();
		Map<Integer,Employee> mp = new HashMap<>();
		List<Employee> sameSalaryList = new ArrayList<Employee>();
		
		for(Employee e : sortedList) {
			//System.out.println(e);
			if(mp.containsKey(e.getSalary())) {
				//System.out.println(mp.get(e.getSalary()));
				//System.out.println(e);
				sameSalaryList.add(e);
				sameSalaryList.add(mp.get(e.getSalary()));
			}
			else {
				mp.put(e.getSalary(), e);
			}
		}
		
		System.out.println("---------------------------------------------");
		for(Employee e: sameSalaryList) {
			System.out.println(e);
		}
		
		
	
		
	}
	
}
