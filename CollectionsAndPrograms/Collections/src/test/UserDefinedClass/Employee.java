package test.UserDefinedClass;

public class Employee implements Comparable<Employee> {

	String name;
	int eid;
	
	Employee(String name, int eid){
		this.name=name;
		this.eid=eid;
	}
	
	public String toString(){
		return name+"--"+eid;
	}
	

	public int compareTo(Employee obj) {
		int eid1= this.eid;
		Employee e = (Employee)obj;
		int eid2=e.eid;
		
		if(eid1<eid2)
			return -1;
		else if(eid1>eid2)
			return +1;
		else
			return 0;
	}

}
