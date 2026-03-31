package programs;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// PRACTICE : using Java8 streams
public class PrintNoOfEachCharInString3 {

	public static void main(String[] args) {

		String str = "teachermadam hello how are you?";
		// 1st approach : When we hv list of Strings then we hv to 1st get those List of strings on
		// the same level using flatMap()
		List<String> l = Arrays.asList(str.split(" "));
		Map<Character,Long> mp = l.stream().flatMap(x -> x.chars()
						.mapToObj(a -> (char)a))
						.collect(Collectors.groupingBy(x -> x,Collectors.counting()));
		System.out.println("Output of 1st approach = "+mp);
		// 2nd approach/soln
		System.out.println("string is before = "+str);
		str = str.replaceAll("\\s", ""); // to remove all the whitespaces from the given string we can use this code
		System.out.println("string is after = "+str);
		mp = str.chars().mapToObj(a -> (char)a).collect(Collectors.groupingBy(x -> x,Collectors.counting()));
		System.out.println("Output of 2nd approach = "+mp);
	}

}
