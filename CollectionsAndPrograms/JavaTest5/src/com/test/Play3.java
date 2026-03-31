package com.test;
import java.util.*;
import java.util.stream.Collectors;

public class Play3 {

	public static void main(String[] args) {
		
//		String str = "abcdefghi";
//		char[] ca = str.toCharArray();
//		
//		for(int j = str.length()-1; j>=0; j--) {
//			System.out.print(ca[j]);
//		}
		

	    //remove duplicate elements from a sorted linked list 
		// Example: 1->2->3->3->4->5->6->6 
			// Output: 1->2->3->4->5->6

		LinkedList<Integer> li = new LinkedList<>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(3);
		li.add(4);
		li.add(5);
		li.add(6);
		li.add(6);
		Set<Integer> hs = new HashSet<Integer>();
//		li.stream().filter(x->hs.add(x)).forEach(x->System.out.print(x+"->"));
//		List<Integer> lia = new ArrayList<Integer>();
//		lia = li.stream().filter(x->hs.add(x)).collect(Collectors.toList());
		
		LinkedList<Integer> li2 = new LinkedList<>(li.stream().filter(x->hs.add(x)).collect(Collectors.toList()));
		for(Integer i : li2) {
			System.out.print(i+" ");
		}
	}
   
}
