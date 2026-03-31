package com.test;
import java.util.*;

public class test {

	public static void main(String[] args) {
		
		String[] strArr={"java2blog","javaworld","javabean","tabletemp"};
		String prefix = "";
		String p = "";
		String q = "";
		int j=0;
		for(int i=0;i<strArr.length-1;i++)	
		{
			p = strArr[i];
			q = strArr[i+1];
			while(j<p.length())
			{
				if(p.charAt(j)==q.charAt(j))
				{	
					
					prefix = p.charAt(j)+"";
					System.out.print(prefix);
				}
				j++;
			}
		}
		System.out.println(prefix);

	}

}
