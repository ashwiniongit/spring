package test.UserDefinedClass;

import java.util.*;

public class Main {
	
	public static void main(String args[]) {
		Employee e1 = new Employee("nag",100);					  //ArrayList<Employee> al=new ArrayList<Student>();    
		Employee e2 = new Employee("balaiah",200);					//al.add(new Employee("nag",100));    
		Employee e3 = new Employee("chiru",50);						//al.add(new Employee("balaiah",200));
		Employee e4 = new Employee("venId",150);					//al.add(new Employee("chiru",50));
		Employee e5 = new Employee("nag",100);						//al.add(new Employee("nag",100));
		
		TreeSet<Employee> t = new TreeSet<>();  //-> this constructor means DNSO.		//Collections.sort(al,new MyComparator());  
		t.add(e1);
		t.add(e2);																							
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println(t);
	}
}
