package programs;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountNoOfWords {

	public static void main(String[] args) {
		
		String str = "Welcome to chota nagpur and chota nagpur Welcome you";
		List<String> l = Arrays.asList(str.split(" "));
		Map<String, Long> mp = l.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(mp);
		
	}
}
