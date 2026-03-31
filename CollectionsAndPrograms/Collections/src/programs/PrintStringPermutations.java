package programs;

import java.util.Scanner;

public class PrintStringPermutations {
	
	// note : total no of permutations for 3 length string will be 3 factorial = 3*2*1 = 6
	
	public static int count = 0;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		printPermutations(str, "");

	}
	
	public static void printPermutations(String ques,String answerSoFar) {
		
		if(ques.length()==0) {
			System.out.println(answerSoFar+" count= "+(++count));	// this will be printed 6 times when ques=abc is their
			return;
		}
		for(int i=0; i<ques.length(); i++)
		{
			char ch = ques.charAt(i);	// when ques=abc then ch=a, ch=b, ch=c and then split every time
			String quesLeftPart = ques.substring(0, i);
			String quesRightPart = ques.substring(i+1);
			String restOfQues = quesLeftPart + quesRightPart;
			printPermutations(restOfQues,answerSoFar+ch);
		}
	}

}
