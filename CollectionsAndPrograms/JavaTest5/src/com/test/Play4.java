package com.test;
import java.util.*;
import java.util.stream.Collectors;

public class Play4 {
    
	public static void main(String[] args){
		
		// reverse the string without using any external thing
		String s = "employee";
		char[] ca = s.toCharArray();
		for(int i=ca.length-1;i>=0;i--) {
			System.out.print(ca[i]);
		}
		System.out.println();
		for(int j=s.length()-1;j>=0;j--) {
			System.out.print(s.charAt(j));
		}
		
    	//String s = new String("5"); 
    	System.out.println(1 + 10 + s + 1 + 10);
    	System.out.println(1 + 10);
	    
	}
 
}
