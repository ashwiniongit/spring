package programs;

import java.util.*;
import java.util.stream.Collectors;

public class PrintDuplicateIntegers {

	public static void main(String[] args) {
		
		List<Integer> l = List.of(10,20,15,10,45,60,45,85);
		Set<Integer> s = new HashSet<>();
		l.stream().filter(x->s.add(x)).collect(Collectors.toSet());		
		System.out.println(s);
	}

}
