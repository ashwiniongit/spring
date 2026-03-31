package com.test;
import java.util.*;
import java.util.stream.Collectors;

public class Play12 {
	
	public static void main(String[] args) throws Exception{
		
		// java streams to square the even no's and cube the odd no's
		List<Integer> li = new ArrayList<Integer>();
		li.add(3);
		li.add(1);
		li.add(2);
		li.add(4);
		li.add(5);
		li.add(6);
		
		List<Integer> li2 = li.stream().map(x->((x%2)!=0?(x*x*x):(x*x))).collect(Collectors.toList());
		for(Integer i: li2) {
			System.out.println(i);
		}
		
	}
	    
}

    




