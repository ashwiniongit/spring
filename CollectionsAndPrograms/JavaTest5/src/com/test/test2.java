package com.test;
import java.util.*;

public class test2 {

	public static void main(String[] args) {
		
		String[] strArr={"java2blog","javaworld","javabean","javatemp", "javat", "java", "tempjava"};
		int size = strArr.length;
		if(size==0) {
			System.out.println("The longest prefix is= ");
		}
		else if(size == 1) {
			System.out.println("The longest prefix is= "+strArr[0]);
		}
		else {
			Arrays.sort(strArr);	// will sort in ascending order and based on the 1st character, then 2nd char and so on
			// {java, java2blog, javabean, javat, javatemp, javaworld}
			// then compare the 1st and the last string
			StringBuilder res = new StringBuilder();
			for(int i=0;i<strArr[0].length();i++)
			{
				if(strArr[i].charAt(i) == strArr[size-1].charAt(i)){
					res = res.append(strArr[i].charAt(i));
				}
				else {
					break;
				}
			}
			System.out.println("The longest common prefix is : " + res);
		}
	}

}
