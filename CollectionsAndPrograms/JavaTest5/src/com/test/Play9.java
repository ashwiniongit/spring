package com.test;
import java.util.*;

public class Play9 {
	
	static List<Integer> flattenedList = new ArrayList<Integer>();

	public static void main(String[] args) throws Exception{
	    Object[] array = { 1, 2, new Object[]{ 3, 4, new Object[]{ 5 }, 6, 7 }, 8, 9, 10 };
	    
        Integer[] flattenedArray = flatten(array);
        
        System.out.println(Arrays.toString(flattenedArray));
        
	}
	
	public static Integer[] flatten(Object[] inputArray) throws Exception {
	    
	    for(Object o : inputArray) {
	    	if(o instanceof Object[]) {
	    		flatten((Object[]) o);
				
			}else {
				flattenedList.add((Integer)o);
			}
	    }
	    Integer[] flattenedArray = new Integer[flattenedList.size()];	
	    return (flattenedList.toArray(flattenedArray));		// converted integer class List to int[]
	    
	}
	    
}

    




