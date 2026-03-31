package programs;
import java.util.*;

public class PrintDuplicateWordsUsingGrpBy {

	public static void main(String[] args) {
		
		Map<String,Integer> mp = new HashMap<>();
		mp.put("code", 2);
		mp.put("decode", 1);
		mp.put("radhe", 3);
		mp.put("shyama", 1);
		
		System.out.println(mp.entrySet());
		
		mp.entrySet().stream().filter(x->(x.getValue()>1)).forEach(x->System.out.println(x));

	}

}
