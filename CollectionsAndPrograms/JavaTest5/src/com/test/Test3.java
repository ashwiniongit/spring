package com.test;

import java.util.Arrays;
import java.util.*;

public class Test3 {

	public static void main(String[] args) {
		
		//A o1 = new A();
		//B o2 = new B();
		
//		int[] arr = {1,2,3,4,5,6,7,8,9};
//		// [1,6] , [3,4], [7]
//		int k = 7;
//		int l=0,r=arr.length-1;
//		
//		for(int i=0;i<arr.length-1;i++) {
//			Arrays.stream(arr).findAny().)
//		}
		
		int[] A = {1,1,2,2,4,4,6,6};
		Map<Integer,Integer> mp = new HashMap<>();
		for(int i=0;i<A.length;i++) {
			if(mp.containsKey(A[i])) {
				mp.put(A[i], mp.get(A[i])+1);
			}
			else {
				mp.put(A[i], 1);
			}
		}
		System.out.println(mp);
		
		C o3 = C.getC();
		System.out.println(o3);
		
		C o4 = C.getC();
		System.out.println(o4);
		
		A o1 = new A();
		B b = new B();
		A c = new B();
		//B d = new A(); // not correct
		
		int i = -2;
		int j = 8 - i;
		System.out.println(j);

	}

}
