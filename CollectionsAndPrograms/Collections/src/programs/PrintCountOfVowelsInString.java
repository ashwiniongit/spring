package programs;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// using Java8 streams
public class PrintCountOfVowelsInString {

	public static void main(String[] args) {

		String str = "teachermadam hello how are you?";
		// NOTE : from chars() we got intStream and 'a'\'e' etc will also convert to their ascii value,
		// due to this reason we are able to compare them.
		Long count = str.chars().filter(x->(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'))
					.count();
		System.out.println("The count is= "+count);
		
	}
}
