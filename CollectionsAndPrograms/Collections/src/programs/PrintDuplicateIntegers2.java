package programs;

import java.util.*;
import java.util.stream.Collectors;

public class PrintDuplicateIntegers2 {

	public static void main(String[] args) {
		
		List<Integer> l = List.of(10,20,15,10,45,60,45,85);
		Set<Integer> s = new HashSet<>();
		l.stream().filter(x->!s.add(x)).collect(Collectors.toSet()).forEach((x->System.out.println(x)));
		
	}
}
