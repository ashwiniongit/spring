package test.StringNoDnso;

import java.util.*;

public class Main {
	
	public static void main(String args[]) {

		TreeSet<String> ts = new TreeSet<>(new MyComparator());
		ts.add("P");
		ts.add("W");
		ts.add("A");
		ts.add("C");
		System.out.println(ts);
	}
}
