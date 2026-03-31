package programs;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// using Java8 streams
public class PrintNoOfEachCharInString2 {

	public static void main(String[] args) {

		String str = "teachermadam hello how are you?";
		//str = str.replaceAll("\\s", ""); -> this is used to remove all the whitespaces from a given string
		List<String> l = Arrays.asList(str.split(" "));

		Map<Character, Long> mp = l.stream() //Stream<String>
				.flatMap(a -> a.chars().mapToObj(c -> (char) c)) // Stream<Character>
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(mp);
		
		str = str.replaceAll("\\s", "");
		Stream.of(str).forEach(x->System.out.println(x+" "));
		
	}

}
