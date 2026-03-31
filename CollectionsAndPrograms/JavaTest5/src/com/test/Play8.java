package com.test;
import java.util.*;

public class Play8 {

    public static void main(String[] args) throws Exception {
    
    	List<Object> li = new ArrayList<Object>();
    	
    	 Object[] array = { 1, 2, new Object[]{ 3, 4, new Object[]{ 5 }, 6, 7 }, 8, 9, 10 };
    	 flatten(array,li);

    	 for(Object i : li) {
    		 System.out.print(i);
    	 }
    	
    }
	public static void flatten(Object[] inputArray, List<Object> li) throws Exception {
	    int i=0;
	    for(Object o : inputArray){
	        if(o instanceof Object[]){
	            flatten((Object[]) o, li);
	        }else{
	            li.add(o);
	        }
	    }
	    
	}
	    
}

    




