package programs;
import java.util.*;

// using map and for loop
public class PrintNoOfEachCharInString {

	public static void main(String[] args) {

		String str = "teachermadam hello";
		Map<Character,Integer> mp = new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) != ' ') {
				if(mp.containsKey(str.charAt(i))) {
					mp.put(str.charAt(i),mp.get(str.charAt(i))+1);
				}else {
					mp.put(str.charAt(i), 1);
				}
			}
		}
		System.out.println(mp);
		
	}

}
