package programs;

public class ReverseString {

	public static void main(String[] args) {

		String str = "teachermadam";
		char[] ch = str.toCharArray();
		StringBuffer sb = new StringBuffer("");
		
		for(int i=ch.length-1;i>=0;i--)
		{
			sb.append(ch[i]);
		}
		System.out.println(sb);
	}

}
