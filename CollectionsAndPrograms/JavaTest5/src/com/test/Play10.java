package com.test;
import java.util.*;
import java.util.stream.Collectors;

public class Play10 {
	
	static List<Integer> flattenedList = new ArrayList<Integer>();

	public static void main(String[] args) throws Exception{
		
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(Arrays.toString(arr));
		System.out.println("---------------------------------------------------------------");
		
		List lst = Arrays.asList(arr);
		System.out.println(lst.toArray());
        
		System.out.println("---------------------------------------------------------------");
		int[] nums = { 1, 4, 2, -1, 6, 5 };
		List<Integer> list2 = Arrays.stream(nums).boxed().collect(Collectors.toList());
		list2.add(7);
		System.out.println(Arrays.toString(nums));
		System.out.println(list2);
		
		System.out.println("---------------------------------------------------------------");
		
		String myString = "RashmiKhanna";
		List<Character> lst2 = myString.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
		System.out.println(lst2);
		
		System.out.println("---------------------------------------------------------------");
		char[] charArray = { 'a', 'b', 'c', 'd', 'e' };
		String s = new String(charArray);
		System.out.println(s);
		
		System.out.println("---------------------------------------------------------------");
		
        String[] geeks = {"Rahul", "Utkarsh",
                "Shubham", "Neelam"};
		List<String> al = new ArrayList<String>();
		
		// adding elements of array to arrayList.
		Collections.addAll(al, geeks);
		
		System.out.println("---------------------------------------------------------------");
		int[] nums2 = { 1, 4, 2, -1, 6, 5 };
		List<char[]> list6 = Arrays.asList(charArray);
		System.out.println(list6);
		
        char[] charArr = {'a', 'b', 'c'};

        Character[] charArrBoxed = new String(charArr).chars()
                .mapToObj(c -> (char) c)
                .toArray(Character[]::new);

		
	}
	    
}

    




