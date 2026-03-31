package com.test;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Play13 {
    
	public static void main(String[] args){
		
		List<Employee2> li = new ArrayList<>();
		li.add(new Employee2("A","IT",45000));
		li.add(new Employee2("B","HR",55000));
		li.add(new Employee2("C","TECH",45000));
		li.add(new Employee2("D","IT",65000));
		li.add(new Employee2("E","HR",57000));
		li.add(new Employee2("F","IT",89000));
		li.add(new Employee2("G","IT",99000));
		
		System.out.println("the list is= "+li);
		
		Map<String, List<Integer>> mp = li.stream().collect(Collectors.groupingBy(Employee2::getDepartment,
														Collectors.mapping(Employee2::getSalary,Collectors.toList())));
		mp.forEach((dept,salaryList)->{
			salaryList.stream().sorted(Comparator.reverseOrder())
				.skip(1).limit(1).forEach(x->System.out.print(dept+" = "+x));
			System.out.println();
		});
		
		//System.out.println(mp);
		
		// 0 1 1 2 3 5
		// abcd
		// b acd, (acd,b) > (cd,ba) > bac,d > bacd
	}
	
 
}
