package programs;
import java.util.*;

public class CheckIsogramOrNot {

	public static void main(String[] args) {
		
		String str = "geeks";
		Set<Character> hs = new HashSet<>();
		char[] ch = str.toCharArray();
		for(char c : ch) {
			if(hs.contains(c)) {
				System.out.println(false);
			}else {
				hs.add(c);
			}
		}
	}
}
