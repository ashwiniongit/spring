package programs;

// using recursion
public class ReverseString3 {

	public static void main(String[] args) {

		String str = "teachermadam";
		System.out.println("Length is= "+str.length());
		reverseString(str,str.length()-1);
	}
	
	public static void reverseString(String str, int pos) {
		if(pos>-1) {
			System.out.print(str.charAt(pos));
			reverseString(str,pos-1);
		}
	}

}
