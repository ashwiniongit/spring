package test;

import java.util.*;

public class Treeset {
	
	public static void main(String args[]) {
		TreeSet<Integer> ts = new TreeSet<>();
		System.out.println("Size of treeset= "+ts.size());
		ts.add(45);
		System.out.println("Size of treeset after addition= "+ts.size());
	}
}
