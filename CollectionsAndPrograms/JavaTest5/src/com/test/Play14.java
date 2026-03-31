package com.test;
import java.util.*;
import java.util.stream.Collectors;

public class Play14 {
    
	public static void main(String[] args){
		
		String st = "abcd";
		printPerms(st, "");
	    
	}
	
	public static void printPerms(String ques,String answerSoFar) {
		
		if(ques.length()==0) {
			System.out.print(answerSoFar+" ");
		}
		
		for(int i=0; i<ques.length(); i++) {
			String left = ques.substring(0,i);
			String right = ques.substring(i+1);
			String restOfQues = left+right;
			printPerms(restOfQues,answerSoFar+ques.charAt(i));
		}
	}
 
}
